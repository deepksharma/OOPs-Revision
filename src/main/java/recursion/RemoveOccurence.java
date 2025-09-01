package recursion;

public class RemoveOccurence {
    public static String removeOccurence(String s , int idx){
        // base case
        if(idx == s.length()) return "";

        // recursive call
        String smallAns = removeOccurence(s, idx + 1);

        char currChar = s.charAt(idx);
        if(currChar != 'a'){
            return currChar + smallAns;
        }else {
            return smallAns;
        }

    }

    public static void main(String[] args) {
        String s = "wallah";
        System.out.println(removeOccurence(s,0));
    }
}
