package leetcode;

public class LeetCode1021_RemoveOutermostParentheses {

    public static String removePara(String s){

        StringBuilder result = new StringBuilder();
        int open = 0;

        for(char c : s.toCharArray()){
           if(c == '('){
               open++;
              if(open > 1){
                  result.append(c);
              }
           } else if (c == ')') {
               if(open > 1){
                   result.append(c);
               }
               open--;
           }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "(()())()"; // ()()
        System.out.println(removePara(s));
    }
}
