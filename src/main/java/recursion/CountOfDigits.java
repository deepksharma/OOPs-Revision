package recursion;

public class CountOfDigits {
    public static int countDigits(int n){
        if(n>=0 && n <= 9) return 1;

        int lastDigit = n%10;
        int nm1Digits = n/10;
        int totalCount = 1 + countDigits(nm1Digits);
        return totalCount;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(12345));
    }
}
