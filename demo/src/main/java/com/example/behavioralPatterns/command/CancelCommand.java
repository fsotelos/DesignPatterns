package com.example.behavioralPatterns.command;

public class CancelCommand implements ICommand {

    private Order _order;
    public CancelCommand(Order order)
    {
        this._order = order;
    }
    @Override
    public void execute() {
        this._order.cancelOrder();
    }
}
