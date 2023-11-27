package com.example.creationalPatterns.abstractFactory;

public class StrategyGameFactory implements AbstractGameFactory {

    @Override
    public Board createBoard() {
        System.out.println("create strategy board");
        return new Board();
    }

    @Override
    public Pice[] createPices() {
        System.out.println("create strategy pices");
        return new Pice[]{
            new Moster(),
            new Hero()
        };
    }

    @Override
    public Rules createRules() {
        System.out.println("create strategy rules");
        return new StrategyRules();
    }
    
}
