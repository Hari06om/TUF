public class Secondelement {
    public static void Small(int[] arr){            
            int min = Integer.MAX_VALUE;
            int secondmin = 0;

            for(int i = 0; i < arr.length; i++){
                if(arr[i] < min){
                    secondmin = min;
                    min = arr[i];
            } else if(arr[i] < secondmin && arr[i] != min){
                secondmin = arr[i];
            }
        }
            System.out.println("Second min " + secondmin);
    }
    public static void main(String[] args){
        
        int[] arr  = { 0, 1,2 ,4 ,7,7,5};
        Small(arr);

    }
}
