package com.example.behavioralPatterns.observer;

public class TemperatureDisplay implements IObserver{
    @Override
    public void update(double temperature) {
        System.out.println("Temperature display: "+ temperature + " degrees Celsius");
    }
}
