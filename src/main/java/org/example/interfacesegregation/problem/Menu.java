package org.example.interfacesegregation.problem;

import jdk.jshell.spi.ExecutionControl;

public interface Menu {

    void orderPotatoes(int quantity) throws ExecutionControl.NotImplementedException;
    void orderBurger(int quantity) throws ExecutionControl.NotImplementedException;
    void orderPizza(int quantity) throws ExecutionControl.NotImplementedException;
}
