package recursion;

import java.util.Scanner;

public class TowerOFHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int t3 = sc.nextInt();
        ToH(n , t1, t2, t3);
    }
    public static void ToH(int n, int t1 , int t2 ,int t3){
        if(n==0) return;
       ToH(n-1 , t1 , t3 , t2);
        System.out.println(n + "["+t1 + " -> "+ t2 +"]");
       ToH(n-1, t3 , t2 ,t1);
    }
}
