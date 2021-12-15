import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the operation to perform(+-*/%): ");
        char c = sc.next().charAt(0);

        int ans = 0, check = 0;
        switch (c) {
            case '+':
                ans = a + b;
                break;
            case '-':
                ans = a - b;
                break;
            case '*':
                ans = a * b;
                break;
            case '/':
                System.out.println(a + " " + c + " " + b + " = " + (float) a / b);
                check = 1;
                break;
            case '%':
                ans = a % b;
                break;
            default:
                System.out.println("Enter a valid choice!");
                check = 1;
        }
        if (check != 1)
            System.out.println(a + " " + c + " " + b + " = " + ans);
    }
}
