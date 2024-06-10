package oops;

public class Constructors {
    public static void main(String[] args) {
        ComplexClass num1 = new ComplexClass();
        num1.print();

        ComplexClass num2 = new ComplexClass(2, 8);
        num2.print();

        ComplexClass result = num1.add(num2);
        System.out.println(num1);
        result.print();
    }
}

class ComplexClass {
    int a, b;

    // Default Constructor Created by Java Compiler if it is not explicity defiined
    // public oops.ComplexClass(){
    //     a = 0;
    //     b = 0;
    // }

    // No Argument Constructor
    public ComplexClass(){
        a = 5;
        b = 10;
    }

    // Parametrized Constructor
//    public oops.ComplexClass(int real, int img){
//        a = real;
//        b = img;
//    }

    // This keyword is used to remove ambiguity betweenobject properties and method parameters
    public ComplexClass(int a, int b){
        this.a = a;
        this.b = b;
    }

    // Constructor Overloading
    public ComplexClass(int real){
        a = real;
        b = 0;
    }

    void print(){
        System.out.println(a+" + "+b+"i");
    }

    // This keyword is used to invoke method of current object
    ComplexClass add(ComplexClass num){
        System.out.println(this);
        this.print();
        return new ComplexClass(a+num.a, b+num.b);
    }
}
