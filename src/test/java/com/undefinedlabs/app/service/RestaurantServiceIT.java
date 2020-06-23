package com.undefinedlabs.app.service;

import com.undefinedlabs.app.exception.RestaurantNotFoundException;
import com.undefinedlabs.app.exception.WrongArgumentException;
import com.undefinedlabs.app.model.Geoposition;
import com.undefinedlabs.app.model.Restaurant;
import com.undefinedlabs.app.repository.RestaurantRepository;
import com.undefinedlabs.app.service.GeopositionService;
import com.undefinedlabs.app.service.RestaurantService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

/*@RunWith(SpringRunner.class)*/
public class RestaurantServiceIT {
/*
    private static final String SAMPLE_NAME = "sampleName";
    private static final String ANOTHER_SAMPLE_NAME = "anotherSampleName";
    private static final UUID SAMPLE_UUID = UUID.randomUUID();
    private static final UUID ANOTHER_SAMPLE_UUID = UUID.randomUUID();
    private static final Restaurant SAMPLE_RESTAURANT = mock(Restaurant.class);
    private static final Geoposition SAMPLE_GEOPOSITION = new Geoposition("123", "456");

    @TestConfiguration
    static class RestaurantServiceTestConfiguration {

        @MockBean
        public RestaurantRepository repository;

        @MockBean
        public GeopositionService geopositionService;

        @Bean
        public RestaurantService restaurantService() {
            return new RestaurantService(repository, geopositionService);
        }

    }

    @Autowired
    private RestaurantRepository repository;

    @Autowired
    private GeopositionService geopositionService;

    @Autowired
    private RestaurantService sut;

    @Before
    public void setup() {
        when(this.repository.findAll()).thenReturn(Collections.singletonList(SAMPLE_RESTAURANT));
        when(this.repository.findById(eq(SAMPLE_UUID))).thenReturn(Optional.of(SAMPLE_RESTAURANT));
        when(this.repository.findByNameContains(eq(SAMPLE_NAME))).thenReturn(Collections.singletonList(SAMPLE_RESTAURANT));

        when(this.repository.save(SAMPLE_RESTAURANT)).thenReturn(SAMPLE_RESTAURANT);
        when(this.repository.getOne(SAMPLE_UUID)).thenReturn(SAMPLE_RESTAURANT);

        when(this.geopositionService.getGeoposition(any(Restaurant.class))).thenReturn(SAMPLE_GEOPOSITION);
    }

    @Test
    public void should_return_all_restaurants() {
        //Given

        //When
        final List<Restaurant> found = this.sut.getAllRestaurants();

        //Then
        assertThat(found.size()).isEqualTo(1);
        assertThat(found.get(0)).isEqualTo(SAMPLE_RESTAURANT);
    }

    @Test
    public void should_return_restaurant_by_id() {
        //Given

        //When
        final Restaurant found = this.sut.getRestaurantById(SAMPLE_UUID.toString());

        //Then
        assertThat(found).isEqualTo(SAMPLE_RESTAURANT);
    }

    @Test(expected = RestaurantNotFoundException.class)
    public void should_throw_restaurant_not_found_exception_when_restaurant_by_id_is_not_found() {
        //Given

        //When
        this.sut.getRestaurantById(ANOTHER_SAMPLE_UUID.toString());

        //Then
    }

    @Test(expected = WrongArgumentException.class)
    public void should_throw_exception_if_id_is_null() {
        //Given

        //When
        this.sut.getRestaurantById(null);

        //Then
        fail("Should throw exception");
    }

    @Test
    public void should_return_restaurants_by_name() {
        //Given

        //When
        final List<Restaurant> found = this.sut.getRestaurantsByName(SAMPLE_NAME);

        //Then
        assertThat(found.size()).isEqualTo(1);
        assertThat(found.get(0)).isEqualTo(SAMPLE_RESTAURANT);
    }

    @Test
    public void should_return_empty_list_searching_by_name() {
        //Given

        //When
        final List<Restaurant> found = this.sut.getRestaurantsByName(ANOTHER_SAMPLE_NAME);

        //Then
        assertThat(found).isEmpty();
    }


    @Test(expected = WrongArgumentException.class)
    public void should_throw_exception_if_name_is_null() {
        //Given

        //When
        this.sut.getRestaurantsByName(null);

        //Then
        fail("Should throw exception");
    }

    @Test
    public void should_create_restaurant() {
        //Given

        //When
        final Restaurant created = this.sut.createRestaurant(SAMPLE_RESTAURANT);

        //Then
        assertThat(created).isEqualTo(SAMPLE_RESTAURANT);
    }

    @Test(expected = WrongArgumentException.class)
    public void should_throw_exception_if_restaurant_is_null() {
        //Given

        //When
        final Restaurant created = this.sut.createRestaurant(null);

        //Then
        fail("Should throw exception");
    }

    @Test
    public void should_update_restaurant() {
        //Given

        //When
        final Restaurant updated = this.sut.updateRestaurant(SAMPLE_UUID.toString(), SAMPLE_RESTAURANT);

        //Then
        assertThat(updated).isEqualTo(SAMPLE_RESTAURANT);
    }

    @Test(expected = WrongArgumentException.class)
    public void should_throw_exception_if_id_is_null_on_update() {
        //Given

        //When
        final Restaurant updated = this.sut.updateRestaurant(null, SAMPLE_RESTAURANT);

        //Then
        fail("Should throw exception");
    }

    @Test(expected = WrongArgumentException.class)
    public void should_throw_exception_if_restaurant_is_null_on_update() {
        //Given

        //When
        final Restaurant updated = this.sut.updateRestaurant(SAMPLE_UUID.toString(), null);

        //Then
        fail("Should throw exception");
    }

    @Test
    public void should_delete_restaurant_by_id() {
        //Given

        //When
        this.sut.deleteRestaurant(SAMPLE_UUID.toString());

        //Then
        verify(this.repository).deleteById(SAMPLE_UUID);
    }

    @Test(expected = WrongArgumentException.class)
    public void should_throw_exception_if_id_is_null_on_delete() {
        //Given

        //When
        this.sut.deleteRestaurant(null);

        //Then
        fail("Should throw exception");
    }*/

}
