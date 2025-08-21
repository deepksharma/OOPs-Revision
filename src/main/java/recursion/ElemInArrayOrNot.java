package recursion;

public class ElemInArrayOrNot {
    public static boolean presentOrNot(int[] arr ,int target , int idx){
        if(idx == arr.length){
            return false;
        }
       if(arr[idx] == target) return true;
//       if(presentOrNot(arr ,target , idx+1)){
//           return true;
//       }else {
//           return false;
//       }
        return presentOrNot(arr, target ,idx+1);
    }

    // return index of target
    public static int findIndex(int[] arr, int target , int idx){
//        if(idx >= target){
//            return -1;
//        }
        if(idx == arr.length-1){
            return arr[idx];
        }
         if(arr[idx] == target) return idx;
         return findIndex(arr, target, idx+1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4,2,5,7,9};
        int target = 9;
       // System.out.println(presentOrNot(arr, target ,0));
        System.out.println(findIndex(arr, target ,0));
    }

}
