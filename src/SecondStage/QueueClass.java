package SecondStage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
* Monk was asked to answer some queries in an interview. He is given an empty array A.
* Queries are of 4 types:-
1. 1 X - Add number X to the array A.
2. 2 X - Remove a single instance of number X from the array A.
If not possible, print "-1" without the quotes.
3. 3 - Find the maximum element in the array A.
4. 4 - Find the minimum element in the array A.

Input:
The first line contains the integer Q.
The next Q lines will each contain a query like the ones mentioned above.

Output:
For queries 3 and 4, print the answer in a new line.
If the array is empty for query 3 and 4, then print "-1" without the quotes.
*/
public class QueueClass {
    public static void main(String []args){
        int numb;
        ArrayList<Integer> list = new ArrayList<>();//список для входящих данных
        ArrayList<Integer> listOfOutput= new ArrayList<>();//список для исходящих данных
        Scanner sc = new Scanner(System.in);
        numb=sc.nextInt();//ввод количества запросов
        int number;

        for (int i=0;i<numb;i++){
           int query=sc.nextInt();// ввод самого запроса
            switch (query){// обработка запроса через свич
                case 1 :
                    number=sc.nextInt();
                    list.add(new Integer(number));
                    break;
                case 2:
                    number=sc.nextInt();
                    if (list.contains(new Integer(number))){
                        list.remove(new Integer(number));}
                    else {
                        listOfOutput.add(-1);

                    }
                    break;
               case 3:
                    Collections.sort(list);
                   listOfOutput.add( list.get(list.size()-1));
                    break;
                case 4:
                    Collections.sort(list);
                    listOfOutput.add(list.get(0));
                    break;
            }
        }
        //список выходных данных с попмощью foreach
        for (Integer query:listOfOutput) {
            System.out.println(query);
        }
    }
}
