import java.util.Scanner;

class Tasks {

    // GCD and LCM
    static int gcd(int a, int b) {
        if (a == 0)
            return b;

        return gcd(b % a, a);
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // x^y
    static int exponent(int x, int y) {
        if (y == 0) {
            return 1;
        }
        return x * exponent(x, y - 1);
    }

    // Fibonacci series
    static void fibonacci(int n, int f, int l) {
        if (n == 0) {
            return;
        }
        System.out.print(f + " ");
        fibonacci(n - 1, l, f + l);
    }

    // Reverse
    static int reverse(int n, int ans) {
        if (n == 0) {
            return ans;
        }
        ans = ans * 10 + n % 10;
        return reverse(n / 10, ans);
    }

    // Sum of n numbers
    static int sumN(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumN(n - 1);
    }

    // Sum of digits
    static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfDigits(n / 10);
    }

}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char c;
        int check, n, a, b, ans;
        do {
            System.out.println("\n----Recursive functions----");
            System.out.println("1 - LCM");
            System.out.println("2 - GCD");
            System.out.println("3 - x^y");
            System.out.println("4 - n Fibonacci numbers");
            System.out.println("5 - Reverse of a number");
            System.out.println("6 - Sum of n numbers");
            System.out.println("7 - Sum of digits");
            System.out.print("\nEnter any of the above option: ");
            check = sc.nextInt();

            switch (check) {
                case 1:
                    System.out.print("Enter the 1st number: ");
                    a = sc.nextInt();
                    System.out.print("Enter the second number: ");
                    b = sc.nextInt();
                    ans = Tasks.lcm(a, b);
                    System.out.println("LCM of " + a + " & " + b + " = " + ans);
                    break;
                case 2:
                    System.out.print("Enter the 1st number: ");
                    a = sc.nextInt();
                    System.out.print("Enter the second number: ");
                    b = sc.nextInt();
                    ans = Tasks.gcd(a, b);
                    System.out.println("GCD of " + a + " & " + b + " = " + ans);
                    break;
                case 3:
                    System.out.print("Enter x: ");
                    a = sc.nextInt();
                    System.out.print("Enter y: ");
                    b = sc.nextInt();
                    ans = Tasks.exponent(a, b);
                    System.out.println(a + "^" + b + " = " + ans);
                    break;
                case 4:
                    System.out.print("Enter the number of terms: ");
                    n = sc.nextInt();
                    if (n < 0) {
                        System.out.println("Enter a number greater than or equal to 0.");
                        break;
                    }
                    Tasks.fibonacci(n, 0, 1);
                    break;
                case 5:
                    System.out.print("Enter the number to reverse: ");
                    n = sc.nextInt();
                    ans = Tasks.reverse(n, 0);
                    System.out.println("Reverse of " + n + " = " + ans);
                    break;
                case 6:
                    System.out.print("Enter the number of terms: ");
                    n = sc.nextInt();
                    if (n <= 0) {
                        System.out.println("Enter a number greater than 0.");
                        break;
                    }
                    ans = Tasks.sumN(n);
                    System.out.println("Sum of n natural numbers = " + ans);
                    break;
                case 7:
                    System.out.print("Enter the number: ");
                    n = sc.nextInt();
                    if (n < 0) {
                        System.out.println("Enter a number greater than or equal to 0.");
                        break;
                    }
                    ans = Tasks.sumOfDigits(n);
                    System.out.println("Sum of the digits of " + n + " = " + ans);
                    break;

                default:
                    System.out.println("Enter a VALID option!");
                    break;
            }

            System.out.print("\nDo you want to exit?(y/Y) or enter any character\n--> ");
            c = sc.next().charAt(0);

        } while (c != 'y' && c != 'Y');
    }
}
