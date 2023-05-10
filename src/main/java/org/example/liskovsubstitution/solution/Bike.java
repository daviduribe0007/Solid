package org.example.liskovsubstitution.solution;

import org.example.liskovsubstitution.solution.Interfaces.BrakeInterface;
import org.example.liskovsubstitution.solution.Interfaces.LandInterface;
import org.example.liskovsubstitution.solution.Interfaces.ParkInterface;
import org.example.liskovsubstitution.solution.Interfaces.SpeedUpInterface;

public class Bike implements BrakeInterface, ParkInterface, SpeedUpInterface {

    @Override
    public void brake() {

    }

    @Override
    public void park() {

    }

    @Override
    public void speedUp() {

    }


}
