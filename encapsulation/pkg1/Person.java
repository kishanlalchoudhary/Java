package encapsulation.pkg1;

public class Person {
    public static int count = 0;
    public static final String scientificName = "Homo Sapiens";

    private int age;
    private String name;
    boolean canBeChanged = true;
    boolean canBeAccessed = true;

    public Person(){
        count++;
    }

    public static void print(){
        System.out.println("No of Objects Created are : "+count);

        // Not Static Variable Cannot be accessed in Static Method
        // System.out.println(age);
    }

    public void setAge(int age){
        // Authorization - So that it cannot be changed without access
        if(canBeChanged){
            //  Validation - So that age cannot be set negative
            if(age > 0){
                this.age = age;
            }
        }
    }

    public int getAge(){
        // Authorization - So that it cannot be accessed without access
        if(canBeAccessed){
            return age;
        }
        return -1;
    }
}
