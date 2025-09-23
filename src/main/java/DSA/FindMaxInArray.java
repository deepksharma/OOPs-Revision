package DSA;

public class FindMaxInArray {

    public static int max(int[] arr){
        int maxInt = Integer.MIN_VALUE;
        for(int i : arr){
            maxInt = Math.max(maxInt ,i);
        }
        return maxInt;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,3,8};
        System.out.println(max(arr));
    }
}
