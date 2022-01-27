import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame implements Runnable {
    Container c;
    JLabel title, ad, ad1;

    public MyFrame() {
        // add(new Board());
        setTitle("Advertisment");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        c = getContentPane();
        c.setBackground(Color.black);
        c.setLayout(null);
        title = new JLabel("SALE SALE SALE !!!");
        title.setSize(300, 50);
        title.setLocation(350, 30);
        title.setForeground(Color.white);
        title.setFont(new Font("Verdana", Font.BOLD, 38));
        c.add(title);
        ad = new JLabel("FLAT 50% Discount hurray");
        ad.setSize(400, 30);
        ad.setForeground(Color.red);
        ad.setFont(new Font("Verdana", Font.BOLD, 25));
        ad.setLocation(350, 90);
        c.add(ad);
        ad1 = new JLabel("For first few Customers");
        ad1.setSize(400, 30);
        ad1.setForeground(Color.pink);
        ad1.setFont(new Font("Verdana", Font.BOLD, 19));
        ad1.setLocation(370, 120);
        c.add(ad1);
        ad1 = new JLabel("So , what are you waiting for ?");
        ad1.setSize(400, 30);
        ad1.setForeground(Color.yellow);
        ad1.setFont(new Font("Verdana", Font.BOLD, 9));
        ad1.setLocation(390, 150);
        c.add(ad1);
        new Thread(this).start();
    }

    public void run() {
        try {
            while (true) {
                if (title.getText() == null) {
                    title.setText("SALE SALE SALE !!!");
                    Thread.sleep(500);
                } else {
                    title.setText(null);
                    Thread.sleep(500);
                }
            }
        } catch (InterruptedException ex) {
        }
    }
}

public class Banner {
    public static void main(String[] args) {
        new MyFrame();
    }
}