class Circle {
    void display() {
        System.out.println("I am display()");
    }

    protected void finalize() {
        System.out.println("I am dying");
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.display();
        c = null;
        System.gc();
    }
}
