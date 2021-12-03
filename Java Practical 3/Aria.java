import java.util.Scanner;

class Area {

    void area(float a) {
        System.out.println("Circle area = " + 3.14f * a * a);
    }

    void area(int a) {
        System.out.println("Square area = " + a * a);
    }

    void area(int a, int b) {
        System.out.println("Rectangle area = " + a * b);
    }
}

public class Aria {
    public static void main(String[] args) {
        Area a = new Area();
        a.area(5);
        a.area(5.5f);
        a.area(4, 5);
    }
}
