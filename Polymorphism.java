public class Polymorphism {
    public static void main(String[] args) {
        ChildData obj1 = new ChildData();
        obj1.data = 5;
        obj1.printData();
        obj1.printData(3);
        obj1.printData("Data :");

        // Data data type can be used to create object of ChildData Class
        Data obj2 = new ChildData();
        obj2.data = 10;
        obj2.printData();
        // Not Allowed to Access ChildData class Methods using data type Data
        // obj2.printData("Data :");

        // Not Allowed to use ChildData data type for creating Data Class Object
        // ChildData obj3 = new Data();
    }
}

class Data{
    int data;

    public void printData(){
        System.out.println(data);
    }

    // Compile Time Polymorphism - Method Overloading
    public void printData(int times){
        for(int i=0; i<times; i++){
            System.out.println(data);
        }
    }
}

class ChildData extends Data{
    // Runt Time Polymorphism - Method Overriding
    public void printData(){
        System.out.println("Overriden "+data);
    }

    public void printData(String Message){
        System.out.println(Message+" "+data);
    }
}
