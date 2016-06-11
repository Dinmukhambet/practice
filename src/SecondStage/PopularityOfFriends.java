package SecondStage;

import java.util.ArrayList;
import java.util.Scanner;

/*
* After getting her PhD, Christie has become a celebrity at her university,
* and her facebook profile is full of friend requests.
* Being the nice girl she is, Christie has accepted all the requests.
Now Kuldeep is jealous of all the attention she is getting from other guys,
so he asks her to delete some of the guys from her friend list.
To avoid a 'scene', Christie decides to remove some friends from her friend list,
since she knows the popularity of each of the friend she has,
 she uses the following algorithm to delete a friend.

Algorithm Delete(Friend):
    DeleteFriend=false
    for i = 1 to Friend.length-1
         if (Friend[i].popularity < Friend[i+1].popularity)
            delete i th friend
            DeleteFriend=true
            break
    if(DeleteFriend == false)
        delete the last friend

Input:
First line contains T number of test cases. First line of each test case contains N, the number of friends Christie currently has and K ,
the number of friends Christie decides to delete. Next lines contains popularity of her friends separated by space.

Output:
For each test case print N-K numbers which represent popularity of Christie friend's after deleting K friends.*/
public class PopularityOfFriends {
    public static void main(String []args){

        Scanner sc = new Scanner (System.in);
       int  amountOfTest=sc.nextInt();
        for(int i=0;i<amountOfTest;i++){
            int sumOfFriend;int toDelete;
            sumOfFriend=sc.nextInt();
            toDelete=sc.nextInt();
            ArrayList<Integer> friendPopularity = new ArrayList<>();
            for (int j=0;j<sumOfFriend;j++){
            friendPopularity.add(new Integer(sc.nextInt()));
            }
            boolean deleteFriend=false;
            for (int j=0;j<toDelete;j++){
            for (int k=0;k<friendPopularity.size();k++){
                if (friendPopularity.get(k)<friendPopularity.get(k+1)){
                    friendPopularity.remove(k);
                    deleteFriend=true;
                    break;
                    }
                }
            }
            if (deleteFriend==false){
                friendPopularity.remove(friendPopularity.size()-1);
            }
            for(Integer listOfPopularity:friendPopularity){
                System.out.print(listOfPopularity+" ");
            }
            System.out.println();
        }
    }
}
