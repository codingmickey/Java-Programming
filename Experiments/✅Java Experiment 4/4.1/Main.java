import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of list items: ");
        int n = sc.nextInt();

        Vector v = new Vector(n);
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Item no." + (i + 1) + " : ");
            String temp = sc.nextLine();
            v.addElement(new String(temp));
        }

        int choice;

        do {
            System.out.println("\n1. Print the contents of the vector");
            System.out.println("2. Add an element at the specified location");
            System.out.println("3. Delete an element in the vector");
            System.out.println("4. Exit");
            System.out.print("\nEnter any of the following options: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(v + "\n");
                    break;
                case 2:
                    System.out.print("Enter the item to insert: ");
                    sc.nextLine();
                    String val = sc.nextLine();
                    System.out.print("Enter the index to insert at(0 - " + v.size() + "): ");
                    int pos = sc.nextInt();
                    v.insertElementAt(val, pos);
                    System.out.println(val + " was added to the list.");
                    break;
                case 3:
                    System.out.print("Enter the index to delete(0 - " + v.size() + "): ");
                    int i = sc.nextInt();
                    System.out.println(v.remove(i) + " was removed from the list.");
                    break;

                default:
                    System.out.println("Enter a VALID choice!");
            }

        } while (choice != 4);
    }
}
