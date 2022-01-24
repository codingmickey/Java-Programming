class A {
    A() {
        System.out.println("Hello from class A");
    }
}

class B extends A {
    B() {
        System.out.println("Hello from class B");
    }
}

class C extends B {
    C() {
        System.out.println("Hello from class C");
    }
}

public class Main {
    public static void main(String[] args) {
        C c = new C();
    }
}
