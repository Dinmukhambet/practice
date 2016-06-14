package SecondStage;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Admin on 15.06.2016.
 */
public class NeedleinTheHaystack {
public static  void main(String [] args){
        Scanner sc = new Scanner(System.in);
       int testCase= sc.nextInt();
        for (int i=0;i<testCase;i++){
            String pattern,textString;
            pattern=sc.next();
            textString=sc.next();
            StringBuffer sb = new StringBuffer(pattern);
            ArrayList <String>answer = new ArrayList<>();
            if (textString.contains(sb)||textString.contains(sb.reverse())){
                answer.add("YES");
            }
            else {
                answer.add("NO");
            }
            for (String output:answer){
                System.out.println(output);
            }
        }
    }
}
