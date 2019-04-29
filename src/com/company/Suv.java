package com.company;

public class Suv extends Vehicle {

    private boolean hasHitch;

    public Suv() {
    }

    public Suv(int year, String make, String model) {
        setYear(year);
        setMake(make);
        setModel(model);
    }

    public String displayHitch(){
        if (isHasHitch() == true){
            return " has hitch";
        } else {
            return " does not have hitch";
        }
    }


    @Override
    public String displayVehicle(){
        return getYear() + " " + getMake() + " " + getModel() + displayHitch();
    }

    public boolean isHasHitch() {
        return hasHitch;
    }

    public void setHasHitch(boolean hasHitch) {
        this.hasHitch = hasHitch;
    }
}
