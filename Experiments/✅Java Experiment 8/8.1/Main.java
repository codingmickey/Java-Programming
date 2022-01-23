import java.util.Scanner;

class Area {

    Area(int a) {
        System.out.println("Area of the square is " + a * a);
    }

    Area(int a, int b) {
        System.out.println("Area of the rectangle is " + a * b);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of square: ");
        int l = sc.nextInt();

        System.out.print("Enter the length of rectangle: ");
        int a = sc.nextInt();
        System.out.print("Enter the breadth of rectangle: ");
        int b = sc.nextInt();

        Area a1 = new Area(l);
        Area a2 = new Area(a, b);

    }
}