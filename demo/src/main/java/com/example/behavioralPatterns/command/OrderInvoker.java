package com.example.behavioralPatterns.command;

public class OrderInvoker {
    private ICommand _command;

    public void setCommand(ICommand command){
        this._command = command;
    }
    public void processOrder(){
        this._command.execute();
    }
}
