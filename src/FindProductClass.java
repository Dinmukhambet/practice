import java.util.Scanner;

/**
 * Created by Admin on 07.06.2016.
 */
public class FindProductClass {
    public static void main(String[] args) {
        double answer=1;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] array= new int[n];
        for (int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        for (int i=0;i<array.length;i++){
            answer=  (answer*array[i]%(Math.pow(10,9)+7));
        }
        System.out.println(answer);
    }
}
