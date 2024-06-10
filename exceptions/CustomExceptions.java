package exceptions;

public class CustomExceptions {
    public static void main(String[] args) {
        System.out.println("basics.Hello World");
        try{
            throw new MyException("Custom Exceptions.Exception");
        }catch(MyException e){
            System.out.println(e);
        }
        System.out.println("Bye World");
    }
}

class MyException extends Exception {
    MyException(String message){
        super(message);
    }
}
