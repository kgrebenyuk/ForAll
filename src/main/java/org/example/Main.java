package org.example;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car("Black", true, 5);
        Car car3 = new Car();

        car3.setColor("Blue");

        car1.setColor("Red");
        System.out.println("Car1 " + car1.getColor());
        System.out.println("Car2 " + car2.getColor());
        System.out.println("Car3 " + car3.getColor());

        car1.move(car1.getColor());

        String brandCar = car1.brandCar("Red", "Bugatti");
        System.out.println(brandCar);


        //  System.out.println(car1.brandCar("Red","Bugatti"));
        System.out.println(car1.brandCar("Red2", "Bugatti"));

        int money1 = 100001;


        if (car1.isExpensive(money1)) {
         //   car1.setExpensive(true);
            System.out.println("Дорого");
        }



    }
}