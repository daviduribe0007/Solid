package org.example.interfacesegregation.problem;

import jdk.jshell.spi.ExecutionControl;

public class Main {
    public static void main(String[] args) throws ExecutionControl.NotImplementedException {
        BurguerOrderService burguerOrderService = new BurguerOrderService();
        burguerOrderService.orderPotatoes(2);
    }
}
