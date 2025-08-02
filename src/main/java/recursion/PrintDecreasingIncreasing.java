package recursion;

import java.util.Scanner;

public class PrintDecreasingIncreasing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintDecrease(n);
//        PrintIncrease(n);

    }
    public static void PrintDecrease(int n){
        if(n == 0) {
            return;
        }
        System.out.println(n);
        PrintDecrease(n-1);
    }
    public static void PrintIncrease(int n){
        if(n==6) return;
        PrintIncrease(n+1);
        System.out.println(n);
    }
}
