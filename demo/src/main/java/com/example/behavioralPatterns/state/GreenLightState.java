package com.example.behavioralPatterns.state;

public class GreenLightState implements State {

    private final TrafficLight _trafficLight;    

    public GreenLightState(TrafficLight trafficLight){
        _trafficLight = trafficLight;
    }

        @Override
    public void performAction() {
        System.out.println("Green Light!: Advance!");
        _trafficLight.setState(new RedLightState(_trafficLight));
    }
    
}
