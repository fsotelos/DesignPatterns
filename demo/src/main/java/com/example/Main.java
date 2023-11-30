package com.example;
import com.example.behavioralPatterns.observer.IObserver;
import com.example.behavioralPatterns.observer.PhoneApp;
import com.example.behavioralPatterns.observer.SubjectWeatherStation;
import com.example.behavioralPatterns.observer.TemperatureDisplay;
import com.example.behavioralPatterns.strategy.IPaymentProcessorStrategy;
import com.example.behavioralPatterns.strategy.PaymentProcessor;
import com.example.behavioralPatterns.strategy.PaypalPaymentStrategy;
import com.example.behavioralPatterns.strategy.StripePaymentStrategy;
import com.example.creationalPatterns.abstractFactory.AbstractGameFactory;
import com.example.creationalPatterns.abstractFactory.RPGGameFacory;
import com.example.creationalPatterns.abstractFactory.StrategyGameFactory;
import com.example.creationalPatterns.builder.Car;
import com.example.creationalPatterns.builder.CarBuilder;
import com.example.creationalPatterns.factoryMethod.ConcreteCreatorHeineken;
import com.example.creationalPatterns.factoryMethod.ConcreteCreatorStellaArtois;
import com.example.creationalPatterns.factoryMethod.ICreatorBeer;
import com.example.creationalPatterns.factoryMethod.IProduct;
import com.example.creationalPatterns.prototype.BavariaShip;
import com.example.creationalPatterns.prototype.NauticShip;
import com.example.creationalPatterns.singleton.AppsConfig;
import com.example.behavioralPatterns.chainResponsability.Approver;
import com.example.behavioralPatterns.chainResponsability.Director;
import com.example.behavioralPatterns.chainResponsability.Manager;
import com.example.behavioralPatterns.chainResponsability.President;
import com.example.behavioralPatterns.chainResponsability.PurchaseRequest;
import com.example.behavioralPatterns.command.CancelCommand;
import com.example.behavioralPatterns.command.Order;
import com.example.behavioralPatterns.command.OrderInvoker;
import com.example.behavioralPatterns.command.ShipCommand;

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
        }else if (userInput.equals("observer")){
            SubjectWeatherStation weatherStation = new SubjectWeatherStation();
            IObserver observerPhone = new PhoneApp();
            IObserver observerDisplay = new TemperatureDisplay();

            weatherStation.Attach(observerDisplay);
            weatherStation.Attach(observerPhone);

            weatherStation.setTemperature(10);
        }else if(userInput.equals("strategy")){
            IPaymentProcessorStrategy payPal = new PaypalPaymentStrategy();
            IPaymentProcessorStrategy stripe = new StripePaymentStrategy();
            PaymentProcessor paymentProcessor = new PaymentProcessor();
            paymentProcessor.setPaymentStrategy(payPal);
            double resultPaypal = paymentProcessor.processPayments(200);
            System.out.println("The result of Paypal payment is : " + resultPaypal);
            paymentProcessor.setPaymentStrategy(stripe);
            double resultStripe = paymentProcessor.processPayments(112);
            System.out.println("The result of Stripe payment is : " + resultStripe);
        }else if(userInput.equals("command")){
            Order order1 = new Order(123);
            Order order2 = new Order(587);
            CancelCommand cancelCommand = new CancelCommand(order1);
            
            OrderInvoker orderInvoker = new OrderInvoker();
            orderInvoker.setCommand(cancelCommand);
            orderInvoker.processOrder();

            ShipCommand shipCommand = new ShipCommand(order2);
            orderInvoker.setCommand(shipCommand);
            orderInvoker.processOrder();
        }else if(userInput.equals("changeResponsability")){
            Approver manager = new Manager();
            Approver director = new Director();
            Approver president = new President();

            manager.setNextApprover(director);
            director.setNextApprover(president);

            // Create a purchase request
            PurchaseRequest request1 = new PurchaseRequest(1, 800);
            PurchaseRequest request2 = new PurchaseRequest(2, 3500);
            PurchaseRequest request3 = new PurchaseRequest(3, 12000);

            // Process the purchase requests
            manager.processRequest(request1);
            manager.processRequest(request2);
            manager.processRequest(request3);
        }
        scanner.close();
    }
}