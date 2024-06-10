import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your firstname : ");
        String firstName = sc.nextLine();

        System.out.println("Enter your secondname : ");
        String secondName = sc.next();

        System.out.println("Your fullname is "+firstName+" "+secondName);

        String name = "Kishanlal";
        String sameName = "Kishanlal";
        String newName = new String("Kishanlal");
        String caseName = "kiSHaNLal";

//      // Comparing Strings

        if(name == sameName){
            System.out.println("Both are same");
        }else{
            System.out.println("Both are not same");
        }

        if(name == newName){
            System.out.println("Both are same");
        }else{
            System.out.println("Both are not same");
        }

        if(name.equals(newName)){
            System.out.println("Value of both is same");
        }

        if(name.equalsIgnoreCase(caseName)){
            System.out.println("Value of both is same irrespective of case");
        }

        // String Methods

        String word1 = "  Hello ";
        System.out.println(word1.toLowerCase());
        System.out.println(word1.toUpperCase());
        System.out.println(word1.trim());

        String word2 = "Carpet";
        System.out.println(word2.startsWith("car"));
        System.out.println(word2.endsWith("et"));
        System.out.println(word2.charAt(5));

        int age = 123;
        String strAge = String.valueOf(age);
        System.out.println(age+2);
        System.out.println(strAge+2);
        char charAge[] = strAge.toCharArray();
        for(char ch : charAge){
            System.out.println(ch);
        }

        String sentence = "I love Java, Java is a good language.";
        System.out.println(sentence.replace("Java", "Python"));
        System.out.println(sentence.substring(5));
        System.out.println(sentence.substring(5, 10));
        System.out.println(sentence.contains("good"));

        String words[] = sentence.split(" ");
        for(String word : words){
            System.out.println(word);
        }

        String str = "   ";
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());
    }
}
