package com.example.behavioralPatterns.observer;

public class PhoneApp implements IObserver{

    @Override
    public void update(double temperature) {
        System.out.println("Phone App Temperature Notification :" + temperature + " degrees Celsius");
    }
    
}
