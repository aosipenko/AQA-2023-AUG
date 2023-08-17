package org.prog.cars;

public class HeavyTruck extends Truck {

    public String htFuelType;

    public void putMoreCargo() {
        smth();
    }

    @Override
    public void turnRight() {
        System.out.println("Longer car turns Right");
    }

    @Override
    public void turnLeft() {
        System.out.println("Longer car turns Left");
    }
}
