import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] s1 = s.trim().split("[^A-Za-z]+");
        List<String> l = new ArrayList<>();
        for(String word:s1){
            if(!word.isEmpty()){
                l.add(word);
            }
        }
        System.out.println(l.size());
        
        for(String sc : l){
            System.out.println(sc);
        }
        scan.close();
    }
}

