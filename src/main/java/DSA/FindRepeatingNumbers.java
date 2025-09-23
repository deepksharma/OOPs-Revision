package DSA;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindRepeatingNumbers {
    public static void main(String[] args) {
        int[] arr = {4,3,4,5,2,3,1};

        // HashSet Method
        Set<Integer> seen = new HashSet<>();
        Set<Integer> repeating = new HashSet<>();

        for(int i : arr){
            if(seen.contains(i)){   // already seen i.e we can add in duplicate
                repeating.add(i);
            }else{
                seen.add(i);  // we reached in else that means havent seen so add in seen.
            }
        }
        System.out.println(repeating);


        // HashMap Method
        Map<Integer , Integer> map = new HashMap<>();
        // to store
        for(int i : arr){
            map.put(i , map.getOrDefault(i ,0)+1);
        }
        // to print
        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() +"->"+ entry.getValue()+"times");
            }
        }
    }
}
