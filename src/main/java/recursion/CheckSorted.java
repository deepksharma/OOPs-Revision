package recursion;

public class CheckSorted {
    public static boolean isSorted(int[] arr, int idx , int n ){
        // Base case
        if(idx == n-1){    // means it reached to last still everything is sorted. Or we can write (n==0) return true
            return true;
        }
        // self work
        if(arr[idx] > arr[idx+1]){
            return false;
        }
        return isSorted(arr, idx+1, n);

    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        System.out.println(isSorted(arr1 , 0 , arr1.length));

        int[] arr2 = {1,3,2,4,5};
        System.out.println(isSorted(arr2, 0 , arr2.length));
    }
}
