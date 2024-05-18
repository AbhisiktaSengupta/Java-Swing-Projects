import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.lang.model.util.ElementScanner14;
import javax.swing.*;

class test extends JFrame {

    JLabel lb = new JLabel();

    JTextField txt = new JTextField();
    JTextArea details = new JTextArea("hii");

    test() {
        setLayout(null);
        setSize(500, 400);
        setVisible(true);
        txt.setBounds(20, 20, 100, 30);
        details.setBounds(150, 20, 100, 100);
        details.setLineWrap(true);
        details.setEditable(false);

        add(txt);
        add(details);
    }

    public static void main(String[] args) {
        test obj = new test();
    }
}