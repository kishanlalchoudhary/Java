package basics;

public class ConditionalStatements {
    public static void main(String[] args) {
        int age = 25;
        if(age >= 18){
            System.out.println("You are eligible to vote.");
        }else{
            System.out.println("You are not eligible to vote.");
        }

        int day = 2;
        if(day == 1){
            System.out.println("Go to home");
        }else if(day == 2){
            System.out.println("Go to party");
        }else{
            System.out.println("Go to office");
        }

        int a = 2;
        int b = 5;
        int c = 3;
        if(a>b){
            if(a>c){
                System.out.println("Greatest Number is "+a);
            }else{
                System.out.println("Greatest Number is "+c);
            }
        }else{
            if(b>c){
                System.out.println("Greatest Number is "+b);
            }else{
                System.out.println("Greatest Number is "+c);
            }
        }

        int p = 10;
        int q = 20;
        int max = p > q ? p : q;
        System.out.println("Maximum Number is "+max);

        int item = 2;
        switch(item){
            case 1:
                System.out.println("Candy");
                break;
            case 2:
                System.out.println("Lollipop");
                break;
            case 3:
                System.out.println("Chocolate");
                break;
            default:
                System.out.println("Nothing");
        }

        int num = 15;
        if(num >= 10 && num <= 20){
            System.out.println(num+" is inside the range");
        }

        int time = 13;
        if(time == 9 || time == 13 || time == 20){
            System.out.println("Time to eat");
        }else{
            System.out.println("Time to work");
        }
    }
}
