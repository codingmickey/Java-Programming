import shape.Sphere;

public class Main {
    public static void main(String[] args) {
        Sphere s = new Sphere(10f);
        System.out.println("Area of the sphere = " + s.area());
        System.out.println("Volume of the sphere = " + s.volume());
        System.out.println("Diameter of the sphere = " + s.diameter());
    }
}