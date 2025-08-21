package recursion;

public class PrintElementsOfArray {
    public static void printElements(int[] arr, int idx){
        if(idx == arr.length){
            return ;
        }
        System.out.println(arr[idx]);
        printElements(arr, idx+1);
    }

    public static void main(String[] args) {
        int[] arr = {5,  6, 7, 8};
       printElements(arr , 0);
    }
}
