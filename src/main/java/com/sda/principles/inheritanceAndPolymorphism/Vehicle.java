package com.sda.principles.inheritanceAndPolymorphism;

public class Vehicle {

    private int maxSpeed;
    protected String manufacturer = "Dacia";

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Vehicle maxSpeed is: " + maxSpeed;
    }
}
