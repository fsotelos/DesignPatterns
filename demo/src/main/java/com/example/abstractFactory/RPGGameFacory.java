package com.example.abstractFactory;

public class RPGGameFacory implements AbstractGameFactory {

    @Override
    public Board createBoard() {
        System.out.println("create rpg game board");
        return new Board();
    }

    @Override
    public Pice[] createPices() {
        System.out.println("create rpg pices");
        return new Pice[]{
            new Moster(),
            new Hero()
        };
    }

    @Override
    public Rules createRules() {
        System.out.println("create rpg rules");
        return new RPGRules();
    }
    
}
