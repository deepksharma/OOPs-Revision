package DSA;

import java.util.*;

public class HashMapRemoveDublicate {
    public List<Character> removeDupli(String s){
        HashMap<Character , Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        for(char c : arr){
            map.put(c , map.getOrDefault(c,0)+1);
        }
       List<Character> result = new ArrayList<>();
        for(char c : arr){
            if(map.get(c) == 1){
                result.add(c);
            }
        }
        return result;
    }
    public static ArrayList<Integer> removeDuplic(int[] arr){
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer , Boolean> map = new HashMap<Integer, Boolean>();
        for(int i = 0 ; i<arr.length ; i++){
            if(map.containsKey(arr[i])){
                continue;
            }
            output.add(arr[i]);
            map.put(arr[i] , true);
        }
        return output;
    }
    public static List<Integer> usingSet(int[] arr){
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for(int i : arr){
            set.add(i);
        }
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        HashMapRemoveDublicate hrd = new HashMapRemoveDublicate();
        String input = "abbcd";
        System.out.println(hrd.removeDupli(input));

        System.out.println("------------------------------------------------------");


        int[] arr = {1,3,2,4,1,2,2,2,1000,3,2};
        ArrayList<Integer> output =  removeDuplic(arr);
        for(int i =0 ; i< output.size() ; i++){
            System.out.print( output.get(i)+" ");
        }
        System.out.println();
        System.out.println("--------------------------------------------------------");

        System.out.println(usingSet(arr));
    }
}
