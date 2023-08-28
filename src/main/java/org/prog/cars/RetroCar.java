package org.prog.cars;

public class RetroCar extends Car {
    @Override
    public void opendoor() { System.out.println("Open passenger door");

    }

    @Override
    public void turnLeft() {
        super.turnLeft();
    }

    @Override
    public void turnRight() {
        super.turnRight();
    }
}
