package exceptions;

public class Exceptions {
    public static void main(String[] args) {
        System.out.println("basics.Hello Guys");

        int arr[] = new int[5];

        try{
            // Array is of length 5 and we are trying to access the element with index 8 so error will be thrown
            System.out.println(arr[8]);

            // Divide by zero is not possible so error will be thrown
            int a = 5/0;
        }catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
            // Whenever we print the object then toString method of object is called and the string returned is then printed
            System.out.println(e);
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
        }catch(RuntimeException e){
            System.out.println("All RuntimeExceptions Handled");
        }
        catch(java.lang.Exception e){
            System.out.println("All Exceptions Handled");
        }finally{
            System.out.println("I will run always");
        }

        System.out.println("Bye Guys");
    }
}
