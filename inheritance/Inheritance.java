package inheritance;

class Vehicle {
    int wheelsCount;
    String model;

    Vehicle(){
        System.out.println("inheritance.Vehicle Instance is Created");
    }

    Vehicle(int wheelsCount, String model){
        this.wheelsCount = wheelsCount;
        this.model = model;
        System.out.println("inheritance.Vehicle Instance is Created with Wheels Count and Model");
    }

    void start(){
        System.out.println("inheritance.Vehicle is Starting");
    }
}

class Car extends Vehicle {
    String color;

    // Calling Constructor using super Keyword
    Car(){
        // Call to super should be first line in body
        super(3, "I5");

        // Call to this should be first line in body
        // this("Blue");

        // Both super and this cannot be called together
        System.out.println("inheritance.Car Instance is Created");
    }

    Car(String color){
        this.color = color;
    }

    // Method Overriding
    // Use of super Keyword
    void start(){
        System.out.println("inheritance.Car is Starting");
        super.start();
    }

    // Use of this Keyword
    void info(){
        System.out.println(this);
        System.out.println("inheritance.Car model is "+this.model+", wheel count is "+this.wheelsCount+" and color is "+this.color);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.wheelsCount = 4;
        obj.color = "Red";
        obj.start();
        obj.info();
    }
}