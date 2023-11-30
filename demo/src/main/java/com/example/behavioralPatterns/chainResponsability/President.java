package com.example.behavioralPatterns.chainResponsability;

public class President implements Approver {
    @Override
    public void setNextApprover(Approver nextApprover) {
        // President is the highest authority, no next approver
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println("President approves purchase request #" + request.getNumber());
    }
}
