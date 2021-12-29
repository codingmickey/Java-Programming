public class JaggedArrays {
    public static void main(String[] args) {
        int a[][] = new int[4][];
        a[0] = new int[] { 6, 9, 69 };
        a[1] = new int[] { 1, 2 };
        a[2] = new int[] { 1, 2, 3 };
        a[3] = new int[] { 1, 2, 3, 4, 5 };

        for (int s[] : a) {
            for (int k : s) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

}
