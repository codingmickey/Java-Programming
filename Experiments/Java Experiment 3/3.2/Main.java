public class Main {
    public static void main(String[] args) {
        int a[][] = new int[3][];
        a[0] = new int[] { 1 };
        a[1] = new int[] { 2, 3 };
        a[2] = new int[] { 4, 5, 6 };

        for (int i[] : a) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
