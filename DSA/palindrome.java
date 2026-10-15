import java.util.Scanner;
public class palindrome {
    public static boolean pal(String s,int l ,int h ){ 
        // String s = Integer.toString(n);
        // int l  =0;
        // int h = s.length()-1;
        // while(l<h){
        //     if(s.charAt(l)!=s.charAt(h)){
        //         return false ;
        //     }
        //     l++;
        //     h--;
        // }
        // return true;
      
        
        //recursion method 
        if(l>=h){
            return true;
        }
        if(s.charAt(l)!=s.charAt(h)){
            return false;
        }
        return  pal(s,l+1,h-1);
    }   
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
          String s = Integer.toString(a);
        int l =0 ;
        int h = s.length()-1;
        if(pal(s,0,s.length()-1)){
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("The number is not palindrome");
        }

    }    
}
