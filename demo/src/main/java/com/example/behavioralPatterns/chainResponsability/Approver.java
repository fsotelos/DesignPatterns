package com.example.behavioralPatterns.chainResponsability;

public interface Approver {
    void setNextApprover(Approver nextApprover);
    void processRequest(PurchaseRequest request);
}
