package com.undefinedlabs.app.e2e;

import com.undefinedlabs.app.Application;
import com.undefinedlabs.app.model.Restaurant;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

/*@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(locations = "classpath:application-test.properties")*/
public class RestaurantAppE2EIT {
/*
    @LocalServerPort
    private int randomServerPort;

    @Test
    public void demotest_e2e_should_create_and_get_restaurant01_integration() {
        //Given
        final RestTemplate restTemplate = new RestTemplate();

        final Restaurant restaurant = Restaurant.DUMMY;
        final HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        final HttpEntity<Restaurant> request = new HttpEntity<>(restaurant, headers);
        final Restaurant storedRestaurant = restTemplate.postForObject("http://localhost:" + randomServerPort + "/restaurants/", request, Restaurant.class);

        //When
        final Restaurant result = restTemplate.getForObject("http://localhost:" + randomServerPort + "/restaurants/"+storedRestaurant.getId(), Restaurant.class);

        //Then
        assertThat(result).isNotNull();
    }

    @Test
    public void demotest_e2e_should_create_and_get_restaurant02_integration() {
        //Given
        final RestTemplate restTemplate = new RestTemplate();

        final Restaurant restaurant = Restaurant.DUMMY;
        final HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        final HttpEntity<Restaurant> request = new HttpEntity<>(restaurant, headers);
        final Restaurant storedRestaurant = restTemplate.postForObject("http://localhost:" + randomServerPort + "/restaurants/", request, Restaurant.class);

        //When
        final Restaurant result = restTemplate.getForObject("http://localhost:" + randomServerPort + "/restaurants/"+storedRestaurant.getId(), Restaurant.class);

        //Then
        assertThat(result).isNotNull();
    }

    @Test
    public void e2e_should_create_and_get_restaurant03() {
        //Given
        final RestTemplate restTemplate = new RestTemplate();

        final Restaurant restaurant = Restaurant.DUMMY;
        final HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        final HttpEntity<Restaurant> request = new HttpEntity<>(restaurant, headers);
        final Restaurant storedRestaurant = restTemplate.postForObject("http://localhost:" + randomServerPort + "/restaurants/", request, Restaurant.class);

        //When
        final Restaurant result = restTemplate.getForObject("http://localhost:" + randomServerPort + "/restaurants/"+storedRestaurant.getId(), Restaurant.class);

        //Then
        assertThat(result).isNotNull();
    }

    @Test
    public void e2e_should_create_and_get_restaurant04() {
        //Given
        final RestTemplate restTemplate = new RestTemplate();

        final Restaurant restaurant = Restaurant.DUMMY;
        final HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        final HttpEntity<Restaurant> request = new HttpEntity<>(restaurant, headers);
        final Restaurant storedRestaurant = restTemplate.postForObject("http://localhost:" + randomServerPort + "/restaurants/", request, Restaurant.class);

        //When
        final Restaurant result = restTemplate.getForObject("http://localhost:" + randomServerPort + "/restaurants/"+storedRestaurant.getId(), Restaurant.class);

        //Then
        assertThat(result).isNotNull();
    }

    @Test
    public void e2e_should_create_and_get_restaurant05() {
        //Given
        final RestTemplate restTemplate = new RestTemplate();

        final Restaurant restaurant = Restaurant.DUMMY;
        final HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        final HttpEntity<Restaurant> request = new HttpEntity<>(restaurant, headers);
        final Restaurant storedRestaurant = restTemplate.postForObject("http://localhost:" + randomServerPort + "/restaurants/", request, Restaurant.class);

        //When
        final Restaurant result = restTemplate.getForObject("http://localhost:" + randomServerPort + "/restaurants/"+storedRestaurant.getId(), Restaurant.class);

        //Then
        assertThat(result).isNotNull();
    }*/
}
