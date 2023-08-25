package org.prog.collections;

import org.prog.cars.Car;
import org.prog.cars.Owner;

import java.sql.SQLOutput;
import java.util.*;

public class MapsDemo {

    public static List<Owner> carOwners;
    public static List<Car> cars;

    //TODO: add code that verifies that owners with certain name/lastname have car with certain color
    //TODO: * verify that specific Owner has car with color
    public static void main(String[] args) {
        Owner johnKyiv = getOwner("John", "Doe");
        Owner johnPoltava = getOwner("John", "Doe");

        //John Doe -> AA0000TT
         carOwners = List.of(
                johnKyiv, //red
                johnPoltava, //green
                getOwner("Jane", "Doe"),
                getOwner("Jonny", "Depp"),
                getOwner("Aghata", "Kristie"),
                getOwner("Alan", "Poe")
        );

        cars = List.of(
                getCar(carOwners.get(0), "AA0000TT", "red"),
                getCar(carOwners.get(1), "AB0011TT", "green"),
                getCar(carOwners.get(2), "AC0022TT", "pink"),
                getCar(carOwners.get(2), "AB0033TT", "yellow"),
                getCar(carOwners.get(2), "AC0044TT", "brown"),
                getCar(carOwners.get(3), "AD0055TT", "black"),
                getCar(carOwners.get(3), "AE0066TT", "silver"),
                getCar(carOwners.get(4), "AC0077TT", "red"),
                getCar(carOwners.get(5), "AC0088TT", "black")
        );

//        List<String> ownerNames = cars.stream()
//                .filter(car -> car.plateNumber.startsWith("AC"))
//                .map(car -> car.owner.name)
//                .toList();
//
//       List<String> uniqueOwnerNames = cars.stream()
//               .filter(car -> car.plateNumber.startsWith("AC"))
//               .map(car -> car.owner.name)
//               .distinct()
//               .toList();

//        Optional<String> firstFoundOwner = cars.stream()
//               .filter(car -> car.plateNumber.startsWith("AC"))
//               .map(car -> car.owner.name)
//                .findFirst();

        boolean allPlatesContainDoubleZero = cars.stream()
                .allMatch(c -> c.plateNumber.contains("00"));

        boolean anyPlatesContainAE = cars.stream()
                .anyMatch(c -> c.plateNumber.contains("AE"));

        Map<String, String> map = new HashMap<>();
        map.put("key_1", "value_1");
        map.put("key_2", "value_2");
        map.put("key_3", "value_3");
        map.put("key_4", "value_4");

//      map.entrySet().stream()
//                .forEach(e -> {
//                    System.out.println(e.getKey() + " : " + e.getValue());
//                });

//      System.out.println(allPlatesContainDoubleZero);
//      System.out.println(anyPlatesContainAE);

        // HOMEWORK //
        System.out.println(checkCarOwner("Jane", "Doe", "pink"));
        //System.out.println(checkSpecificOwnerHasCarWithColor(cars, carOwners));

    }

    private static Owner getOwner(String name, String lastName) {
        Owner owner = new Owner();
        owner.name = name;
        owner.lastName = lastName;
        return owner;
    }

    //TODO: add color to method and paint car with it
    private static Car getCar(Owner owner, String plateNumber, String color) {
        Car car = new Car();
        car.owner = owner;
        car.plateNumber = plateNumber;
        car.color = color;
        return car;
    }

    // TODO: Home work | add code that verifies that owners with certain name/lastname have car with certain color
    private static boolean checkCarOwner(String name, String lastName, String carColor) {

        boolean checkOwner = cars.stream()
                .filter(f -> f != null)
                .filter(f -> f.owner.name.equals(name) && f.owner.lastName.equals(lastName))
                .anyMatch(f -> f.color.equals(carColor));

        return checkOwner;
    }

    // TODO: Home work ( * ) | verify that specific Owner has car with color
    private static boolean checkSpecificOwnerHasCarWithColor(
            String carColor, int ownerIndex){



        return false;
    }
}
