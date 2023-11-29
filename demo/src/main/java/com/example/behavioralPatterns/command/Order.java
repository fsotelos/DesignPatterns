package com.example.behavioralPatterns.command;

public class Order {
    private int id = 0;
    private Boolean shipped = false;
    public Order(int idOrder){
        this.id = idOrder;
    }
    public void shipOrder()
    {
        this.shipped = true;
        System.out.println("The order # " + this.id + " was shipped");
    }

    public void cancelOrder(){
        System.out.println("The order # " + this.id + " was canceled");
    }
}
