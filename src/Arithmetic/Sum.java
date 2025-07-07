package Arithmetic;

public class Sum {
    public static int sum(int n){
        //base case if n is 1 the sum is 1
        if (n==1){
            return 1;
        }else{
            //recursive case: n + sum n-1
            return n + sum(n-1);
        }
    }
    public static void main (String[] args){
        int result = sum(20);
        System.out.println("Sum: "+result);
    }
}

