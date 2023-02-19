package com.kodilla.stream.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;
    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {


            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }
    public double averegeTemperature() {
        List<Double> reusltMap= new ArrayList<>();
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            reusltMap.add(temperature.getValue());
        }
        double result =0;
        for( Double temperature: reusltMap) {
            result = result + temperature;
        }
        result=  result/reusltMap.size();

        return result;

    }
    public  double medianaTemperature() {
        List<Double> reusltMap= new ArrayList<>();
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            reusltMap.add(temperature.getValue());
        }
        Collections.sort(reusltMap);
        Double median;
        if (reusltMap.size() % 2 == 0) {
            median = ((Double) reusltMap.get(reusltMap.size() / 2) + (Double) reusltMap.get(reusltMap.size() / 2 - 1) / 2);
        } else {
            median= (Double) reusltMap.get(reusltMap.size() / 2);
        }
        return median;
    }
}