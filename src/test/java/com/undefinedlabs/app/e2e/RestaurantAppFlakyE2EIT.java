package com.undefinedlabs.app.e2e;

import com.undefinedlabs.app.Application;
import com.undefinedlabs.app.model.Restaurant;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

/*@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(locations = "classpath:application-test.properties")*/
public class RestaurantAppFlakyE2EIT {
/*
    @LocalServerPort
    private int randomServerPort;

    @Test
    public void demotest_flaky_test01_get_restaurant() {
        //Given
        final RestTemplate restTemplate = new RestTemplate();

        //When
        final Restaurant restaurant = restTemplate.getForObject("http://localhost:" + randomServerPort + "/restaurants/"+Restaurant.FLAKY_RESTAURANT_ID, Restaurant.class);

        //Then
        assertThat(restaurant).isEqualTo(Restaurant.DUMMY);
    }

    @Test
    public void demotest_flaky_test02_get_restaurant() {
        //Given
        final RestTemplate restTemplate = new RestTemplate();

        //When
        final Restaurant restaurant = restTemplate.getForObject("http://localhost:" + randomServerPort + "/restaurants/"+Restaurant.FLAKY_RESTAURANT_ID, Restaurant.class);

        //Then
        assertThat(restaurant).isEqualTo(Restaurant.DUMMY);
    }

    @Test
    public void demotest_flaky_test03_get_restaurant() {
        //Given
        final RestTemplate restTemplate = new RestTemplate();

        //When
        final Restaurant restaurant = restTemplate.getForObject("http://localhost:" + randomServerPort + "/restaurants/"+Restaurant.FLAKY_RESTAURANT_ID, Restaurant.class);

        //Then
        assertThat(restaurant).isEqualTo(Restaurant.DUMMY);
    }

    @Test
    public void flaky_test04_get_restaurant() {
        //Given
        final RestTemplate restTemplate = new RestTemplate();

        //When
        final Restaurant restaurant = restTemplate.getForObject("http://localhost:" + randomServerPort + "/restaurants/"+Restaurant.FLAKY_RESTAURANT_ID, Restaurant.class);

        //Then
        assertThat(restaurant).isEqualTo(Restaurant.DUMMY);
    }

    @Test
    public void flaky_test05_get_restaurant() {
        //Given
        final RestTemplate restTemplate = new RestTemplate();

        //When
        final Restaurant restaurant = restTemplate.getForObject("http://localhost:" + randomServerPort + "/restaurants/"+Restaurant.FLAKY_RESTAURANT_ID, Restaurant.class);

        //Then
        assertThat(restaurant).isEqualTo(Restaurant.DUMMY);
    }

    @Test
    public void flaky_test06_get_restaurant() {
        //Given
        final RestTemplate restTemplate = new RestTemplate();

        //When
        final Restaurant restaurant = restTemplate.getForObject("http://localhost:" + randomServerPort + "/restaurants/"+Restaurant.FLAKY_RESTAURANT_ID, Restaurant.class);

        //Then
        assertThat(restaurant).isEqualTo(Restaurant.DUMMY);
    }

    @Test
    public void flaky_test07_get_restaurant() {
        //Given
        final RestTemplate restTemplate = new RestTemplate();

        //When
        final Restaurant restaurant = restTemplate.getForObject("http://localhost:" + randomServerPort + "/restaurants/"+Restaurant.FLAKY_RESTAURANT_ID, Restaurant.class);

        //Then
        assertThat(restaurant).isEqualTo(Restaurant.DUMMY);
    }

    @Test
    public void flaky_test08_get_restaurant() {
        //Given
        final RestTemplate restTemplate = new RestTemplate();

        //When
        final Restaurant restaurant = restTemplate.getForObject("http://localhost:" + randomServerPort + "/restaurants/"+Restaurant.FLAKY_RESTAURANT_ID, Restaurant.class);

        //Then
        assertThat(restaurant).isEqualTo(Restaurant.DUMMY);
    }*/

}