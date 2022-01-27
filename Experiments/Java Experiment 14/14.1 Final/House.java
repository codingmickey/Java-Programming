import java.applet.*;
import java.awt.*;

public class House extends Applet {
    public void paint(Graphics g) {
        Font home = new Font("Century Gothic", Font.BOLD, 28);
        g.setFont(home);
        g.setColor(Color.blue);
        g.drawString("HOUSE", 20, 80);
        int a[] = { 150, 300, 225 };
        int b[] = { 150, 150, 25 };
        g.setColor(Color.blue);
        g.fillRect(150, 150, 150, 200);
        g.setColor(Color.black);
        g.fillRect(190, 220, 70, 130);
        g.setColor(Color.red);
        g.fillPolygon(a, b, 3);
        g.setColor(Color.yellow);
        g.fillOval(200, 75, 50, 50);
        g.setColor(Color.red);
        g.fillRect(300, 150, 250, 200);
        g.setColor(Color.black);
        g.fillRect(390, 210, 80, 80);
        g.setColor(Color.blue);
        g.drawLine(430, 210, 430, 290);
        g.setColor(Color.blue);
        g.drawLine(470, 250, 390, 250);
        g.setColor(Color.red);
        g.drawLine(460, 26, 226, 26);
        g.setColor(Color.red);
        g.drawLine(460, 25, 550, 150);
    }
}