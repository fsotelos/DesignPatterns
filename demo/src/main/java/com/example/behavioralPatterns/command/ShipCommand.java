package com.example.behavioralPatterns.command;

public class ShipCommand implements ICommand {
    private Order _order;
    public ShipCommand(Order order){
        this._order = order;
    }
    @Override
    public void execute() {
        this._order.shipOrder();
    }
}
