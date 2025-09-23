package DSA;

public class Palindrome {
    public static boolean isPalindrome(String s){
        char[] arr = s.toCharArray();
        int i = 0 ;
        int j = arr.length-1;
        while(i <= j){
            if(arr[i] != arr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("dada"));
    }
}
