import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter the no. of cols: ");
        int m = sc.nextInt();
        int a[][] = new int[n + 1][m + 1];

        a[n][m] = 0;
        for (int i = 0; i < n; i++) {
            a[i][m] = 0;
            System.out.print("Enter the data for row. " + (i + 1) + ": ");
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
                a[i][m] += a[i][j];
                a[n][m] += a[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            a[n][i] = 0;
            for (int j = 0; j < n; j++) {
                a[n][i] += a[j][i];
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" " + a[i][j] + "\t");
            }
            System.out.println("|\t" + a[i][m]);
        }
        for (int i = 0; i < m + 4; i++) {
            System.out.print("------");
        }
        System.out.println();
        for (int i = 0; i < m; i++) {
            System.out.print(" " + a[n][i] + "\t");
        }
        System.out.println("|\t" + a[n][m]);
    }
}
