class Movie extends Thread {
    int vacant = 1, required;

    Movie(int x) {
        required = x;
    }

    synchronized public void run() {
        if (required <= vacant) {
            System.out.println(required + " tickets booked for " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
            vacant = vacant - required;
        } else {
            System.out.println("House Full " + Thread.currentThread().getName());
        }
    }
}

class NonSyncMain {
    public static void main(String z[]) {
        Movie m = new Movie(1);
        Thread t1 = new Thread(m);
        Thread t2 = new Thread(m);
        t1.setName("Ajay");
        t2.setName("Vijay");
        t1.start();
        t2.start();
    }
}