package recursion;

public class SumOfArray {
    public static int printSumofElements(int[] arr,int idx){
        // Base case
//        if(idx == arr.length-1){        -> if only last item return single item
//            return arr[idx];
//        }
//             OR
        if(idx == arr.length){       //  -> if u looking for no. which is out of bound return nothing.
            return 0;
        }
        int sumOfArray = printSumofElements(arr , idx+1);
        return sumOfArray + arr[idx];
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,9,4};
        System.out.println(printSumofElements(arr,0));

    }
}
