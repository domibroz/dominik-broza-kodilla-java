package com.kodilla.testing.weather.stub;

import java.util.HashMap;

public class TemperaturesStub implements Temperatures {
    @Override
    public HashMap<Integer, Double> getTemperatures() {
        HashMap<Integer, Double> stubResult = new HashMap<>();

        //dummy data
        stubResult.put(0, 25.5);
        stubResult.put(1, 26.2);
        stubResult.put(2, 34.4);
        stubResult.put(3, 23.3);
        stubResult.put(4, 12.3);
        return stubResult;
    }
}
