package SecondStage;

/**
 * Created by Admin on 09.06.2016.
 */
import java.util.Scanner;
public class SwappinGame {
    /*Sherlock and Watson are playing swapping game.
    Watson gives to Sherlock a string S on which he has performed K swaps.
    You need to help Sherlock in finding the original string.
One swap on a string is performed in this way:
Assuming 1 indexing, the i'th letter from the end is inserted between i'th and (i+1)'th letter from the starting.
Input:
First line contains K, the number of swaps performed by Watson.
Next line contains S, the string Watson gives to Sherlock.
Output:
You have to print in one line the original string with which Watson had started.*/
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int numberOfSwap=sc.nextInt();int j=0;
        String s=sc.next();
        StringBuilder sb = new StringBuilder(s);
      while (j!=numberOfSwap) {
          int count;
          if(s.length()%2==0){
              count = (s.length()-1) / 2;}
          else{count=s.length()/2;}
          for (int i = 0; i < count; i++) {
              sb.insert(i + (1 + i), s.substring(s.length() - (i + 1), s.length() - i));
              sb.deleteCharAt(s.length());
          }
          s=sb.toString();
          j++;
      }
        System.out.println(s);
    }
}
