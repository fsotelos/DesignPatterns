package com.example.creationalPatterns.builder;


 public class CarBuilder {
        private Car car;
        public CarBuilder(String make, String model, int year){
            car = new Car();
            car.make = make;
            car.model = model;
            car.year = year;
        }

        public CarBuilder setColor(String color)
        {
            car.color = color;
            return this;
        }

        public CarBuilder setHorsePower(int horsePower)
        {
            car.horsePower = horsePower;
            return this;
        }

        public Car build(){
            return car;
        }
    }