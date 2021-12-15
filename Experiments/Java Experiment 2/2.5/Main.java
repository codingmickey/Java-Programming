public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
            } else {
                for (int j = i; j >= 1; j--) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
        int count = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 5 - i; j > 1; j--) {
                System.out.print(" ");
            }
            int x = count;
            for (int j = i; j >= 1; j--) {
                System.out.print((char) ('A' + x - 1 + j));
                count++;
            }
            System.out.println();
        }
    }
}
