package com.undefinedlabs.app.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.undefinedlabs.app.Application;
import com.undefinedlabs.app.model.Restaurant;
import com.undefinedlabs.app.repository.RestaurantRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/*@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@AutoConfigureMockMvc
@TestPropertySource(locations = "classpath:application-test.properties")*/
public class RestaurantControllerIT {
/*

    private static final String SAMPLE_NAME = "sampleName";
    private static final String SAMPLE_DESCRIPTION = "sampleDescription";
    private static final String SAMPLE_LATITUDE = "sampleLatitude";
    private static final String SAMPLE_LONGITUDE = "sampleLongitude";
    private static final String ANOTHER_SAMPLE_NAME = "anotherSampleName";
    private static final String ANOTHER_SAMPLE_DESCRIPTION = "anotherSampleDescription";


    @Autowired
    private MockMvc mvc;

    @Autowired
    private RestaurantRepository repository;

    @Before
    public void setup() {
        this.repository.deleteAll();
    }

    @Test
    public void should_return_all_restaurants() throws Exception {
        //Given
        final Restaurant restaurant = new Restaurant(SAMPLE_NAME, SAMPLE_DESCRIPTION, SAMPLE_LATITUDE, SAMPLE_LONGITUDE);
        this.repository.save(restaurant);

        //When
        mvc.perform(get("/restaurants")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[0].id", is(restaurant.getId().toString())))
                .andExpect(jsonPath("$[0].name", is(SAMPLE_NAME)))
                .andExpect(jsonPath("$[0].description", is(SAMPLE_DESCRIPTION)))
                .andExpect(jsonPath("$[0].latitude", is(SAMPLE_LATITUDE)))
                .andExpect(jsonPath("$[0].longitude", is(SAMPLE_LONGITUDE)))
        ;

    }

    @Test
    public void should_return_restaurant_by_id() throws Exception {
        //Given
        final Restaurant restaurant = new Restaurant(SAMPLE_NAME, SAMPLE_DESCRIPTION, SAMPLE_LATITUDE, SAMPLE_LONGITUDE);
        this.repository.save(restaurant);

        //When
        mvc.perform(get("/restaurants/" + restaurant.getId().toString())
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.id", is(restaurant.getId().toString())))
                .andExpect(jsonPath("$.name", is(SAMPLE_NAME)))
                .andExpect(jsonPath("$.description", is(SAMPLE_DESCRIPTION)))
                .andExpect(jsonPath("$.latitude", is(SAMPLE_LATITUDE)))
                .andExpect(jsonPath("$.longitude", is(SAMPLE_LONGITUDE)))
        ;
    }

    @Test
    public void should_return_restaurant_by_name() throws Exception {
        //Given
        final Restaurant restaurant = new Restaurant(SAMPLE_NAME, SAMPLE_DESCRIPTION, SAMPLE_LATITUDE, SAMPLE_LONGITUDE);
        this.repository.save(restaurant);

        //When
        mvc.perform(get("/restaurants/?name=sample")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[0].id", is(restaurant.getId().toString())))
                .andExpect(jsonPath("$[0].name", is(SAMPLE_NAME)))
                .andExpect(jsonPath("$[0].description", is(SAMPLE_DESCRIPTION)))
                .andExpect(jsonPath("$[0].latitude", is(SAMPLE_LATITUDE)))
                .andExpect(jsonPath("$[0].longitude", is(SAMPLE_LONGITUDE)))
        ;
    }

    @Test
    public void should_return_bad_request_on_get_with_invalid_uuid() throws Exception {
        //Given

        //When
        mvc.perform(get("/restaurants/not-valid-uuid").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest())
        ;
    }

    @Test
    public void should_create_restaurant() throws Exception {
        //Given
        final Restaurant restaurant = new Restaurant(SAMPLE_NAME, SAMPLE_DESCRIPTION, SAMPLE_LATITUDE, SAMPLE_LONGITUDE);
        final ObjectMapper objectMapper = new ObjectMapper();
        final String json = objectMapper.writeValueAsString(restaurant);

        //When
        mvc.perform(post("/restaurants")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json))
                .andExpect(status().isCreated())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.id", is(notNullValue())))
                .andExpect(jsonPath("$.name", is(SAMPLE_NAME)))
                .andExpect(jsonPath("$.description", is(SAMPLE_DESCRIPTION)))
                .andExpect(jsonPath("$.latitude", is(SAMPLE_LATITUDE)))
                .andExpect(jsonPath("$.longitude", is(SAMPLE_LONGITUDE))

                );

        final List<Restaurant> found = this.repository.findAll();
        assertThat(found.size()).isEqualTo(1);

        for (final Restaurant r : found) {
            assertRestaurant(r);
        }
    }

    @Test
    public void should_return_bad_request_on_malformed_json() throws Exception {
        //Given

        //When
        mvc.perform(post("/restaurants")
                .contentType(MediaType.APPLICATION_JSON)
                .content("malformed-json"))
                .andExpect(status().isBadRequest());
    }

    @Test
    public void should_update_restaurant() throws Exception {
        //Given
        final Restaurant restaurant = new Restaurant(SAMPLE_NAME, SAMPLE_DESCRIPTION, SAMPLE_LATITUDE, SAMPLE_LONGITUDE);
        final Restaurant persisted = this.repository.save(restaurant);

        final Restaurant anotherRestaurant = new Restaurant(ANOTHER_SAMPLE_NAME, ANOTHER_SAMPLE_DESCRIPTION, SAMPLE_LATITUDE, SAMPLE_LONGITUDE);
        final ObjectMapper objectMapper = new ObjectMapper();
        final String json = objectMapper.writeValueAsString(anotherRestaurant);

        //When
        mvc.perform(patch("/restaurants/" + persisted.getId().toString())
                .contentType(MediaType.APPLICATION_JSON)
                .content(json))
                .andExpect(status().isOk())
        ;

        final Optional<Restaurant> found = this.repository.findById(persisted.getId());
        assertThat(found.isPresent()).isTrue();
        assertThat(found.get().getId()).isNotNull();
        assertThat(found.get().getName()).isEqualTo(ANOTHER_SAMPLE_NAME);
        assertThat(found.get().getDescription()).isEqualTo(ANOTHER_SAMPLE_DESCRIPTION);
        assertThat(found.get().getLatitude()).isEqualTo(SAMPLE_LATITUDE);
        assertThat(found.get().getLongitude()).isEqualTo(SAMPLE_LONGITUDE);
    }

    @Test
    public void should_return_bad_request_on_patch_if_id_is_malformed_uuid() throws Exception {
        //Given
        final Restaurant restaurant = new Restaurant(SAMPLE_NAME, SAMPLE_DESCRIPTION, SAMPLE_LATITUDE, SAMPLE_LONGITUDE);
        final Restaurant persisted = this.repository.save(restaurant);

        final Restaurant anotherRestaurant = new Restaurant(ANOTHER_SAMPLE_NAME, ANOTHER_SAMPLE_DESCRIPTION, SAMPLE_LATITUDE, SAMPLE_LONGITUDE);
        final ObjectMapper objectMapper = new ObjectMapper();
        final String json = objectMapper.writeValueAsString(anotherRestaurant);

        //When
        mvc.perform(patch("/restaurants/malformed-uuid")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json))
                .andExpect(status().isBadRequest())
        ;
    }

    @Test
    public void should_return_bad_request_on_patch_if_restaurant_is_malformed_uuid() throws Exception {
        //Given
        final Restaurant restaurant = new Restaurant(SAMPLE_NAME, SAMPLE_DESCRIPTION, SAMPLE_LATITUDE, SAMPLE_LONGITUDE);
        final Restaurant persisted = this.repository.save(restaurant);

        //When
        mvc.perform(patch("/restaurants/" + persisted.getId().toString())
                .contentType(MediaType.APPLICATION_JSON)
                .content("malformed-json"))
                .andExpect(status().isBadRequest())
        ;
    }

    @Test
    public void should_delete_restaurant() throws Exception {
        //Given
        final Restaurant restaurant = new Restaurant(SAMPLE_NAME, SAMPLE_DESCRIPTION, SAMPLE_LATITUDE, SAMPLE_LONGITUDE);
        final Restaurant persisted = this.repository.save(restaurant);

        //When
        mvc.perform(delete("/restaurants/" + persisted.getId().toString())
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

        final Optional<Restaurant> found = this.repository.findById(restaurant.getId());
        assertThat(found.isPresent()).isFalse();
    }

    @Test
    public void should_return_bad_request_on_delete_if_uuid_is_malformed() throws Exception {
        //Given

        //When
        mvc.perform(delete("/restaurants/malformed-uuid")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest());

    }

    @Test
    public void should_return_gone_on_delete_if_restaurant_is_already_deleted() throws Exception {
        //Given

        //When
        mvc.perform(delete("/restaurants/a1e96698-c69e-4cfe-ad8b-5520fbc0ba91")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isGone());

    }

    private void assertRestaurant(Restaurant restaurant) {
        assertThat(restaurant.getId()).isNotNull();
        assertThat(restaurant.getName()).isEqualTo(SAMPLE_NAME);
        assertThat(restaurant.getDescription()).isEqualTo(SAMPLE_DESCRIPTION);
        assertThat(restaurant.getLatitude()).isEqualTo(SAMPLE_LATITUDE);
        assertThat(restaurant.getLongitude()).isEqualTo(SAMPLE_LONGITUDE);
    }
*/

}
