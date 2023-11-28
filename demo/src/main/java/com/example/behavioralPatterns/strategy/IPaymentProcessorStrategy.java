package com.example.behavioralPatterns.strategy;

public interface IPaymentProcessorStrategy {
    double calculateFee(double amount);
}
