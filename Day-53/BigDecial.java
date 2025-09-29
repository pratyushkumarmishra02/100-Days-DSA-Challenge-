import java.io.*;
import java.util.*;
import java.math.BigDecimal;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        // Sort using BigDecimal but keep original string format
        Arrays.sort(s, 0, n, new Comparator<String>() {
            public int compare(String a, String b) {
                BigDecimal bd1 = new BigDecimal(a);
                BigDecimal bd2 = new BigDecimal(b);
                // Descending order
                return bd2.compareTo(bd1);
            }
        });

        // Print in original format
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
