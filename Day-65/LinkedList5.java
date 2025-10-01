import java.util.*;

public class LinkedList5 {
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

        System.out.println(ll.size());

        ll.removeFirst();
        System.out.println(ll.size());
        ll.remove(1);

        for(int i=0;i<ll.size();i++){
            System.out.print(ll.get(i)+"->");
        }
        System.out.println("Null");
    }
    
}
