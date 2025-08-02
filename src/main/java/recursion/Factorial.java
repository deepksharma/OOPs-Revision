package recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = findFactorial(5);
        System.out.println(f);
    }
    public static int findFactorial(int n){
        if(n==1) {
            return 1;
        }
        int fm1 =  findFactorial(n - 1);
        int finalfac = fm1 * n;
        return finalfac;
    }
}
