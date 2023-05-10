package org.example.liskovsubstitution.problem;

import jdk.jshell.spi.ExecutionControl;

public interface Trans {

    void brake() throws ExecutionControl.NotImplementedException;
    void land() throws ExecutionControl.NotImplementedException;
    void park() throws ExecutionControl.NotImplementedException;
    void speedUp() throws ExecutionControl.NotImplementedException;
    void takeoff() throws ExecutionControl.NotImplementedException;

}
