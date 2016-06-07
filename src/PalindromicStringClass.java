import java.util.Scanner;

/**
 * Created by Admin on 07.06.2016.
 */
public class PalindromicStringClass {
    public static void main(String[] args) {
        String s;
        Scanner sc= new Scanner(System.in);
        s=sc.nextLine();
        StringBuilder sb= new StringBuilder(s);
        if(s.equals(sb.reverse().toString())){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
