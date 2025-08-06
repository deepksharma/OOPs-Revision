package recursion;

import java.util.Scanner;

public class DisplayArrayByRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0 ; i< arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        displayArr(arr , 0);
    }
    // Ex -> idx se end tk sab print kr de
    // Faith -> idx + 1 se end tk sab print kr de
    public static void displayArr(int[] arr , int idx){
        if(idx == arr.length){
            return;
        }
        System.out.println(arr[idx]);
        displayArr(arr , idx+1);
    }
}
