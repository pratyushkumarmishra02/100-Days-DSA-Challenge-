import java.util.*;
import java.io.*;

public class MapExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 

        Map<String, String> phoneBook = new HashMap<>();
        for(int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String number = sc.nextLine();
            phoneBook.put(name, number);
        }

        while(sc.hasNextLine()) {
            String query = sc.nextLine();
            if(phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            } else if (!query.isEmpty()) {
                System.out.println("Not found");
            }
        }
    }
}
