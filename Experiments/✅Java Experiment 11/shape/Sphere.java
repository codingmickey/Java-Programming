package shape;

public class Sphere {
    protected float radius;

    public Sphere(float r) {
        radius = r;
    }

    public Sphere() {
        radius = 5f;
    }

    public float area() {
        return 4 * 3.14f * radius * radius;
    }

    public float volume() {
        return (4 * 3.14f * radius * radius * radius) / 3;
    }

    public float diameter() {
        return 2 * radius;
    }

}
