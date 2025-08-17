package backTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode40CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates ,target , new ArrayList<>() , 0 , result);
        return result;
    }
    private void backtrack(int[] candidates , int target , List<Integer> path , int start , List<List<Integer>> result){

        // Base case
        if(target == 0){
            result.add(new ArrayList<>(path));
            return;
        }

        for(int i = start ; i< candidates.length ; i++){

            if( i > start && candidates[i] == candidates[i-1]) continue;

            int num = candidates[i];
            if(num > target){
                break;
            }
            path.add(num);
            backtrack(candidates, target-num, path, i+1, result);
            path.remove(path.size()-1);
        }
    }
    public static void main(String[] args) {
        Leetcode40CombinationSum2 obj = new Leetcode40CombinationSum2();

        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;

        List<List<Integer>> result = obj.combinationSum2(candidates, target);

        System.out.println("Combinations that sum to " + target + ":");
        for(List<Integer> combination : result){
            System.out.println(combination);
        }
    }
}

