import java.io.*;
import java.util.*;

public class ListExample {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        
        int q = sc.nextInt();
        for(int i=1;i<=q;i++){
            String command = sc.next();
            if(command.equals("Insert")){
                int index = sc.nextInt();
                int value = sc.nextInt();
                l.add(index,value);
            }else{
                int idx=sc.nextInt();
                l.remove(idx);
            }
        }
        for(int i=0;i<l.size();i++){
            System.out.print(l.get(i)+" ");
        }
    }
}