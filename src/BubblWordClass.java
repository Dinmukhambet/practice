import java.util.Scanner;

/**
 * Created by Admin on 08.06.2016.
 */
public class BubblWordClass {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
       /* String s;
        s=sc.next();
        System.out.println(s.substring(s.length()/2));
        System.out.println(new StringBuilder(s.substring(0,s.length()/2)).reverse());
        */int numbOfWord;int counter=0;
        numbOfWord=sc.nextInt();
        String[] word= new String[numbOfWord];
        for(int i=0;i<numbOfWord;i++){
            word[i]=sc.next();
            if(word[i].length()<2||word[i].length()>Math.pow(10,5)){
                System.out.println("incorrect word");
                break;
            }
        }

        for(int i=0;i<word.length;i++){
            if(word[i].substring(word[i].length() / 2)
                    .equals(new StringBuilder(word[i].substring(0, word[i].length()/ 2)).reverse().toString())){
                counter+=1;
                //System.out.println("bubbly");
            }
            else if(word[i].substring(0,word[i].length()/4).equals(word[i].substring(word[i].length()/4,word[i].length()/4*2))){
                //System.out.println("bubbly");
                counter+=1;
            }
    }
        System.out.println(counter);


  /* public static boolean isBubblyword(String word){
       int lengthOfWord=word.length();
       int lenOfHalfWord=lengthOfWord/2;
        if(word.substring(lenOfHalfWord).equals(new StringBuilder(word.substring(0, lenOfHalfWord)).reverse())){
            return true;
        }
     else {
            return false;
        }*/
    }
}