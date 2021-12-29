import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int a, b, c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 2 numbers: ");
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());

        try {
            c = a / b;
            System.out.println("Division = " + c);
        } catch (ArithmeticException e) {
            System.out.println("Please don't divide by 0");
        }
    }
}
