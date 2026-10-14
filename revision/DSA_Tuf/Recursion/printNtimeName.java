import java.util.Scanner;

public class printNtimeName {
    public  static void printname(int n , String name){
        if(n== 0){
            return;
        }
        System.out.println(name);
        printname(n-1, name);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter how many times you want to print: ");
            int n = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            if (n > 0) {
                printname(n, name);
            }
        }
    }
}
