import java.util.Scanner;

public class pattern12 {
    public static void pattern(int n ){
        int a =1;
         for(int i=0;i<n;i++){
            for(int j =0;j<i;j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        pattern(n);



    }
} 