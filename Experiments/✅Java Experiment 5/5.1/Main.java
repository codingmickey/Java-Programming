import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        if (isMeta(str1, str2))
            System.out.println("The given strings " + str1 + " & " + str2 + " are Meta strings");
        else
            System.out.println("The given strings " + str1 + " & " + str2 + " are NOT Meta strings");
    }

    static boolean isMeta(String a, String b) {
        if (a.length() != b.length())
            return false;
        int count = 0;
        int pairs[] = new int[a.length()];
        int index = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                count++;
                pairs[index] = i;
                index++;
            }
        }

        if (count != 2)
            return false;
        StringBuffer sb = new StringBuffer(a);
        sb.setCharAt(pairs[0], a.charAt(pairs[1]));
        sb.setCharAt(pairs[1], a.charAt(pairs[0]));

        return sb.toString().equals(b);
    }
}
