import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
   int []array=new int[5];
        Scanner scanner = new Scanner(System.in);
       for(int i=0;i<array.length;i++){
           array[i]=scanner.nextInt();

       }
        for(int i=0;i<array.length;i++){
            if (array[i]==42){
                break;
            }
            System.out.println(array[i]);

        }
}
}
