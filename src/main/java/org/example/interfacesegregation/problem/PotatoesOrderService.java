package org.example.interfacesegregation.problem;

import jdk.jshell.spi.ExecutionControl;

public class PotatoesOrderService implements Menu {
    @Override
    public void orderPotatoes(int quantity) {
        //Logic to implement the order a potatoes
    }

    @Override
    public void orderBurger(int quantity) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("You can't order potatoes from this service");


    }

    @Override
    public void orderPizza(int quantity) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("You can't order Pizza from this service");
    }
}
