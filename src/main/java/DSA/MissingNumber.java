package DSA;

import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,3,3,4,4,5,7,8,9,1};

        Set<Integer> set = new LinkedHashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i : arr){
            set.add(i);
        }
        // we should be iterating till max no. present in array not to set.size()
        // Eg - arr = {2,3,7}  size is 3 so loop would check only 1,2
        // But clearly no. 4,5,6 are missing, and would never check

        int max = Collections.max(set);

        for(int i = 1 ; i< max ; i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        System.out.println(list);


    }
}
