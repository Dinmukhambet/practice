import java.util.Scanner;

/*You have been given a String S
S consisting of uppercase and lowercase English alphabets.
You need to change the case of each alphabet in this String.
That is, all the uppercase letters should be converted to lowercase
and all the lowercase letters should be converted to uppercase.
You need to then print the resultant String to output.*/
public class ToggleStringClass {
    public static void main(String[] args) {
        String word;
        Scanner sc= new Scanner(System.in);
        word=sc.nextLine();
        StringBuffer stringBuffer= new StringBuffer(word.length());
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                stringBuffer.append(Character.toLowerCase(word.charAt(i)));
            }
            else {
                stringBuffer.append(Character.toUpperCase(word.charAt(i)));
            }
        }
        System.out.println(stringBuffer.toString());
    }
}
