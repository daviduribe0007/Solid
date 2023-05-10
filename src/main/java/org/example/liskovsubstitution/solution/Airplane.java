package org.example.liskovsubstitution.solution;

import org.example.liskovsubstitution.solution.Interfaces.LandInterface;
import org.example.liskovsubstitution.solution.Interfaces.ParkInterface;
import org.example.liskovsubstitution.solution.Interfaces.SpeedUpInterface;
import org.example.liskovsubstitution.solution.Interfaces.TakeoffInterface;

public class Airplane implements LandInterface, TakeoffInterface{
    @Override
    public void land() {

    }

    @Override
    public void takeOff() {

    }
}
