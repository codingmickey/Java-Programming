import java.io.IOException;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m;

        System.out.println("Enter a month: ");
        m = sc.nextInt();

        // throw keyword
        try {
            if (m < 1 || m > 12)
                throw new NumberFormatException();
            System.out.println("Month is " + m);

        } catch (NumberFormatException e) {
            System.out.println("Enter a valid month");
        }

    }
}
