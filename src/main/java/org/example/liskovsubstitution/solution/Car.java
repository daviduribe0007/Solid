package org.example.liskovsubstitution.solution;

import org.example.liskovsubstitution.solution.Interfaces.BrakeInterface;
import org.example.liskovsubstitution.solution.Interfaces.LandInterface;
import org.example.liskovsubstitution.solution.Interfaces.ParkInterface;
import org.example.liskovsubstitution.solution.Interfaces.SpeedUpInterface;

public class Car implements BrakeInterface, ParkInterface, SpeedUpInterface {


    @Override
    public void park() {

    }

    @Override
    public void speedUp() {

    }

    @Override
    public void brake() {

    }
}
