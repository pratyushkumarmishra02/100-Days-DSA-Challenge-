import java.util.*;
class LCS{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        String s1 = sc.nextLine().toLowerCase();
        String s2 = sc.nextLine().toLowerCase();
        String s = "[aeiou]";
        Set<Character> set = new HashSet<>();
        Set<Character> set1 = new HashSet<>();
        for(char c1:s1.toCharArray()){
            if(s.indexOf(c1)!=-1){
                set.add(c1);
            }
        }
        for(char c2:s2.toCharArray()){
            if(s.indexOf(c2)!=-1){
                set1.add(c2);
            }
        }

        set.retainAll(set1);
        System.out.println(set.size());
    }
}