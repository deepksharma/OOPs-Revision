package recursion;

public class LastIndex {
    public static void main(String[] args) {
        int[] arr = { 2 , 3, 4 ,5,6,3,2,};
        int x = 2;
        int li = lastIndex(arr , 0 ,x);
        System.out.println(li);
    }
    public static int lastIndex(int[] arr, int idx , int x){
        if(idx == arr.length) return -1;

        int lstIndexInSmallArr = lastIndex(arr , idx+1 , x);
        if(lstIndexInSmallArr == -1){
            if(arr[idx] == x){
                return idx;
            }else{
                return -1;
            }
        }else{
            return lstIndexInSmallArr;
        }

    }
}
