import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<String> inputStrings = new ArrayList<>();
        for(int i = 0;i<n;i++){
            String input = sc.nextLine();
            inputStrings.add(input);
        }
        for(String s : inputStrings){
            try {
                Pattern.compile(s); 
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
    }
}
