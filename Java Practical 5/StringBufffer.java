import java.util.*;

public class StringBufffer {
    public static void main(String[] args) {

        String m, rev;
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        System.out.print("Enter a String: ");
        m = sc.nextLine();
        sb.append(m);
        sb.reverse();
        rev = sb.toString();

        if (m.equalsIgnoreCase(rev)) {
            System.out.println(m + " is a Palindrome!");
        } else {
            System.out.println(m + " is not a Palindrome!");
        }

    }
}
