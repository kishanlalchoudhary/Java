public class Loops {
    public static void main(String[] args) {
        for(int i=1; i<=20; i++){
            if(i == 5){
                continue;
            }
            System.out.println("Number "+i);
            if(i == 15){
                break;
            }
        }
        System.out.println();

        int i=1;
        while(i<=20){
            if(i == 5){
                i++;
                continue;
            }
            System.out.println("Number "+i);
            if(i == 15){
                break;
            }
            i++;
        }
        System.out.println();

        int j=13;
        do{
            System.out.println("Number "+j);
            j++;
        }while(j>20);
        System.out.println();

        for(int p=0; p<5; p++){
            if(p == 2){
                continue;
            }

            int q = 0;
            while(q<=p){
                System.out.print("* ");
                q++;
            }
            System.out.println();
        }
    }
}
