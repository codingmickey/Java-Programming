public class Main {
    public static void main(String[] args) {
        int l = args.length;
        int ints = 0, notInts = 0;
        for (int i = 0; i < l; i++) {
            try {
                int x = Integer.parseInt(args[i]);
                ints++;
            } catch (Exception e) {
                notInts++;
            }
        }
        System.out.println("Valid integers = " + ints);
        System.out.println("In-valid integers = " + notInts);
    }
}