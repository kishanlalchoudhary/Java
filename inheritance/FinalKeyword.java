package inheritance;

class VehicleClass {
    String model;

    final void setModel(String model){
        this.model = model;
    }
}

final class TwoWheelerClass extends VehicleClass{
    final int wheels = 2;

    // Will give error because final method cannot be overriden
    // void setModel(String model){
    // }

    void display(){
        System.out.println("Model : "+model);
        System.out.println("Wheels : "+wheels);
    }
}

// Will give error because final class cannot be inherited
//class ScooterClass extends inheritance.TwoWheelerClass{
//
//}

public class FinalKeyword {
    public static void main(String[] args) {
        TwoWheelerClass obj = new TwoWheelerClass();

        // Will give error because final variable cannot be changed
        // obj.wheels = 4;

        obj.setModel("I10");
        obj.display();
    }
}
