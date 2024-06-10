package abstraction;

public class AnonymousClass {
    public static void main(String[] args) {
        // Anonymous Class - Extends Outer Class
        OuterClass obj1 = new OuterClass() {
            public void outerClassMethod(){
                System.out.println("Anonymous Class Method - Outer Class");
            }
        };
        obj1.outerClassMethod();

        // Anonymous Class - Implements Outer Interface
        OuterInterface obj2 = new OuterInterface(){
            public void outerInterfaceMethod(){
                System.out.println("Anonymous Class Method - Outer Interface");
            }
        };
        obj2.outerInterfaceMethod();
    }
}

class OuterClass{
    public void outerClassMethod(){
        System.out.println("Outer Class");
    }
}

class OuterInterface{
    public void outerInterfaceMethod(){
        System.out.println("Outer Interface");
    }
}
