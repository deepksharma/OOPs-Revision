package recursion;

// Find sum of series : 1 -2 +3 -4 +5...n

public class SumOFAlterSeries {
    public static int alterSign(int n){
        if(n==0){
            return 0;
        }
        if(n%2==0){  // even no. are getting subtracted
            return alterSign(n-1) - n;
        }else{
            return alterSign(n-1) + n; // odd no. are getting added.
        }
    }

    public static void main(String[] args) {
        System.out.println(SumOFAlterSeries.alterSign(5));
    }
}
