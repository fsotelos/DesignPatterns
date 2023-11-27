package com.example;
import com.example.abstractFactory.AbstractGameFactory;
import com.example.abstractFactory.RPGGameFacory;
import com.example.abstractFactory.StrategyGameFactory;
import com.example.builder.CarBuilder;
import com.example.factoryMethod.ConcreteCreatorHeineken;
import com.example.factoryMethod.ConcreteCreatorStellaArtois;
import com.example.factoryMethod.ICreatorBeer;
import com.example.factoryMethod.IProduct;
import com.example.singleton.AppsConfig;
import com.example.builder.Car;
import com.example.prototype.BavariaShip;
import com.example.prototype.NauticShip;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter some input
        System.out.print("Enter the name Pattern: ");
        // Read the input from the console
        String userInput = scanner.nextLine();

        if(userInput.equals("singleton")){
            AppsConfig appConfig = AppsConfig.getInstance();
            // Acceder a los atributos o métodos de la instancia
            System.out.println("Database URL: " + appConfig.getDatabaseUrl());
            System.out.println("API Key: " + appConfig.getApiKey());
        }else if(userInput.equals("factoryMethod")){
            ICreatorBeer creatorBeerA = new ConcreteCreatorHeineken();
            IProduct productA = creatorBeerA.FactoryBeerMethod();
            productA.Create();

            ICreatorBeer creatorBeerB = new ConcreteCreatorStellaArtois();
            IProduct productB = creatorBeerB.FactoryBeerMethod();
            productB.Create();
        }else if(userInput.equals("abstractFactory")){
            AbstractGameFactory abstractGameFactory= null;
            System.out.println("Enter 1 for create Strategy Game: ");
            System.out.println("Enter 2 for create RPG Game: ");
        // Read the input from the console
            userInput = scanner.nextLine();
            if(userInput.equals("1")){
                 abstractGameFactory = new StrategyGameFactory();
                 abstractGameFactory.createBoard();
                 abstractGameFactory.createPices();
                 abstractGameFactory.createRules();
            }else if(userInput.equals("2")){
                 abstractGameFactory = new RPGGameFacory();
                 abstractGameFactory.createBoard();
                 abstractGameFactory.createPices();
                 abstractGameFactory.createRules();
            }
        }else if(userInput.equals("builder")){
            Car car = new 
            CarBuilder("Mazda", "3", 2016)
            .setColor("red")
            .setHorsePower(2000)
            .build();
             
            System.out.println("Car: " + car.getMake() + " " + car.getModel() + " " + car.getYear());
            System.out.println("Color: " + car.getColor());
            System.out.println("Horsepower: " + car.getHorsepower());

        }else if (userInput.equals("prototype")){
            BavariaShip bavaria = new BavariaShip("Yachts Sport16", 1000.0);
            BavariaShip cloneBavaria = bavaria.clone();

            System.out.println("Name: " + cloneBavaria.getName());
            System.out.println("Price: " + cloneBavaria.getPrice());


            NauticShip nautic = new NauticShip("AB Inflatables", 2000.0);
            NauticShip cloneNautic = nautic.clone();

            System.out.println("Name: " + cloneNautic.getName());
            System.out.println("Price: " + cloneNautic.getPrice());
        }
        scanner.close();
    }
}