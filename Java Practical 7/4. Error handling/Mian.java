import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mian {
    public static void main(String[] args) throws IOException {
        int a, b, c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 2 numbers: ");

        try {
            a = Integer.parseInt(br.readLine());
            b = Integer.parseInt(br.readLine());
            c = a / b;
            System.out.println("Division = " + c);
        } catch (ArithmeticException e) {
            System.out.println("Please don't divide by 0");
        } catch (NumberFormatException e) {
            System.out.println("Enter a vaild number");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("I am finally() block");
        }

        // Nested try catch
        try {
            a = Integer.parseInt(br.readLine());
            b = Integer.parseInt(br.readLine());
            try {
                c = a / b;
                System.out.println("Division = " + c);
            } catch (ArithmeticException e) {
                System.out.println("Please don't divide by 0");
            }
        } catch (NumberFormatException e) {
            System.out.println("Enter a vaild number");
        }
    }
}
