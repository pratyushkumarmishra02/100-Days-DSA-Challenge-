import java.util.*;

public class Solution {

    static class Pair {
        String first, second;
        public Pair(String first, String second) {
            this.first = first;
            this.second = second;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Pair)) return false;
            Pair p = (Pair) o;
            return first.equals(p.first) && second.equals(p.second);
        }
        @Override
        public int hashCode() {
            return Objects.hash(first, second);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        Set<Pair> set = new HashSet<>();
        for (int i = 0; i < t; i++) {
            String first = s.next().trim();
            String second = s.next().trim();
            Pair p = new Pair(first, second);
            set.add(p);
            System.out.println(set.size());
        }
    }
}
