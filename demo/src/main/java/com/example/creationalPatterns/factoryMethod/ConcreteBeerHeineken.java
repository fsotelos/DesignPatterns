package com.example.creationalPatterns.factoryMethod;

public class ConcreteBeerHeineken implements IProduct {
   @Override
   public void Create(){
        System.out.println("Fabricar cerveza Heineken");
   } 
}
