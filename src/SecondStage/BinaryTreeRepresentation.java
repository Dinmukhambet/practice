package SecondStage;

import java.util.ArrayList;
import java.util.Scanner;

/*
https://www.hackerearth.com/problem/algorithm/mirrors-and-trees/
*
* */
public class BinaryTreeRepresentation {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int testCase=sc.nextInt();
        for (int i=0;i<testCase;i++){
            ArrayList<Integer> reflections = new ArrayList<>();
            int sizeOfArray=sc.nextInt();
            int []arrayOfTree = new int [sizeOfArray] ;
            for (int j=0;j<arrayOfTree.length;j++){
                arrayOfTree[j]=sc.nextInt();
            }
            for (int j=0;j<arrayOfTree.length;j++){
               if (j%2==0&&arrayOfTree[j]>0){
                   reflections.add(arrayOfTree[j]);
               }
            }
            for (int j=0;j<arrayOfTree.length;j++){
                if (j%2!=0&&arrayOfTree[j]>0){
                    reflections.add(arrayOfTree[j]);
                }
            }
            for (Integer reflection:reflections){
                System.out.println(reflection);
            }
            System.out.println();

        }
    }
}
