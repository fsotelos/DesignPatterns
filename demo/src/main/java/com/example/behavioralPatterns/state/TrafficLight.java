package com.example.behavioralPatterns.state;

public class TrafficLight {
    private State currentState;

    public TrafficLight(){
        currentState = new RedLightState(this);
    }

    public void setState(State state){
        this.currentState = state;
    }
    public void PerfomeAction(){
        this.currentState.performAction();
    }
}
