package DSA;

import java.util.*;

/*public class GenerateParenthesesRecursionDebug {

    public static List<String> generateParenthesis(int n) {
        if (n == 0) {
            List<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        List<String> prev = generateParenthesis(n - 1);
        Set<String> current = new HashSet<>();

        System.out.println("\n--- Generating for n = " + n + " ---");
        System.out.println("Previous list: " + prev);

        for (String s : prev) {
            System.out.println("\nProcessing string: \"" + s + "\"");
            for (int i = 0; i <= s.length(); i++) {
                String before = s.substring(0, i);
                String after = s.substring(i);
                String newStr = before + "()" + after;

                System.out.printf(
                        "i = %d -> before: \"%s\", after: \"%s\", newStr: \"%s\"\n",
                        i, before, after, newStr
                );

                current.add(newStr);
            }
        }

        return new ArrayList<>(current);
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> res = generateParenthesis(n);
        System.out.println("\nFinal result for n=" + n + ": " + res);
    }
}*/

import java.util.*;

public class GenerateParentheses {
    public static List<String> generateParenthesis(int n) {
        if (n == 0) {
            List<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        List<String> prev = generateParenthesis(n - 1);
        Set<String> current = new HashSet<>();
        for (String s : prev) {
            for (int i = 0; i <= s.length(); i++) {
                String before = s.substring(0, i);
                String after = s.substring(i);
                String newStr = before + "()" + after;
                current.add(newStr);
            }
        }
        return new ArrayList<>(current);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParenthesis(n));
    }
}
