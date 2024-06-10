package abstraction;

public class Interface {
    public static void main(String[] args) {
        // Object of Interface cannot be created
        // Animal a1 = new Animal();

        // Object of Subclass can be created
        Monkey m1 = new Monkey();
        m1.eats();
        m1.walks();
        m1.drinks();
        m1.runs();

        System.out.println(Animal.LEGS);
    }
}

interface Pet{
    void walks();
    void drinks();

    // Default Functions which have default implementation
    default void runs(){
        System.out.println("Pet is Running");
    }
}

interface Animal{
    // By Default variables are public static final
    int LEGS = 4;

    // Methods by default are public and abstract inside interfaces
    void eats();
    void drinks();
}

// Multiple Interface using Interface
class Monkey implements Animal, Pet{
    public void eats(){
        System.out.println("Monkey is Eating");
    }

    public void walks(){
        System.out.println("Monkey is Walking");
    }

    public void drinks(){
        System.out.println("Monkey is Drinking");
    }
}
