package DSA;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static int[] removeDup(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i< arr.length ; i++){
            set.add(arr[i]);
        }
        int index =0;
        int[] ans = new int[arr.length];
        for(int i : set){
            ans[index++] = i;
        }
        return ans;
    }

    public static char[] removeDuplicate(String s){

        char[] arr = s.toCharArray();
        Set<Character> setchr = new LinkedHashSet<>();
        for(char i : arr){
            setchr.add(i);
        }
        int index = 0;
        char[] ans = new char[setchr.size()];
        for(char j : setchr){
            ans[index++] =  j;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,2,5,6};
        int[] unique = removeDup(arr);
        for(int i : unique){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(removeDuplicate("banana"));
    }
}
