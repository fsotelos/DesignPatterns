package com.example.behavioralPatterns.strategy;

public class PaymentProcessor {
    IPaymentProcessorStrategy _iPaymentProcessorStrategy = null;

    public void setPaymentStrategy(IPaymentProcessorStrategy iPaymentProcessorStrategy){
        this._iPaymentProcessorStrategy = iPaymentProcessorStrategy;

    }

    public double processPayments(double amount){
        double fee = this._iPaymentProcessorStrategy.calculateFee(amount);
        return amount + fee;
    }
}
