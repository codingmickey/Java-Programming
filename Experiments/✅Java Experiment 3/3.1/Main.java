import java.util.Scanner;

class Vampire {

    static int a[] = new int[4];
    static int x;

    static boolean checkVampire(int n) {
        x = n;
        for (int i = 0; i < 4; i++) {
            a[i] = n % 10;
            n /= 10;
        }

        if (ans())
            return true;
        swap(2, 3);
        if (ans())
            return true;
        swap(0, 1);
        if (ans())
            return true;
        swap(2, 3);
        if (ans())
            return true;

        swap(0, 2);

        if (ans())
            return true;
        swap(2, 3);
        if (ans())
            return true;
        swap(0, 1);
        if (ans())
            return true;
        swap(2, 3);
        if (ans())
            return true;

        swap(1, 3);

        if (ans())
            return true;
        swap(2, 3);
        if (ans())
            return true;
        swap(0, 1);
        if (ans())
            return true;
        swap(2, 3);
        if (ans())
            return true;

        return false;
    }

    static void swap(int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static boolean ans() {
        return (a[0] * 10 + a[1]) * (a[2] * 10 + a[3]) == x;
    }

    static int noOfDigits(int n) {
        int ans = 0;
        while (n > 0) {
            ans++;
            n /= 10;
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter the 4 digit number: ");
        n = sc.nextInt();

        if (Vampire.noOfDigits(n) == 4) {
            if (Vampire.checkVampire(n))
                System.out.println("The number " + n + " is a vampire number.");
            else
                System.out.println("The number " + n + " is NOT a vampire number.");
        } else {
            System.out.println("Enter a 4 DIGIT number!");
        }

    }
}
