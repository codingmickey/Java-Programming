import java.util.Scanner;

class Circle {
    float r;
    Scanner sc = new Scanner(System.in);

    void read() {
        System.out.print("Enter the radius: ");
        r = sc.nextFloat();
    }
}

class Area extends Circle {
    float area;

    void calcArea() {
        area = 3.14f * r * r;
    }

    void output() {
        System.out.println("Area = " + area);
    }
}

class Volume extends Area {
    float vol;

    void calcVol() {
        vol = (4f / 3) * area * r;
    }

    void output() {
        System.out.println("Volume = " + vol);
    }
}

public class Main {
    public static void main(String[] args) {
        Volume v = new Volume();
        v.read();
        v.calcArea();
        // Method overriding
        v.output();
        v.calcVol();
        v.output();
    }
}
