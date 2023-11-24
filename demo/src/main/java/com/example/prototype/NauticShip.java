package com.example.prototype;

public class NauticShip implements Ship {

    private String name;
    private double price;

    public NauticShip(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
      return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public NauticShip clone() throws CloneNotSupportedException {
        return new NauticShip(name, price);
    }
}
