package recursion;

public class PrintAllIndex {
    public static void main(String[] args) {
        int[] arr = { 2,3,6,9,8,3,2,3,6,4};
        int x = 3;
        int[] res = allIndices(arr ,x,0 , 0);
        System.out.println(res);
    }
    public static int[] allIndices(int[] arr ,int x , int idx , int count){
        if(idx == arr.length){
            return new int[count];
        }
        if(arr[idx] == x){
            int[] iarr = allIndices(arr , x , idx+1 , count+1);
            iarr[count] = idx;
            return iarr;
        } else {
            int[] iarr = allIndices(arr , x , idx+1, count);
            return iarr;
        }
    }
}
