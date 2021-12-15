import java.util.*;

class Student {
    String name;
    int id, maths, physics, chemistry, total = 0;
    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.print("Enter the name: ");
        name = sc.nextLine();
        System.out.print("Enter id: ");
        id = sc.nextInt();
        System.out.print("Enter the marks of Maths: ");
        maths = sc.nextInt();
        System.out.print("Enter the marks of Physics: ");
        physics = sc.nextInt();
        System.out.print("Enter the marks of Chemistry: ");
        chemistry = sc.nextInt();

        total = maths + physics + chemistry;
    }

    void output() {
        System.out.println(name + "\t\t" + id + "\t" + maths + "\t" + physics + "\t" + chemistry + "\t\t" + total);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int x = sc.nextInt();

        Student s[] = new Student[x];

        for (int i = 0; i < x; i++) {
            s[i] = new Student();
        }
        for (int i = 0; i < x; i++) {
            System.out.println("STUDENT " + (i + 1));
            s[i].input();
        }

        System.out.println("\nName\t\tID\tMaths\tPhysics\tChemistry\tTotal");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x - i - 1; j++) {
                if (s[j].total < s[j + 1].total) {
                    int temp = s[j].total;
                    s[j].total = s[j + 1].total;
                    s[j + 1].total = temp;
                }
            }
        }
        for (int i = 0; i < x; i++) {
            s[i].output();
        }

    }
}