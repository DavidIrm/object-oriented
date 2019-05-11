package com.sda.inheritance;

public class Car extends Vehicle {

    private boolean convertible;
    //am acces la metoda publica din parinte
    //nerecomandat
    private String manufacturer = "Ferrari";

    public Car(int maxSpeed, boolean convertible) {
        super(maxSpeed);
        this.convertible = convertible;
    }

    public boolean isConvertible() {
        return convertible;
    }

    @Override
    public int getMaxSpeed() {
        return 100;
    }

    public String toString() {
      return "Car is convertible : " + convertible +
              " and has maxSpeed: " + super.getMaxSpeed() +
              " and manufacturer is: " + super.manufacturer;
    }
}
