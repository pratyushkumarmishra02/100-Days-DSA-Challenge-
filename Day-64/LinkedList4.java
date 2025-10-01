import java.util.*;

public class LinkedList4 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(10);
        ll.add(20);
        ll.addLast(30);
        ll.add(40);

        for(int i=0;i<ll.size();i++){
            System.out.print(ll.get(i)+"->");
        }
        System.out.println("Null");
    }
    
}
