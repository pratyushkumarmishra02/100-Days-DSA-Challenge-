 import java.util.Scanner;

public class Factorial {
    public static long factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();

        System.out.println("Factorial of " + n + " is: " + factorial(n));
        scan.close();
    }
}
