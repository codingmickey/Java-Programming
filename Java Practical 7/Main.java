class Circle {
    private float r, a;

    void input(int r) {
        this.r = r;
    }

    void output() {
        a = 3.14f * r * r;
        System.out.println("Radius = " + r);
        System.out.println("Area of the circle = " + a);
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.input(5);
        c.output();
    }
}
