import java.util.*;

class Student {
    int id;
    String name;
    double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double cgpa = sc.nextDouble();
            students.add(new Student(id, name, cgpa));
        }

        // Sort based on custom comparator logic
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (Double.compare(s2.cgpa, s1.cgpa) != 0) {
                    // Sort by CGPA decreasing
                    return Double.compare(s2.cgpa, s1.cgpa);
                } else {
                    // Sort by name alphabetically
                    int nameCompare = s1.name.compareTo(s2.name);
                    if (nameCompare != 0) {
                        return nameCompare;
                    } else {
                        // Sort by id ascending
                        return Integer.compare(s1.id, s2.id);
                    }
                }
            }
        });

        // Print the ordered list of student names
        for (Student s : students) {
            System.out.println(s.name);
        }
    }
}
