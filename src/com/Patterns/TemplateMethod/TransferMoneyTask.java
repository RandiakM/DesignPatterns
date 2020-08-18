package com.Patterns.TemplateMethod;

public class TransferMoneyTask extends Task{

    @Override
    public void doExecute() {
        System.out.println("Transfer Money");
    }
}
