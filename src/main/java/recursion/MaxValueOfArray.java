package recursion;

public class MaxValueOfArray {
    public static int printMax(int[] arr , int idx){
        // Base case
        if(idx == arr.length -1){
            return arr[idx];
        }

        int smallProblem = printMax(arr , idx+1);
        int result = Math.max(arr[idx] , smallProblem);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3,10,3,2,5};
        System.out.println(printMax(arr,0));
    }
}
