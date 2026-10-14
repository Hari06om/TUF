public class sum {
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        int sum =0;
        sum = sum + n;
        return sum + sum(n-1);
    }
    public static void main(String args[]){
        int n =10;
        System.out.println(sum(n));
        
    }

}
