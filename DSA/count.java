import java.util.Scanner;

public class count{
    public static void cnt(int n){
        int a =0;
        if(n==0){
            return;
        }
        while(n>0){
            a++;
            n = n/10;
        }
        System.out.println("The number of digits in the given number is: "+a);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        cnt(n);
        sc.close();
    }
}