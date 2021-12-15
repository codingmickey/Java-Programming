
class Rectangle {
    int b, l, area;

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    int area() {
        area = l * b;
        return area;
    }
}

public class Main {
    public static void main(String[] args) {
        int a1, a2;
        Rectangle r1 = new Rectangle(4, 5);
        a1 = r1.area();
        Rectangle r2 = new Rectangle(5, 8);
        a2 = r2.area();
        System.out.println("Area of the rectangle with with l = 4 and b = 5 is " + a1);
        System.out.println("Area of the rectangle with with l = 5 and b = 8 is " + a2);
    }
}