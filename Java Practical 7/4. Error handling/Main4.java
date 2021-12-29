public class Main4 {
    public static void main(String[] args) {
        try {
            fun();
        } catch (ArithmeticException e) {
            System.out.println("hi there with this exception " + e);// TODO: handle exception
        }
    }

    static void fun() throws ArithmeticException {
        int a = 5 / 0;
    }
}
