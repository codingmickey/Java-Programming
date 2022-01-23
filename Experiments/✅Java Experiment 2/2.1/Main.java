import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float a, b, c, det, r1, r2;

        Scanner sc = new Scanner(System.in);

        System.out.println("For the quadratic equation,");

        System.out.print("Enter a = ");
        a = sc.nextFloat();

        System.out.print("Enter b = ");
        b = sc.nextFloat();

        System.out.print("Enter c = ");
        c = sc.nextFloat();

        det = b * b - 4 * a * c;

        if (det == 0) {
            r1 = -b / (2 * a);
            System.out.println("The quadratic equation has only 1 root = " + r1);
        } else if (det > 0) {
            r1 = (-b + (float) Math.sqrt(det)) / (2 * a);
            r2 = (-b - (float) Math.sqrt(det)) / (2 * a);
            System.out.println("The quadratic equation has 2 roots, real and distinct.");
            System.out.println("1st root = " + r1 + ", 2nd root = " + r2);
        } else {
            float real = -b / (2 * a);
            float imaginary = (float) Math.sqrt(-det) / (2 * a);
            System.out.println("The quadratic equation has 2 roots, imaginary and distinct.");
            System.out.println("1st root = " + real + " + " + imaginary + "i");
            System.out.println("2nd root = " + real + " - " + imaginary + "i");
        }

    }
}