package org.example;

public class Car {
    private String color;
    private boolean isExpensive;
    private int doors;
    private String brand;

    public Car(String color, boolean isExpensive, int doors) {
        this.color = color;
        this.isExpensive = isExpensive;
        this.doors = doors;
    }

    public void setExpensive(boolean expensive) {
        isExpensive = expensive;
    }

    public boolean getIsExpensive() {
        return isExpensive;
    }

    public Car() {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        if (color.isEmpty()) {
            return "GREEN";
        }
        //      return  color.toUpperCase();
        return color;
    }

    public void setColor(String color) {

        if (color.isEmpty()) {
            this.color = "Green";
        } else {
            this.color = color;
        }
    }

    public void move(String color) {
        if (color == "Green") {
            System.out.println("car is moving to the West");
        }
        if (color.equals("Red")) {
            //  if ( color == "Red") {
            System.out.println("car is moving to the Est");
        }
    }


    public String brandCar(String color, String brand) {
        String result = "Что-то еще";
        if (color.equals("Red") && brand.equals("Bugatti")) {
            result = "Научиться ездить";
        } else if (color.equals("Blue") && brand.equals("Ferrari")) {
            result = "Разбить вдребезги";

        }
        return result;
    }

    public boolean isExpensive(int money) {
        if (money >= 100000) {
            return true;
        } else {
            return false;
        }

    }

}
