package recursion;

public class SumOfDigits {
    public static int sumDigit(int n){
        if(n>=0 && n<=9){   // if single digit ,no addition just return it and single digits are between 0-9.
            return n;
        }
        int lastDigit = n%10;
        int nm1Digits = n/10;  // this is telling what are remaining numbers
        int sum = lastDigit + sumDigit(nm1Digits);  // sum = 4 + (123)
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigit(1234));
    }
}
