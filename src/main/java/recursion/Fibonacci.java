package recursion;
class Findfibo{
    public static int fib(int n){
        // base case
        if(n == 0 || n == 1){
            return n;
        }
        int prev = fib(n-1);
        int prevPrev = fib(n-2);

        // 0 1 1 2 3 5 8 13  -> Fibonacci series
        //  5 + 8 = 13  -> prev(n-1) + prevPrev(n-2)
         return prev + prevPrev;

    }
}

public class Fibonacci {
    public static void main(String[] args) {
        // if you want to print upto n
//        int n = 6;
//        for(int i = 0 ; i<= n ; i++){
//            System.out.print(Findfibo.fib(i)+" ");
//        }

        // if directly print that no.
        System.out.println(Findfibo.fib(6));
    }

}
