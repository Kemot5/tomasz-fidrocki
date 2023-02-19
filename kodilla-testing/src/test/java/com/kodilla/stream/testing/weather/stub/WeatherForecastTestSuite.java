package com.kodilla.stream.testing.weather.stub;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)

class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;

    @BeforeEach
    public void beforeEachTest() {

        Temperatures temperaturesMock;

    }

    private Temperatures getTemperaturesMock;

    @Test
    void testCalculateForecastWithStub() {
        //Given

        Map<String, Double> temperaturesMap = new HashMap<>();

        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        temperaturesMap.put("Gdanskq", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quanityofSensor = weatherForecast.calculateForecast().size();
        int expectedSize= 6;

        //Then
        assertEquals(expectedSize, quanityofSensor);
    }

    @Test
    void testCalculateForecastAvrege() {
        //Given
        double temp1 = 10;
        double temp2 = 20;
        double temp3 = 0;
        double temp4 = 10;
        double temp5 = 10;

        Map<String, Double> temperaturesMap1 = new HashMap<>();

        temperaturesMap1.put("Rzeszow", temp1);
        temperaturesMap1.put("Krakow", temp2);
        temperaturesMap1.put("Wroclaw", temp3);
        temperaturesMap1.put("Warszawa", temp4);
        temperaturesMap1.put("Gdansk", temp5);

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap1);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double result = weatherForecast.averegeTemperature();
        double expectResult = ((temp1 + temp2 + temp3 + temp4 + temp5) / 5);
        //Then
        assertEquals(expectResult, result);
    }

    @Test
    void testMediana() {
        //Given

        double temp1 = 3;
        double temp2 = 6;
        double temp3 = 5;
        double temp4 = 3;
        double temp5 = 4;
        List<Double> medianaList = Arrays.asList(temp1, temp2, temp3, temp4, temp5);
        Collections.sort(medianaList);
        Double median;
        if (medianaList.size() % 2 == 0) {
            median = ((Double) medianaList.get(medianaList.size() / 2) + (Double) medianaList.get(medianaList.size() / 2 - 1) / 2);
        } else {
            median = (Double) medianaList.get(medianaList.size() / 2);
        }


        Map<String, Double> temperaturesMap1 = new HashMap<>();

        temperaturesMap1.put("Rzeszow", temp1);
        temperaturesMap1.put("Krakow", temp2);
        temperaturesMap1.put("Wroclaw", temp3);
        temperaturesMap1.put("Warszawa", temp4);
        temperaturesMap1.put("Gdansk", temp5);

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap1);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        Double result = weatherForecast.medianaTemperature();
        Double expectedResult = median;
        System.out.println(expectedResult);
        System.out.println(result);
        assertEquals(expectedResult, result);

    }
}


