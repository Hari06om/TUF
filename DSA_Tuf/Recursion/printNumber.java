
import java.util.Scanner;

public class printNumber {
    public static void printnum(int n ){
        if(n==0){
            return;
        }
        System.out.println(n);
        printnum(n-1);
    }   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        printnum(n);
        sc.close();
    }
}