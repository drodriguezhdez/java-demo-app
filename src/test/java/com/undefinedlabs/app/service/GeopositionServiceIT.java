package com.undefinedlabs.app.service;

import com.undefinedlabs.app.model.Geoposition;
import com.undefinedlabs.app.model.Restaurant;
import com.undefinedlabs.app.service.GeopositionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

/*@RunWith(SpringRunner.class)*/
public class GeopositionServiceIT {
/*
    @TestConfiguration
    static class GeopositionServiceTestConfiguration {

        @Bean
        public GeopositionService geopositionService() {
            return new GeopositionService();
        }

    }

    @Autowired
    private GeopositionService sut;

    @Test
    public void should_invoke_maps_api() {
        //Given
        final Restaurant restaurant = mock(Restaurant.class);

        //When
        final Geoposition geoposition = this.sut.getGeoposition(restaurant);

        //Then
        assertThat(geoposition.getLatitude()).isNotEqualTo("0");
        assertThat(geoposition.getLongitude()).isNotEqualTo("0");
    }*/

}