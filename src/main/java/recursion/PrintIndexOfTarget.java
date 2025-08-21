package recursion;

// Given array arr of size N and integer X. The task is to find all the indices of the integer X in the array.

import java.util.ArrayList;

public class PrintIndexOfTarget {
  /*  public static void returnIndex(int[] arr,int n, int target, int idx){
        // base case
         if(idx >= n) return;
        // self work
        if(arr[idx] == target){
            System.out.println(idx);
        }
        // recursive
        returnIndex(arr,n ,target , idx+1);
    }
    */
    public static ArrayList<Integer> allIndices(int[] arr , int n , int target ,int idx){
        // Base case
        if(idx >= n){
            return new ArrayList<>();
        }
        // self work
        ArrayList<Integer> ans = new ArrayList<>();
        if(arr[idx] == target){
            ans.add(idx);
        }
        ArrayList<Integer> smallAns = allIndices(arr, n, target, idx + 1);
        ans.addAll(smallAns);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,4,5,4,8,4};
        int target = 4;
        int n = arr.length;
      //  returnIndex(arr,n , target , 0);
        ArrayList<Integer> ans = allIndices(arr , n , target ,0);
        System.out.println(ans.toString());
    }
}
