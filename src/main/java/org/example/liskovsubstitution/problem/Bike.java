package org.example.liskovsubstitution.problem;

import jdk.jshell.spi.ExecutionControl;

public class Bike implements Trans {

    public void brake() {

    }

    public void land() throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Not implemented");

    }

    public void park() {

    }

    public void speedUp() {

    }

    public void takeoff() throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Not implemented");

    }
}
