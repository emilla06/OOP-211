abstract class Car {
    String brand = "Toyota";

    abstract void startEngine();
    abstract void stopEngine();

    void showBrand() {
        System.out.println("Car Brand: " + brand);
    }
}

class ToyotaVios extends Car {

    @Override
    void startEngine() {
        System.out.println("Toyota Vios engine started using push button.");
    }

    @Override
    void stopEngine() {
        System.out.println("Toyota Vios engine stopped when stepping on the pedal brake, it will press the disc brake until it stops.");
    }

    void showModel() {
        System.out.println("Model: Toyota Vios 2024");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new ToyotaVios();   

        myCar.showBrand();
        myCar.startEngine();
        myCar.stopEngine();

        ((ToyotaVios) myCar).showModel();
    }
}
