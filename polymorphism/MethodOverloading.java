package polymorphism;

public class MethodOverloading {
    public static void main(String[] args) {
        Greet obj = new Greet();
        obj.greetings();
        obj.greetings("Kishanlal");
        obj.greetings("Prakash", 5);
    }
}

class Greet{
    // Allowed - Its Method Overloading

    void greetings(){
        System.out.println("basics.Hello, Good Morning");
    }

    void greetings(String name){
        System.out.println("basics.Hello "+name+", Good Morning");
    }

    void greetings(String name, int count){
        for (int i = 0; i < count; i++) {
            System.out.println("basics.Hello "+name+", Good Morning");
        }
    }

    // Not Allowed - Its not Method Overloading

//    int greetings(){
//        return 0;
//    }

//    void greetings(String message){
//        System.out.println("basics.Hello, "+message);
//    }
}
