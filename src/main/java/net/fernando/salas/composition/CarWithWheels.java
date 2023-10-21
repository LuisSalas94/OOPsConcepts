package net.fernando.salas.composition;

import java.util.ArrayList;
import java.util.List;

class Wheel {
    private String brand;

    public Wheel(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

class Car {
    private String make;
    private String model;
    private List<Wheel> wheels;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        this.wheels = new ArrayList<>();
    }

    public void addWheel(Wheel wheel) {
        if (wheels.size() < 4) {
            wheels.add(wheel);
            System.out.println(wheel.getBrand() + " wheel added to the " + make + " " + model);
        } else {
            System.out.println("A " + make + " " + model + " can only have 4 wheels.");
        }
    }

    public void showWheels() {
        System.out.println("Wheels for " + make + " " + model + ":");
        for (Wheel wheel : wheels) {
            System.out.println(wheel.getBrand() + " wheel");
        }
    }

}

public class CarWithWheels {
    public static void main(String[] args) {
        Wheel michelin = new Wheel("Michelin");
        Wheel goodyear = new Wheel("Goodyear");
        Wheel bridgestone = new Wheel("Bridgestone");
        Wheel pirelli = new Wheel("Pirelli");
        Wheel continental = new Wheel("Continental");

        Car sedan = new Car("Toyota", "Camry");
        Car suv = new Car("Ford", "Explorer");

        sedan.addWheel(michelin);
        sedan.addWheel(goodyear);
        sedan.addWheel(bridgestone);
        sedan.addWheel(pirelli);

        suv.addWheel(michelin);
        suv.addWheel(goodyear);
        suv.addWheel(bridgestone);
        suv.addWheel(continental);

        System.out.println("\nCar Details: ");
        sedan.showWheels();

        System.out.println("\nSUV Details: ");
        suv.showWheels();

    }
}
