class Geeks {
    // Function to insert element
    public static void insert(ArrayList<Character> clist, char c) {
        clist.add(c);  
    }

    // Function to count frequency of element
    public static void freq(ArrayList<Character> clist, char c) {
        if (clist.contains(c)) {  
            int frequency = Collections.frequency(clist, c); 
            System.out.println(frequency);  
        } else {
            System.out.println(-1); 
        }
    }
}