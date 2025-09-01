package recursion;

import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String s = sc.next();  // it will take just word once given space ,it will print after space
        String s1 = sc.nextLine(); // it will everything with or without space whatever given in single line.

        // arr = {1,2,3,} , arr[0]
        char ch = s1.charAt(0);
        System.out.println(s.substring(2,6)); // 2,3,4,5
    }
}
