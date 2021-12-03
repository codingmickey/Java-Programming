import java.util.Scanner;

class Calculate {

    static int gcd(int a, int b) {

        if (a == 0)
            return b;

        return gcd(b % a, a);
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}

public class Recursion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program to find the GCD and LCM.");

        System.out.print("Enter the 1st number: ");
        int x = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int y = sc.nextInt();

        int gcd = Calculate.gcd(x, y);
        int lcm = Calculate.lcm(x, y);

        System.out.println("LCM of the 2 numbers is " + lcm);
        System.out.println("GCD of the 2 numbers is " + gcd);
    }
}
