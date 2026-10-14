import java.util.Scanner;

public class oddigit {
    
    public static void odd(int n){
        int a =0;
        if(n==0){
            return;
        }
        while(n>0){
            int z =n%10;
            if(z%2!=0){
                a++;
            }
            n = n/10;

        }
        System.out.println("The number of odd digits in the given number is: "+a);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        odd(n);
        sc.close();

    }    
}