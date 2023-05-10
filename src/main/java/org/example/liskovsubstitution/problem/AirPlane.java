package org.example.liskovsubstitution.problem;

import jdk.jshell.spi.ExecutionControl;

public class AirPlane implements Trans {

    public void brake() throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Not implemented");
    }

    public void land() {
        //Logic how to airPlane go to land

    }

    public void park() throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Not implemented");
    }

    public void speedUp() throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Not implemented");
    }

    public void takeoff() {
        //Logic how to airPlane go to takeoff
    }
}
