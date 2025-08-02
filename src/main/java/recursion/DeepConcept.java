package recursion;

import java.util.Scanner;

public class DeepConcept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pzz(n);
    }
    public static void pzz(int n){
        if(n == 0){
            return;
        }
        System.out.println("Pre"+n); // line1
        pzz(n-1);                 // line 2

        System.out.println("In"+ n);  // line 3
        pzz(n-1);                  // line 4

        System.out.println("Post" + n); // line 5
    }
}
