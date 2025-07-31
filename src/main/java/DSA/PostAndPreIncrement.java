package DSA;

import java.util.Arrays;

public class PostAndPreIncrement{
    public static void main(String[] args) {

        int[] arr = new int[6];

        int index = 0;
        arr[index++] = 10;
        arr[index++] = 20;
        arr[index++] = 30;

        // since it has ++ it already came to next index and then we used ++index
        // because of this it shifted to next. That's why we got 0 after 30.

        // Pre increment
        arr[++index] = 50;

        System.out.println(Arrays.toString(arr));
    }
}

