
// https://www.w3schools.com/java/ref_string_hashcode.asp
import java.util.Scanner;

public class Streng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("String with toLowerCase(): " + s.toLowerCase());
        System.out.println("String with toUpperCase(): " + s.toUpperCase());
        System.out.println("String with trim(): " + s.trim());
        System.out.println("String with substring(): " + s.substring(4));
        System.out.println("String with length(): " + s.length());
        System.out.println("String with hashCode(): " + s.hashCode());
        System.out.println("String with charAt(): " + s.charAt(7));
    }
}