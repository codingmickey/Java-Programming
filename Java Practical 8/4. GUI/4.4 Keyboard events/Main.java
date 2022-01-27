import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Main extends JFrame implements KeyListener {
    Container c;
    JTextArea txt1;

    Main() {
        c = getContentPane();
        txt1 = new JTextArea(10, 20);
        c.add(txt1);
        txt1.addKeyListener(this);
    }

    public void keyPressed(KeyEvent ke) {
        txt1.append("Key Pressed \n");
    }

    public void keyReleased(KeyEvent ke) {
        txt1.append("Key Released \n");
    }

    public void keyTyped(KeyEvent ke) {
        txt1.append("Key Typed \n");
    }

    public static void main(String z[]) {
        Main k = new Main();
        k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        k.setBounds(700, 300, 300, 200);
        k.setTitle("Key Events");
        k.setVisible(true);
    }
}