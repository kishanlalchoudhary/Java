import java.io.IOException;

public class CustomException {
    public static void main(String[] args) {
        System.out.println("Hello World");
        try{
            throw new MyException("Custom Exception");
        }catch(MyException e){
            System.out.println(e);
        }
        System.out.println("Bye World");
    }
}

class MyException extends Exception{
    MyException(String message){
        super(message);
    }
}
