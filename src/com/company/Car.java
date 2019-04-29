package com.company;

public class Car extends Vehicle {

    public Car() {
    }

    @Override
    public String displayVehicle() {
        return "The car is a " + getColor() + " " + getMake() + " "
                + getModel() + ".";

    }

    public String carSpeed(){
        return "The "+ getColor() + " " + getMake() + " "
                + getModel() + " is going " + getSpeed() +
                " mph.";
    }
}
