import java.io.IOException;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m;

        System.out.println("Enter a month: ");
        m = sc.nextInt();

        // throw keyword
        try {
            if (m < 1 || m > 12)
                throw new MonthFormatException("Exception occured");

            System.out.println("Month is " + m);

        } catch (MonthFormatException e) {
            System.out.println("Enter a valid month");
        }

    }
}

class MonthFormatException extends Exception {
    MonthFormatException(String s) {
        System.out.println(s);
    }
}