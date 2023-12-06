package com.example.behavioralPatterns.state;

public class RedLightState implements State {

    private final TrafficLight _trafficLight;    

    public RedLightState(TrafficLight trafficLight){
        _trafficLight = trafficLight;
    }

    @Override
    public void performAction() {
        System.out.println("Red Light!: Stop!");
        _trafficLight.setState(new YellowLightState(_trafficLight));
    }
    
}
