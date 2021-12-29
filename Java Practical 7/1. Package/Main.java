import java.util.Scanner;
import vol.Cyl;

public class Main {
    public static void main(String[] args) {
        double r, h, vol;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter r and h");
        r = sc.nextFloat();
        h = sc.nextFloat();

        Cyl c = new Cyl();
        vol = c.volume(r, h);
        System.out.println("Volume of the given cylinder is " + vol);
    }
}
