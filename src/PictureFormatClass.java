
import java.util.Scanner;
public class PictureFormatClass {
    public static void main(String[] args) {

        int n,l;
        Scanner sc = new Scanner(System.in);
        l=sc.nextInt();
        n=sc.nextInt();
        int [] width= new int[n];
        int [] height= new int[n];
        for(int i=0;i<n;i++){
            width[i]=sc.nextInt();
            height[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if (width[i]>l&&height[i]>l){
                System.out.println("CROP IT");
            }
            else if(width[i]==l&&height[i]==width[i]){
                System.out.println("ACCEPTED");
            }
            else{
                System.out.println("UPLOAD ANOTHER");
            }
        }
    }
}
