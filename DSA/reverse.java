import java.util.Scanner;

public class reverse {
    public static void rev(int n){
        int a = 0;
        if(n==0){
            return;
        }
        while(n>0){
            int z = n%10;
            a = a*10+z;
            n = n/10;
        }
        System.out.println("The reverse of the given number is: "+a);
    }   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        rev(n);
        sc.close();
    } 
}
