package com.homework1.vehicle;

public class Car {
    public Car(){};
    private void startElectricity(){
        System.out.println("Electricity started");
    }
    private void startCommand(){
        System.out.println("Command started");
    }
    private void startFuelSystem(){
        System.out.println("FuelSystem started");
    }
    public void start(){
        startElectricity();
        startCommand();
        startFuelSystem();
    }
}
