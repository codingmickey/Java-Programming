import java.util.Scanner;

class Calculate {
    void area(int a) {
        System.out.println("Area of the square is " + a * a);
    }

    void area(int a, int b) {
        System.out.println("Area of the rectangle is " + a * b);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculate c = new Calculate();

        System.out.print("Enter the length of square: ");
        int l = sc.nextInt();

        System.out.print("Enter the length of rectangle: ");
        int a = sc.nextInt();
        System.out.print("Enter the breadth of rectangle: ");
        int b = sc.nextInt();

        c.area(l);
        c.area(a, b);
    }
}
