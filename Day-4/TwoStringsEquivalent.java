package Sem7;

import java.util.*;

public class TwoStringsEquivalent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

	if (s1.length() != s2.length()) {
            System.out.println(false);
            return;
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        // Store frequencies for s1
        for (char ch : s1.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        // Store frequencies for s2
        for (char ch : s2.toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        // Create a set of all characters from both strings
        Set<Character> allChars = new HashSet<>();
        allChars.addAll(map1.keySet());
        allChars.addAll(map2.keySet());

        boolean equivalent = true;

        for (char ch : allChars) {
            int freq1 = map1.getOrDefault(ch, 0);
            int freq2 = map2.getOrDefault(ch, 0);

            if (Math.abs(freq1 - freq2) > 3) {
                equivalent = false;
                break;
            }
        }

        System.out.println(equivalent);
    }
}
