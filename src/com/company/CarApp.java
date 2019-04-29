package com.company;

public class CarApp {
    public static void main(String[] args) {

        Car porsche = new Car();
        porsche.setMake("Porsche");
        porsche.setColor("red");
        porsche.setModel("718 Cayman");
        porsche.setSpeed(78);

        print(porsche.displayVehicle());
        print(porsche.carSpeed());

        Suv ford = new Suv(2019, "Toyota", "RAV4");
        ford.setHasHitch(true);

        Suv honda = new Suv(2019, "Honda", "CR-V");
        honda.setHasHitch(false);


        print(ford.displayVehicle());
        print(honda.displayVehicle());





    }

    private static void print(String s) {
        System.out.println(s);
    }
}