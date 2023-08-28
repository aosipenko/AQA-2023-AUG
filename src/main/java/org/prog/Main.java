package org.prog;

import org.prog.cars.*;
import org.prog.exceptions.ExceptionsDemo;
import org.prog.staticdemo.Example;

import java.awt.*;

public class Main {

    private Color color;

    /**
     * 000000000010000000000000009000
     * 00000redCar[red]00000000000000
     * 0000000000o1000000000000000000
     * 000000000000000000000000000000
     * 000000000000000o20000000000000
     * greenCar[green]000000000000000
     * 000000000000000000000000000000
     * 000000000000000000000000000000
     *
     * @param args
     */

    public static void main(String[] args) {
        Example exampleOne = new Example();
        Example exampleTwo = new Example();
        Example exampleThree = new Example();

        exampleOne.regularValue = "A";
        exampleTwo.regularValue = "B";
        exampleThree.regularValue = "C";

        System.out.println(exampleOne.regularValue);
        System.out.println(exampleTwo.regularValue);
        System.out.println(exampleThree.regularValue);

            }



    public static class Car {
        public String fuelType;
        private String model;
        private String color;
//Homework
        Car() {
            this("Audi");
        }
        Car(String model) {
            this("Red", model);
        }

        Car(String color, String model) {
            this.color = color;
            this.model = model;
            this.info();
        }

        public void info() {
            System.out.println("Car Model: " + model + ", Car Color: " + color);
        }
    }
}