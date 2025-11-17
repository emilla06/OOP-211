class Vehicle {
    String brand;

    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    String model;
    String color;
    int year;
    int door;
    
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Door: " + door);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.model = "Vios";
        myCar.color = "Blue";
        myCar.year = 2020;
        myCar.door = 4;

        myCar.start();
        myCar.displayInfo();
    }
}
