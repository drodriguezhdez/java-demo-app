package com.undefinedlabs.app.repository;

import com.undefinedlabs.app.model.Restaurant;
import com.undefinedlabs.app.repository.RestaurantRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.ConstraintViolationException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

@RunWith(SpringRunner.class)
@TestPropertySource(locations = "classpath:application-test.properties")
@DataJpaTest
public class RestaurantRepositoryIT {
   private static final String SAMPLE_NAME = "sampleName";
    private static final String SAMPLE_DESCRIPTION = "sampleDescription";
    private static final String SAMPLE_LATITUDE = "sampleLatitude";
    private static final String SAMPLE_LONGITUDE = "sampleLongitude";
    private static final String SAMPLE_VERY_LONG_NAME = "anotherSampleNameanotherSampleNameanotherSampleNameanotherSampleNameanotherSampleName";

    private void assertRestaurant(Restaurant restaurant) {
        assertThat(restaurant.getId()).isNotNull();
        assertThat(restaurant.getName()).isEqualTo(SAMPLE_NAME);
        assertThat(restaurant.getDescription()).isEqualTo(SAMPLE_DESCRIPTION);
        assertThat(restaurant.getLatitude()).isEqualTo(SAMPLE_LATITUDE);
        assertThat(restaurant.getLongitude()).isEqualTo(SAMPLE_LONGITUDE);
    }

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private RestaurantRepository sut;

    @Test
    public void should_return_restaurant_when_find_by_id() {
        //Given
        final Restaurant restaurant = new Restaurant(SAMPLE_NAME, SAMPLE_DESCRIPTION, SAMPLE_LATITUDE, SAMPLE_LONGITUDE);
        final Restaurant persisted = entityManager.persist(restaurant);
        entityManager.flush();

        //When
        final Optional<Restaurant> found = this.sut.findById(persisted.getId());

        //Then
        assertThat(found.isPresent()).isTrue();
        assertRestaurant(found.get());
    }

    /*
    @Test(expected = InvalidDataAccessApiUsageException.class)
    public void should_throw_exception_when_find_by_null_id() {
        //Given
        final Restaurant restaurant = new Restaurant(SAMPLE_NAME, SAMPLE_DESCRIPTION, SAMPLE_LATITUDE, SAMPLE_LONGITUDE);
        entityManager.persist(restaurant);
        entityManager.flush();

        //When
        final Optional<Restaurant> found = this.sut.findById(null);

        //Then
        fail("Should throw exception");

    }

    @Test
    public void should_return_all_restaurants() {
        //Given
        final Restaurant restaurantOne = new Restaurant(SAMPLE_NAME, SAMPLE_DESCRIPTION, SAMPLE_LATITUDE, SAMPLE_LONGITUDE);
        this.entityManager.persist(restaurantOne);

        final Restaurant restaurantTwo = new Restaurant(SAMPLE_NAME, SAMPLE_DESCRIPTION, SAMPLE_LATITUDE, SAMPLE_LONGITUDE);
        this.entityManager.persist(restaurantTwo);
        this.entityManager.flush();

        //When
        final List<Restaurant> found = this.sut.findAll();

        //Then
        assertThat(found.size()).isEqualTo(2);

        for (final Restaurant r : found) {
            assertRestaurant(r);
        }
    }

    @Test
    public void should_return_restaurant_when_find_by_name_contains() {
        //Given
        final Restaurant restaurant = new Restaurant(SAMPLE_NAME, SAMPLE_DESCRIPTION, SAMPLE_LATITUDE, SAMPLE_LONGITUDE);
        this.entityManager.persist(restaurant);
        this.entityManager.flush();

        //When
        final List<Restaurant> found = this.sut.findByNameContains("sample");

        //Then
        assertThat(found.size()).isEqualTo(1);

        for (final Restaurant r : found) {
            assertRestaurant(r);
        }
    }

    @Test(expected = InvalidDataAccessApiUsageException.class)
    public void should_throw_exception_when_find_by_null_name() {
        //Given
        final Restaurant restaurant = new Restaurant(SAMPLE_NAME, SAMPLE_DESCRIPTION, SAMPLE_LATITUDE, SAMPLE_LONGITUDE);
        this.entityManager.persist(restaurant);
        this.entityManager.flush();

        //When
        final List<Restaurant> found = this.sut.findByNameContains(null);

        //Then
        fail("Should throw exception");
    }

    @Test
    public void should_save_restaurant() {
        //Given
        final Restaurant restaurant = new Restaurant(SAMPLE_NAME, SAMPLE_DESCRIPTION, SAMPLE_LATITUDE, SAMPLE_LONGITUDE);

        //When
        final Restaurant persisted = this.sut.save(restaurant);
        final Restaurant found = this.entityManager.find(Restaurant.class, persisted.getId());

        //Then
        assertRestaurant(persisted);
        assertRestaurant(found);
        assertThat(persisted).isEqualTo(found);
    }

    @Test(expected = DataIntegrityViolationException.class)
    public void should_throw_exception_if_save_restaurant_with_very_long_name() {
        //Given
        final Restaurant restaurant = new Restaurant(SAMPLE_VERY_LONG_NAME, SAMPLE_DESCRIPTION, SAMPLE_LATITUDE, SAMPLE_LONGITUDE);

        //When
        final Restaurant persisted = this.sut.saveAndFlush(restaurant);

        //Then
        fail("Should throw exception");
    }

    @Test(expected = ConstraintViolationException.class)
    public void should_throw_exception_on_save_restaurant_without_name() {
        //Given
        final Restaurant restaurant = new Restaurant();

        //When
        final Restaurant persisted = this.sut.saveAndFlush(restaurant);

        //Then
        fail("Should throw exception");

    }

    @Test
    public void should_delete_restaurant() {
        //Given
        final Restaurant restaurant = new Restaurant(SAMPLE_NAME, SAMPLE_DESCRIPTION, SAMPLE_LATITUDE, SAMPLE_LONGITUDE);
        final Restaurant persisted = this.entityManager.persist(restaurant);
        this.entityManager.flush();

        //When
        this.sut.deleteById(persisted.getId());

        //Then
        //Should not throw exception
    }

    @Test(expected = EmptyResultDataAccessException.class)
    public void should_throw_EmptyResultDataAccessException_on_delete_restaurant() {
        //Given

        //When
        this.sut.deleteById(UUID.randomUUID());

        //Then
        fail("should throw exception");
    }


*/
}
