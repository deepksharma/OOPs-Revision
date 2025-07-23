package leetcode;

import java.util.ArrayList;
import java.util.List;

class Ransom {
    public boolean canConstruct(String ransomNote, String magazine) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add(ransomNote);
        list2.add(magazine);
        if(list2.containsAll(list1)){
            return true;
        }
        return false;
    }
}

public class LeetCode383 {

}
