class Rectangle {
    private float length, breadth;

    Rectangle() {
        length = 5f;
        breadth = 10f;
    }

    Rectangle(float l, float b) {
        length = l;
        breadth = b;
    }

    float area() {
        return length * breadth;
    }
}

class Cube {
    private float length;

    Cube() {
        length = 5f;
    }

    Cube(float l) {
        length = l;
    }

    float volume() {
        return (float) Math.pow(length, 3);
    }
}

class Size {
    static float size(Object z) {
        if (z instanceof Rectangle) {
            return ((Rectangle) z).area();
        } else if (z instanceof Cube) {
            return ((Cube) z).volume();
        } else {
            return -1;
        }
    }
}

public class Main {
    public static void main(String args[]) {
        Rectangle r = new Rectangle(5, 6);
        Cube c = new Cube();
        String s = new String("hi");
        System.out.println("Area of rectangle = " + Size.size(r));
        System.out.println("Volume of cube = " + Size.size(c));
        System.out.println("Other objects = " + Size.size(s));
    }
}
