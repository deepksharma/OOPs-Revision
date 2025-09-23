package DSA;

import java.util.HashMap;
import java.util.Map;

public class MaxFrequencyNum {
    public static int maxFreq(int[] arr){
        Map<Integer , Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i , map.getOrDefault(i, 0)+1);
        }
        int maxFreq = Integer.MIN_VALUE;
        int result = arr[0];

       for(int i : arr){
           int freq = map.get(i);
           if(freq > maxFreq){
               maxFreq = freq;
               result = i;
           }
       }
       return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,2,4,2,5,6};
        System.out.println(MaxFrequencyNum.maxFreq(arr));
    }
}
