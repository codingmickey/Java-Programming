public class Main {
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(args[0]);

            int l = 0;
            while (n > 0) {
                l++;
                n /= 10;
            }
            System.out.println("The number of digits = " + l);
        } catch (NumberFormatException ex) {
            System.out.println("Enter a number less than ten billion");
        }

    }
}
