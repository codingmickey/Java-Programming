import java.awt.*;
import javax.swing.JFrame;

class Main extends Canvas {
    public void paint(Graphics g) {
        Polygon poly = new Polygon();
        poly.addPoint(50, 90);
        poly.addPoint(150, 50);
        poly.addPoint(250, 90);
        g.setColor(new Color(218, 165, 32));
        g.fillPolygon(poly);
        g.setColor(Color.black);
        g.drawLine(50, 90, 150, 50);
        g.drawLine(150, 50, 250, 90);
        g.setColor(Color.yellow);
        g.fillRect(50, 90, 200, 100);
        g.setColor(Color.black);
        g.drawRect(50, 90, 200, 100);
        g.setColor(Color.black);
        g.fillRect(75, 110, 30, 25);
        g.fillRect(190, 110, 30, 25);
        g.setColor(Color.blue);
        g.drawLine(75, 123, 105, 123);
        g.drawLine(89, 110, 89, 134);
        g.fillRect(70, 110, 5, 25);
        g.fillRect(105, 110, 5, 25);
        g.drawLine(75 + 115, 123, 105 + 115, 123);
        g.drawLine(89 + 115, 110, 89 + 115, 134);
        g.fillRect(70 + 115, 110, 5, 25);
        g.fillRect(105 + 115, 110, 5, 25);
        g.setColor(Color.blue);
        g.fillRect(130, 150, 35, 40);
        g.setColor(Color.red);
        g.fillOval(155, 170, 4, 4);
    }

    public static void main(String args[]) {
        Main h = new Main();
        JFrame f = new JFrame();
        f.add(h);
        f.setBounds(0, 0, 400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}