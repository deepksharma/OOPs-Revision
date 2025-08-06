package recursion;

public class MaxOfArray {
    public static void main(String[] args) {
        int[] arr = {3 ,2,6,8,9};
        int result = maxOfArray(arr , 0);
        System.out.println(result);

    }
    public static int maxOfArray(int[] arr , int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }

        int maxOfSmallerArray = maxOfArray(arr , idx +1);
        if(maxOfSmallerArray > arr[idx]){
            return maxOfSmallerArray;
        }else {
            return arr[idx];
        }
    }
}
