package oops;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "Tommy";
        d1.walk();

        Dog d2 = new Dog();
        d2.name = "Leo";
        d2.bark();

        Complex num = new Complex();
        num.a = 5;
        num.b = 6;
        num.print();
    }
}

class Dog{
    String name;
    int age;
    String color;

    void walk(){
        System.out.println(name+" is walking");
    }

    void bark(){
        System.out.println(name+" is barking");
    }
}

class Complex{
    float a;
    float b;

    void print(){
        System.out.println(a+" + "+b+"i");
    }
}
