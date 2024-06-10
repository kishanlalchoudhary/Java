public class Arrays {
    public static void main(String[] args) {
        // int age[];  // Declaration
        // age = new int[5]; // Allocation

        int age[] = new int[5]; // Single Line

        // Storing Elements
        age[0] = 5;
        age[1] = 2;
        age[2] = 12;
        age[3] = 23;
        // age[4] = 16;

        System.out.println(age[2]); // Accessing Elements
        System.out.println(age[4]); // Give Default Value Zero

        // Length of Array
        System.out.println(age.length);

        int marks[] = {98,12,45,12,65};
        // System.out.println(marks[8]); // Index Out of Range Error

        // Iterating Array
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+" ");
        }

        // For Each Loop
        for(int mark : marks){
            System.out.print(mark+" ");
        }
        System.out.println();

        // Example 1
        int numbers[] = {10, 30, 50, 80, 100};
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        System.out.println("Sum is "+sum);

        // Example 2
        int min = Integer.MAX_VALUE;
        for(int number : numbers){
            if(min > number){
                min = number;
            }
        }
        System.out.println("Minimum is "+min);

        // Multidimensional Array

        int arr[][] = new int[2][2]; // 2D Array Creation

        // Storing Elements in 2D Arrat
        arr[0][0] = 5;
        arr[0][1] = 6;
        arr[1][0] = 7;
        arr[1][1] = 8;

        System.out.println(arr[1][0]); // Accessing Element of 2D Array

        // Directly Initialize 2D Array
        int scores[][] = {
                {12, 98, 34},
                {12, 67, 87},
                {12, 98, 23},
                {14, 67, 36}
        };
        System.out.println(scores[2][2]);
    }
}
