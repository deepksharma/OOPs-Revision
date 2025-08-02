package recursion;

import java.util.Scanner;

public class PrintNtoOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreaseIncrease(n);
    }

    public static void printDecreaseIncrease(int n){

        if(n == 0) return;
        System.out.println(n);
        printDecreaseIncrease(n-1);
        System.out.println(n);

    }
}
