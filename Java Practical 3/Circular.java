import java.util.Scanner;

// class Circle {
//     float a, r;

//     Circle(float r) {
//         this.r = r;
//     }

//     void calculate() {
//         a = ((float) Math.PI) * r * r;
//     }

//     void area() {
//         System.out.println("Area = " + a);
//     }
// }

class Circle {
    float a, r;

    Circle(float r) {
        this.r = r;
    }

    Circle() {
        r = 5.0f;
    }

    void calculate() {
        a = ((float) Math.PI) * r * r;
    }

    void area() {
        System.out.println("Area = " + a);
    }
}

public class Circular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Parameterized constructor");
        System.out.print("Enter the radius: ");
        float r = sc.nextFloat();

        Circle c = new Circle(r);
        c.calculate();
        c.area();

        Circle c1 = new Circle();
        System.out.println("Default constructor");
        c1.calculate();
        c1.area();
    }
}