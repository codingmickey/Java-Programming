class Movie extends Thread {
    public synchronized void run() {
        for (int i = 1; i <= 10; i++)
            System.out.println(i);
    }
}

class SyncMain {
    public static void main(String z[]) {
        Movie m = new Movie();
        Thread t1 = new Thread(m);
        Thread t2 = new Thread(m);
        t1.start();
        t2.start();
        System.out.println("is t2 Thread alive?" + t2.isAlive());
    }
}