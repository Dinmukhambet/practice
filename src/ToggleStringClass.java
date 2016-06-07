import java.util.Scanner;

/**
 * Created by Admin on 07.06.2016.
 */
public class ToggleStringClass {
    public static void main(String[] args) {
        String word;
        Scanner sc= new Scanner(System.in);
        word=sc.nextLine();
        String chWord="";
        char[] c = new char[100];
        c=word.toCharArray();
        for(int i=0;i<c.length;i++){
            if(Character.isUpperCase(c[i])){
                chWord+=String.valueOf(c[i]).toLowerCase();
            }
            else {
                chWord+=String.valueOf(c[i]).toUpperCase();
            }
        }
        System.out.println(chWord);
    }
}
