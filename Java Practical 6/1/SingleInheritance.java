import java.util.Scanner;

class A {
    int i;
    Scanner sc = new Scanner(System.in);

    void inputi() {
        System.out.print("Enter i = ");
        i = sc.nextInt();
    }
}

class B extends A {
    int j;

    void inputj() {
        System.out.print("Enter j = ");
        j = sc.nextInt();
    }

    void add() {
        System.out.println("Addition = " + (i + j));
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        B b = new B();
        b.inputi();
        b.inputj();
        b.add();
    }
}
