package com.example.behavioralPatterns.state;

public class YellowLightState implements State {

    private final TrafficLight _trafficLight;    

    public YellowLightState(TrafficLight trafficLight){
        _trafficLight = trafficLight;
    }

        @Override
    public void performAction() {
        System.out.println("Yellow Light!: Prepare!");
        _trafficLight.setState(new GreenLightState(_trafficLight));
    }
    
}
