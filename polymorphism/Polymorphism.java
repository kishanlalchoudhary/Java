package polymorphism;

public class Polymorphism {
    public static void main(String[] args) {
        ChildData obj1 = new ChildData();
        obj1.data = 5;
        obj1.printData();
        obj1.printData(3);
        obj1.printData("polymorphism.Data :");

        // polymorphism.Data data type can be used to create object of polymorphism.ChildData Class
        Data obj2 = new ChildData();
        obj2.data = 10;
        obj2.printData();
        // Not Allowed to Access polymorphism.ChildData class basics.Methods using data type polymorphism.Data
        // obj2.printData("polymorphism.Data :");

        // Not Allowed to use polymorphism.ChildData data type for creating polymorphism.Data Class Object
        // polymorphism.ChildData obj3 = new polymorphism.Data();
    }
}

class Data{
    int data;

    public void printData(){
        System.out.println(data);
    }

    // Compile Time polymorphism.Polymorphism - Method Overloading
    public void printData(int times){
        for(int i=0; i<times; i++){
            System.out.println(data);
        }
    }
}

class ChildData extends Data{
    // Runt Time polymorphism.Polymorphism - Method Overriding
    public void printData(){
        System.out.println("Overriden "+data);
    }

    public void printData(String Message){
        System.out.println(Message+" "+data);
    }
}
