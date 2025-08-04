import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MyRegex myRegex = new MyRegex();
        Pattern p = Pattern.compile(myRegex.pattern);

        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(p.matcher(IP).matches());
        }
    }
}

class MyRegex {
    String pattern = 
        "^((0\\d{2}|\\d{1,2}|1\\d{2}|2[0-4]\\d|25[0-5])\\.){3}"
      + "(0\\d{2}|\\d{1,2}|1\\d{2}|2[0-4]\\d|25[0-5])$";
}
