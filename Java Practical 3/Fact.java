import java.util.Scanner;

class Meth {
    static int fact(int n) {
        if (n == 1)
            return 1;
        else
            return n * fact(n - 1);
    }
}

public class Fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Factorial = " + Meth.fact(n));
    }
}

// import java.util.Scanner;

// public class Fact {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// System.out.print("Enter a number: ");
// int n = sc.nextInt();

// int f = fact(n);
// System.out.print("Factorial = " + f);
// }

// static int fact(int n) {
// if (n == 1)
// return 1;
// else
// return n * fact(n - 1);
// }
// }
