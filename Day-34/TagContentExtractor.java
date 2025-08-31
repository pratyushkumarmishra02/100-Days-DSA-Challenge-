import java.io.*;
import java.util.*;
import java.util.regex.*;

public class TagContentExtractor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        
        //pattern 
        Pattern tagPattern = Pattern.compile("<([^>/]+)>([^<>]+)</\\1>");

        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            Matcher m = tagPattern.matcher(line);
            boolean found = false;
            while (m.find()) {
                System.out.println(m.group(2));
                found = true;
            }
            if (!found) {
                System.out.println("None");
            }
        }
    }
}
