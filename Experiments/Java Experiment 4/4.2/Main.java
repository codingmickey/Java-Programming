import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        Vector v = new Vector(n);
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element no." + (i + 1) + " : ");
            int temp = sc.nextInt();
            v.addElement(new Integer.valueOf(temp));
        }
        System.out.print("Enter the number of element to find frequency of: ");
        int x = sc.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (v.elementAt(i) == x)
                count++;
        }
        System.out.println("The frequency of element " + x + " in the vector is " + count);

    }
}
