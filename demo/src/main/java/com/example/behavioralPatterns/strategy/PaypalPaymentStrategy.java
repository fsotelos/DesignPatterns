package com.example.behavioralPatterns.strategy;

public class PaypalPaymentStrategy implements IPaymentProcessorStrategy {

    @Override
    public double calculateFee(double amount) {
        return amount * (0.015 + 0.3);
    }
    
}
