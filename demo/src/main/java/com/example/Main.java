package com.example;
import com.example.factoryMethod.ConcreteCreatorHeineken;
import com.example.factoryMethod.ConcreteCreatorStellaArtois;
import com.example.factoryMethod.ICreatorBeer;
import com.example.factoryMethod.IProduct;
import com.example.singleton.AppsConfig;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter some input
        System.out.print("Enter something: ");
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
        }
        scanner.close();
    }
}