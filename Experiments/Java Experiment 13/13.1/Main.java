class Table5 extends Thread {
    public void run() {
        int i;
        long itime = System.currentTimeMillis(), ntime;

        for (i = 1; i <= 10; i++) {
            System.out.println(5 + " X " + i + " = " + (i * 5));
        }
        ntime = System.currentTimeMillis() - itime;
        System.out.println(Thread.currentThread() + " took " + ntime + " ms");
    }
}

class Table7 extends Thread {
    public void run() {
        int i;
        long itime = System.currentTimeMillis(), ntime;

        for (i = 1; i <= 10; i++) {
            System.out.println(7 + " X " + i + " = " + (i * 7));
        }
        ntime = System.currentTimeMillis() - itime;
        System.out.println(Thread.currentThread() + " took " + ntime + " ms");
    }
}

class Table13 extends Thread {
    public void run() {
        int i;
        long itime = System.currentTimeMillis(), ntime;

        for (i = 1; i <= 10; i++) {
            System.out.println(13 + " X " + i + " = " + (i * 13));
        }
        ntime = System.currentTimeMillis() - itime;
        System.out.println(Thread.currentThread() + " took " + ntime + " ms");
    }
}

public class Main {
    public static void main(String[] args) {
        Table5 a = new Table5();
        Table7 b = new Table7();
        Table13 c = new Table13();
        a.setName("Table of 5");
        b.setName("Table of 7");
        c.setName("Table of 13");
        a.start();
        b.start();
        c.start();
    }
}