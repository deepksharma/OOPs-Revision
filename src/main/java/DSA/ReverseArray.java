package DSA;
class ReverseArrayHelper{
    public static int[] rvrseArray(int arr[]){
        int n = arr.length;
        int j =0;
        int[] temp = new int[n];
        for(int i=n-1; i>=0 ; i--){
            temp[j] = arr[i];
            j++;
        }
        return  temp;
    }
}

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int[] result = ReverseArrayHelper.rvrseArray(arr);

        for(int i : result){
             System.out.print(i+" ");
         }
    }
}
