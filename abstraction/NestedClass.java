package abstraction;

// Outer Class
public class NestedClass {
    // Inner Class
    class Toy{
        int price;
    }

    // Static Nested Class
    static class PlayStation{
        int price;
    }

    public static void main(String[] args) {
        NestedClass obj = new NestedClass();
        Toy toy = obj.new Toy();
        toy.price = 45;

        PlayStation playStation = new NestedClass.PlayStation();
        playStation.price = 100;
    }
}
