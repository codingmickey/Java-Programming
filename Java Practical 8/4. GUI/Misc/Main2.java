import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Main2 extends JFrame implements ActionListener {
    Container c;
    private JPanel mainpanel;
    private JTextField fname, lname, email;
    private JPasswordField password;
    private JButton submitbtn, clearbtn, exitbtn;
    String strFName, strLName, strPassword, strEmail;

    Main2() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainpanel);
        this.pack();
        submitbtn.addActionListener(this);
        clearbtn.addActionListener(this);
        exitbtn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitbtn) {
            strFName = fname.getText();
            strLName = lname.getText();
            strEmail = email.getText();
            strPassword = password.getText();
            if (strFName.equals("") || strLName.equals("") || strEmail.equals("") ||
                    strPassword.equals("")) {
                JOptionPane.showMessageDialog(c, "Input Field is empty!!");
                fname.requestFocus();
            } else {
                JOptionPane.showMessageDialog(c, "Your account has been created");
                fname.setText("");
                lname.setText("");
                email.setText("");
                password.setText("");
                System.exit(0);
            }
        } else if (e.getSource() == clearbtn) {
            fname.setText("");
            lname.setText("");
            email.setText("");
            password.setText("");
            fname.requestFocus();
        } else {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        JFrame jf = new Main2();
        jf.setVisible(true);
        jf.setSize(350, 250);
        jf.setLocation(600, 250);
    }
}