package com.example.behavioralPatterns.strategy;

public class StripePaymentStrategy implements IPaymentProcessorStrategy {

    @Override
    public double calculateFee(double amount) {
        return amount * 0.02;
    }
    
}
