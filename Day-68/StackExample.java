import java.util.*;
import java.io.*;

public class StackExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String s = sc.nextLine();
            System.out.println(isBalanced(s));
        }
    }

    // Stack-based method for checking balance
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if(c == ')' || c == '}' || c == ']') {
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if((c == ')' && top != '(') ||
                   (c == '}' && top != '{') ||
                   (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
