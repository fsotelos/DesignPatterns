package com.example.creationalPatterns.factoryMethod;

public class ConcreteCreatorHeineken implements ICreatorBeer {

    @Override
    public IProduct FactoryBeerMethod() {
        return new ConcreteBeerHeineken();
    }
    
}
