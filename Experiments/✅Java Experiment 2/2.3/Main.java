import java.util.Scanner;

class Prime {
    boolean isPrime(int n) {
        if (n == 1 || n == 0) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.print("Enter the first number: ");
        a = sc.nextInt();

        System.out.print("Enter the second number: ");
        b = sc.nextInt();

        Prime p = new Prime();

        System.out.println("\nThe odd numbers from " + a + " to " + b + " are -");
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
        System.out.println("\n\nThe prime numbers from " + a + " to " + b + " are -");
        for (int i = a; i <= b; i++) {
            if (p.isPrime(i))
                System.out.print(i + " ");
        }

    }
}