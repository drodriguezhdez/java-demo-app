package com.undefinedlabs.app.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.undefinedlabs.app.model.Geoposition;
import org.junit.Test;

import java.io.IOException;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(BlockJUnit4ClassRunner.class)
public class GeopositionTest {

    private static final String SAMPLE_LATITUDE = "40.7615065";
    private static final String SAMPLE_LONGITUDE = "-73.9869037";

    @Test
    public void should_unmarshal_into_object() throws IOException {
        //Given
        final ObjectMapper objectMapper = new ObjectMapper();

        //When
        final Geoposition result = objectMapper.readValue(getClass().getClassLoader().getResourceAsStream("geoposition/example.json"), Geoposition.class);

        //Then
        assertThat(result.getLatitude()).isEqualTo(SAMPLE_LATITUDE);
        assertThat(result.getLongitude()).isEqualTo(SAMPLE_LONGITUDE);
    }

}