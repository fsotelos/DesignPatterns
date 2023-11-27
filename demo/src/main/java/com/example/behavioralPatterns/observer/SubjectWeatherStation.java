package com.example.behavioralPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectWeatherStation{

    private List<IObserver> observers = new ArrayList<IObserver>();
    private double temperature = 0.0;
    public SubjectWeatherStation(){

    }

    public void Attach(IObserver observer){
        observers.add(observer);
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
    
    public void notifyObservers(){
        for (IObserver iObserver : observers) {
            iObserver.update(this.temperature);
        }
    }
}