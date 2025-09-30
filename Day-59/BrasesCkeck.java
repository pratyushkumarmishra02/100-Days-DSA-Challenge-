import java.util.*;

class Parser {
    public String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '{' || c == '(') {
                stack.push(c);
            } else if (c == '}' || c == ')') {
                if (stack.isEmpty()) return "false";
                char top = stack.pop();
                if ((c == '}' && top != '{') || (c == ')' && top != '(')) {
                    return "false";
                }
            }
        }
        return stack.isEmpty() ? "true" : "false";
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine().trim());
        Parser parser = new Parser();
        for (int i = 0; i < n; i++) {
            String s = scan.nextLine();
            System.out.println(parser.isBalanced(s));
        }
    }
}