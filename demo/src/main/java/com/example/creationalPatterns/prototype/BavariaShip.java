package com.example.creationalPatterns.prototype;

public class BavariaShip implements Ship{
    private String name;
    private Double price;

    public BavariaShip(String name, Double price){
        this.name = name;
        this.price = price;
    }
    @Override
    public String getName(){
        
        return name;
    }
    @Override
    public double getPrice(){
        return this.price;
    }

    @Override
    public BavariaShip clone() throws CloneNotSupportedException {
        return new BavariaShip(name, price);
    }
}
