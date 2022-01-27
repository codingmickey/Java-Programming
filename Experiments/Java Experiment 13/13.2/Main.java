class BusTicket extends Thread {
    int vacant = 2, required;

    BusTicket(int x) {
        required = x;
    }

    synchronized public void run() {
        if (required <= vacant) {
            System.out.println(required + " ticket(s) booked for " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
            vacant = vacant - required;
        } else {
            System.out.println("Seats Full for " + Thread.currentThread().getName());
        }
    }
}

class Main {
    public static void main(String z[]) {
        BusTicket m = new BusTicket(1);
        System.out.println(m.vacant + " seats are vacant in the bus!\n");
        Thread t1 = new Thread(m);
        Thread t2 = new Thread(m);
        Thread t3 = new Thread(m);
        t1.setName("Kartik");
        t2.setName("Meet");
        t3.setName("Deevya");
        t1.start();
        t2.start();
        t3.start();
    }
}