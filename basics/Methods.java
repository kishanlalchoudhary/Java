package basics;

public class Methods {
    public static void greet(){
        System.out.println("basics.Hello World");
    }

    public static int average(int a, int b){
        int avg = (a+b)/2;
        return avg;
        // System.out.println("Error");
    }

    public static void main(String[] args) {
        // User Defined basics.Methods

        greet();

        int avg = average(5, 6);
        System.out.println(avg);

        // Pre Defined basics.Methods

        System.out.println(Math.max(10,20));
        System.out.println(Math.min(10,20));
        System.out.println(Math.abs(3-5));
        System.out.println(Math.sqrt(121));
        System.out.println(Math.pow(5,2));
        System.out.println(Math.random()*100);
        System.out.println(Math.ceil(4.678));
        System.out.println(Math.floor(4.678));
        System.out.println(Math.round(4.678));
    }
}
