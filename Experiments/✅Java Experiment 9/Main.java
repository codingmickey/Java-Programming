import java.util.Scanner;

abstract class Shape {
    abstract float area();
}

class Rectangle extends Shape {
    float length, breadth;

    Rectangle(float l, float b) {
        length = l;
        breadth = b;
    }

    float area() {
        return length * breadth;
    }
}

class Circle extends Shape {
    float radius;

    Circle(float r) {
        radius = r;
    }

    float area() {
        return 3.14f * radius * radius;
    }
}

class Triangle extends Shape {
    float base, height;

    Triangle(float b, float h) {
        base = b;
        height = h;
    }

    float area() {
        return 0.5f * base * height;
    }
}

public class Main {
    public static void main(String[] args) {
        float len, bre, rad, bas, hei;
        Scanner sc = new Scanner(System.in);

        System.out.println("For Rectangle..");
        System.out.print("Enter length = ");
        len = sc.nextFloat();
        System.out.print("Enter breadth = ");
        bre = sc.nextFloat();

        Rectangle r = new Rectangle(len, bre);

        System.out.println("For Circle..");
        System.out.print("Enter radius = ");
        rad = sc.nextFloat();

        Circle c = new Circle(rad);

        System.out.println("For Triangle..");
        System.out.print("Enter the base = ");
        bas = sc.nextFloat();
        System.out.print("Enter the height = ");
        hei = sc.nextFloat();

        Triangle t = new Triangle(bas, hei);

        System.out.println("Area of the Rectangle = " + r.area());
        System.out.println("Area of the Circle = " + c.area());
        System.out.println("Area of the Triangle = " + t.area());
    }
}
