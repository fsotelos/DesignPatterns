package com.example.creationalPatterns.factoryMethod;

public class ConcreteCreatorStellaArtois implements ICreatorBeer {
    @Override
    public IProduct FactoryBeerMethod() {
        return new ConcreteBeerStellaArtois();
    }
}
