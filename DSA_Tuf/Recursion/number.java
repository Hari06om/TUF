public class number {
    public static void num(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        n--;
        num(n);
    }
    public static void main(String args[]){
        int n =4;
        num(n);
    }
}
