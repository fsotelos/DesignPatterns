package com.example.abstractFactory;

public interface AbstractGameFactory {
    public Board createBoard();
    public Pice[] createPices();
    public Rules createRules();
}
