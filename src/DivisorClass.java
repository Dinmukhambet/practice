import java.util.Scanner;

/**
 * Created by Admin on 07.06.2016.
 */
public class DivisorClass {
    public static void main(String[] args) {
        int l,r,k;
        int counter=0;
        Scanner sc= new Scanner(System.in);
        l=sc.nextInt();
        r=sc.nextInt();
        k=sc.nextInt();
        if(l>=1&&l<=r&&r<=1000&&l<=1000&&r>=1){
            for(int i=l;i<=r;i++){
                if(i%k==0){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }

}
