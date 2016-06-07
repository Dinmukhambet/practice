import java.util.Scanner;
public class FactorialClass {
    public static void main(String[] args) {
        int number,factorialOfNumb=1;
        Scanner sc= new Scanner(System.in);
                number= sc.nextInt();
        for(int i=1;i<=number;i++){
            factorialOfNumb*=i;
        }
        System.out.println(factorialOfNumb);
    }
}
