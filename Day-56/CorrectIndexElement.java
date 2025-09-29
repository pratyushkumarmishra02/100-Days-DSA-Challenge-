import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        List<ArrayList<Integer>> al = new ArrayList<>();
        for(int i=0;i<n;i++){
            int k = sc.nextInt();
            ArrayList<Integer> al1 = new ArrayList<>();
            for(int j=0;j<k;j++){
                int e = sc.nextInt();
                al1.add(e);
            }
            al.add(al1);
        }
        int q = sc.nextInt();
        for(int l=0;l<q;l++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x-1>=0 && x-1<al.size()){
                ArrayList<Integer> row = al.get(x-1);
                if(y-1>=0 && y-1<row.size()){
                    System.out.println(row.get(y-1));
                }else{
                    System.out.println("ERROR!");
                }
            }else{
                    System.out.println("ERROR!");
           }
        }
    }
}