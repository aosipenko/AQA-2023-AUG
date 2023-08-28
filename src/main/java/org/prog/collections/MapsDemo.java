package org.prog.collections;

import org.prog.cars.Car;
import org.prog.cars.Owner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapsDemo {

    //TODO: add code that verifies that owners with certain name/lastname have car with certain color
    //TODO: * verify that specific Owner has car with color
    public static void main(String[] args) {
        Owner johnKyiv = getOwner("John", "Doe");
        Owner johnPoltava = getOwner("John", "Doe");

        //John Doe -> AA0000TT
        List<Owner> carOwners = List.of(
                getOwner("John", "Doe"),
                getOwner("John", "Doe"),
                getOwner("Jane", "Doe"),
                getOwner("Jonny", "Depp"),
                getOwner("Aghata", "Kristie"),
                getOwner("Alan", "Poe")
        );

        List<Car> cars = List.of(
                getCar(carOwners.get(0), "AB0011TT", "red"),
                getCar(carOwners.get(1), "AB0011TT", "pink"),
                getCar(carOwners.get(2), "AC0022TT", "green"),
                getCar(carOwners.get(5), "AB0033TT", "black"),
                getCar(carOwners.get(2), "AC0044TT", "white"),
                getCar(carOwners.get(3), "AD0055TT", "black"),
                getCar(carOwners.get(3), "AE0066TT", "violet"),
                getCar(carOwners.get(4), "AC0077TT", "black")

        );
List<Car> carsColor = List.of(
        getColor(carOwners.get(0),"red"),
        getColor(carOwners.get(1),"red"),
        getColor(carOwners.get(2),"green"),
        getColor(carOwners.get(2),"white"),
        getColor(carOwners.get(3),"black"),
        getColor(carOwners.get(3),"violet"),
        getColor(carOwners.get(4),"black"),
        getColor(carOwners.get(5),"black")

        );
        List<String> ownerNames = cars.stream()
         .filter(car -> car.color.contains("black"))
          .map(owner -> owner.owner.name)
          .toList();
        ownerNames.forEach(n -> System.out.println(n));

       List<String> ownerNames = cars.stream()
               .filter(car -> car.owner.name.contains("John"))
               .map(car -> car.color)
                .toList();
        ownerNames.forEach(n -> System.out.println("John have:\n" + n + " car"));

        List<String> ownerNames = cars.stream()
       .filter(car -> car.color.contains("black"))
        .map(car -> car.owner.name)
         .toList();
           ownerNames.forEach(n -> System.out.println(n));

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

      //  boolean allPlatesContainDoubleZero = cars.stream()
       //         .allMatch(c -> c.plateNumber.contains("00"));

      //  boolean anyPlatesContainAE = cars.stream()
        //        .anyMatch(c -> c.plateNumber.contains("AE"));

        boolean allColorContainBlack = cars.stream()
                .allMatch((c) -> {c.color.contains("black");

                });
        System.out.println(allColorContainBlack);

        boolean anyColorContainRed = cars.stream()
                .anyMatch((c) -> {c.color.contains("red");
        });
        System.out.println(anyColorContainRed);

        Map<String, String> map = new HashMap<>();
        map.put("key_1", "value_1");
        map.put("key_2", "value_2");
        map.put("key_3", "value_3");
        map.put("key_4", "value_4");

        map.entrySet().stream()
                .forEach(e -> {
                    System.out.println(e.getKey() + " : " + e.getValue());
                });
}
//        System.out.println(allPlatesContainDoubleZero);
//        System.out.println(anyPlatesContainAE);


    private static Car getColor(Owner owner, String color)
    {
        owner = new Owner();
        Car car = new Car();
        car.owner = owner;
        car.color = color;
        return owner;
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

    //TODO: Home work NO *
    private static boolean checkCarOwner(String carColor, String name, String lastName) {
        return false;
    }

    //TODO: Home work NO *
    private static boolean checkSpecificOwnerHasCarWithColor(
            //TODO: whatever params you need
    ) {
        return false;
    }
}
