import java.io.*;

public class Buff {
    public static void main(String[] args) throws IOException {
        InputStreamReader isc = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isc);

        System.out.print("Enter 2 numbers: ");

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int c = a + b;

        System.out.print("Sum = " + c);
    }
}
