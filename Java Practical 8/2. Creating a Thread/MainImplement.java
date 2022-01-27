class Even implements Runnable {
    public void run() {
        for (int i = 0; i <= 20; i += 2)
            System.out.println(i);
    }
}

class MainImplement {
    public static void main(String z[]) {
        Even e = new Even();
        Thread t = new Thread(e);
        t.start();
    }
}