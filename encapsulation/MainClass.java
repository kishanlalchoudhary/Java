package encapsulation;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;

import encapsulation.pkg1.Person;

import java.util.*;

public class MainClass {
    static {
        System.out.println("First Static Block");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        Person p1 = new Person();
        p1.setAge(12);
        System.out.println(p1.getAge());

        // Static Variable can be accessed using class as well as object;
        System.out.println(p1.count);
        System.out.println(Person.count);

        // p1.count = 50;
        Person p2 = new Person();
        System.out.println(p2.count);

        // max is a static method of Math Class
        System.out.println(Math.max(5, 2));

        // Static Method
        Person.print();

        // Static and Final Variable value cant be modified
        System.out.println(Math.PI);
        System.out.println(Person.scientificName);
        // Person.scientificName = "Ambhibian"; // Error - Not Allowed as it is final and static
    }

    static {
        System.out.println("Second Static Block");
    }
}
