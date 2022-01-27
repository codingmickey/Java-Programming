class Even extends Thread {
    public void run() {
        for (int i = 0; i <= 20; i += 2)
            System.out.println(i);
    }
}

class MainThread {
    public static void main(String z[]) {
        Even e = new Even();
        e.start();
    }
}