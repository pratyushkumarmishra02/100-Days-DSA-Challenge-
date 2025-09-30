import java.util.*;

class Comparator {
    // Compare two integers
    public boolean compare(int a, int b) {
        return a == b;
    }

    // Compare two strings
    public boolean compare(String a, String b) {
        return a.equals(b);
    }

    // Compare two integer arrays
    public boolean compare(int[] a, int[] b) {
        if (a.length != b.length)
            return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = Integer.parseInt(scan.nextLine().trim());
        Comparator comparator = new Comparator();
        for (int t = 0; t < T; t++) {
            int type = Integer.parseInt(scan.nextLine().trim());
            if (type == 1) {
                String a = scan.nextLine();
                String b = scan.nextLine();
                System.out.println(comparator.compare(a, b) ? "Same" : "Different");
            } else if (type == 2) {
                int a = Integer.parseInt(scan.nextLine().trim());
                int b = Integer.parseInt(scan.nextLine().trim());
                System.out.println(comparator.compare(a, b) ? "Same" : "Different");
            } else if (type == 3) {
                int n = Integer.parseInt(scan.nextLine().trim());
                int[] a = new int[n];
                for (int i = 0; i < n; i++)
                    a[i] = scan.nextInt();
                int m = Integer.parseInt(scan.nextLine().trim());
                int[] b = new int[m];
                for (int i = 0; i < m; i++)
                    b[i] = scan.nextInt();
                scan.nextLine(); // consume the rest of the line
                System.out.println(comparator.compare(a, b) ? "Same" : "Different");
            }
        }
        scan.close();
    }
}