package abstraction;

// Functional Interface
interface Sample {
    void print();
}

interface Person{
    int walks(int steps);
}

public class LambdaExpression {
    public static void main(String[] args) {
        Sample obj1 = () -> {
            System.out.println("Lambda Expression");
        };
        obj1.print();

        Person obj2 = (int steps) -> {
            System.out.println("Walked "+steps+" steps");
            return steps;
        };
        obj2.walks(5);

        Person obj3 = (int steps) -> 2*steps;
        System.out.println(obj3.walks(5));

        Person obj4 = (steps) -> 2*steps;
        System.out.println(obj3.walks(20));
    }
}
