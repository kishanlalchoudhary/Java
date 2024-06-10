package abstraction;

public class MainClass {
    public static void main(String[] args) {
        // Object of Abstract Class cannot be created
        // Vehicle v1 = new Vehicle();

        // Object of Subclass of Abstract Class can be created
        Car c1 = new Car();
        c1.start();
        c1.accelerate();
        c1.brakes(4);
    }
}

// Abstract Class
abstract class Vehicle{
    // Non-Abstract Method
    void start(){
        System.out.println("Vehicle is starting");
    }

    // Abstract Method
    abstract void accelerate();
    abstract void brakes(int wheels);
}

class Car extends Vehicle{
    void accelerate(){
        System.out.println("Car is Accelerating");
    }

    void brakes(int wheels){
        System.out.println("Car breaks are pushed");
    }
}

class Scooter extends Vehicle{
    void accelerate(){
        System.out.println("Scooter is Accelerating");
    }

    void brakes(int wheels){
        System.out.println("Scooter breaks are pushed");
    }
}