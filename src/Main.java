import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb;int array[];int k=0; String s="";
        numb=sc.nextInt();
        while(numb!=42){
            s+=numb+"\n";
            numb=sc.nextInt();

        }
        System.out.println(s);
    }}
