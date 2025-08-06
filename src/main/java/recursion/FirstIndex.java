package recursion;

public class FirstIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 6, 2};
        int x = 2;
        int ans = findFirstIndex(arr, 0, x);
        System.out.println(ans);
    }
    public static int findFirstIndex(int[] arr,int idx ,int x){
        if (idx == arr.length) return -1;

        if (arr[idx] == x) return idx;

        return findFirstIndex(arr, idx + 1, x);
    }
}
