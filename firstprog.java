import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class firstprog extends JFrame implements ActionListener, KeyListener {

    JTextField tx1 = new JTextField();
    JTextField tx2 = new JTextField();
    JTextField tx3 = new JTextField();
    JLabel l1 = new JLabel("First Number");
    JLabel l2 = new JLabel("Second Number");
    JLabel l3 = new JLabel("Result");
    JLabel err = new JLabel("Cannot Divide by 0");
    JLabel res = new JLabel();
    JButton b1 = new JButton("Add");
    JButton b2 = new JButton("Subtract");
    JButton b3 = new JButton("Multiply");
    JButton b4 = new JButton("Divide");
    JButton b5 = new JButton("New");
    JButton b6 = new JButton("Cancel");

    public firstprog() {
        setLayout(null);
        setSize(700, 400);
        setVisible(true);
        err.setVisible(false);
        res.setVisible(false);
        setTitle("Calculator");
        setResizable(false);
        l1.setBounds(50, 50, 100, 50);
        tx1.setBounds(170, 50, 150, 40);
        l2.setBounds(50, 120, 100, 50);
        tx2.setBounds(170, 120, 150, 40);
        l3.setBounds(50, 190, 100, 50);
        tx3.setBounds(170, 190, 150, 40);
        b1.setBounds(30, 260, 90, 50);
        b2.setBounds(130, 260, 90, 50);
        b3.setBounds(230, 260, 90, 50);
        b4.setBounds(330, 260, 90, 50);
        b5.setBounds(430, 260, 90, 50);
        b6.setBounds(530, 260, 90, 50);
        err.setBounds(330, 190, 150, 40);
        res.setBounds(230, 330, 150, 40);
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        tx3.setEditable(false);
        tx1.setBackground(Color.BLUE);
        tx1.setForeground(Color.WHITE);
        tx2.setBackground(new Color(29, 116, 147));
        tx2.setForeground(new Color(255, 255, 255));
        // l1.setBackground(Color.RED);
        // l1.setOpaque(true);
        getContentPane().setBackground(Color.CYAN);
        add(l1);
        add(tx1);
        add(l2);
        add(tx2);
        add(l3);
        add(tx3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(err);
        add(res);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        tx1.addKeyListener(this);
        tx2.addKeyListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            if (!tx1.getText().isEmpty() && !tx2.getText().isEmpty()) {

                double a = Double.parseDouble(tx1.getText());
                double b = Double.parseDouble(tx2.getText());
                double c = a + b;
                tx3.setText(" " + c);
                JOptionPane.showMessageDialog(null, "The result is " + c);
                res.setText("The result is " + c);
                res.setVisible(true);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b6.setEnabled(true);

            } else
                JOptionPane.showMessageDialog(null, "All the numbers are not entered");

        }
        if (e.getSource() == b2) {
            if (!tx1.getText().isEmpty() && !tx2.getText().isEmpty()) {
                double a = Double.parseDouble(tx1.getText());
                double b = Double.parseDouble(tx2.getText());
                double c = a - b;
                tx3.setText(" " + c);
                res.setText("The result is " + c);
                JOptionPane.showMessageDialog(null, "The result is " + c);
                res.setVisible(true);
                tx3.setEditable(false);
                b1.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b6.setEnabled(true);
            } else
                JOptionPane.showMessageDialog(null, "All the numbers are not entered");
        }
        if (e.getSource() == b3) {
            if (!tx1.getText().isEmpty() && !tx2.getText().isEmpty()) {
                double a = Double.parseDouble(tx1.getText());
                double b = Double.parseDouble(tx2.getText());
                double c = a * b;
                tx3.setText(" " + c);
                res.setText("The result is " + c);
                JOptionPane.showMessageDialog(null, "The result is " + c);
                res.setVisible(true);
                tx3.setEditable(false);
                b2.setEnabled(false);
                b1.setEnabled(false);
                b4.setEnabled(false);
                b6.setEnabled(true);
            } else
                JOptionPane.showMessageDialog(null, "All the numbers are not entered");
        }
        if (e.getSource() == b4) {
            if (!tx1.getText().isEmpty() && !tx2.getText().isEmpty()) {
                double a = Double.parseDouble(tx1.getText());
                double b = Double.parseDouble(tx2.getText());
                if (b == 0) {
                    tx3.setText("");
                    err.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Cannot divide by zero");
                } else {
                    double c = a / b;
                    tx3.setText(" " + c);
                    res.setText("The result is " + c);
                    JOptionPane.showMessageDialog(null, "The result is " + c);
                    res.setVisible(true);
                    tx3.setEditable(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b1.setEnabled(false);
                    b6.setEnabled(true);
                }
            } else
                JOptionPane.showMessageDialog(null, "All the numbers are not entered");
        }
        if (e.getSource() == b5) {
            tx1.setText("");
            tx2.setText("");
            tx3.setText("");
            err.setVisible(false);
            res.setVisible(false);
            b6.setEnabled(true);
            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);

        }
        if (e.getSource() == b6) {
            int a;
            a = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel ?");
            if (a != 1) {
                this.dispose();
            }
        }
    }

    public void keyReleased(KeyEvent ke) {

    }

    public void keyPressed(KeyEvent ke) {
        if (ke.getSource() == tx1) {
            if (ke.getKeyCode() >= 48 && ke.getKeyCode() <= 57) {

            } else {
                JOptionPane.showMessageDialog(null, "Enter Digits Only");
                // tx1.setText("");
                tx1.setText(tx1.getText().substring(0, tx1.getText().length() - 1));
            }
        }
        if (ke.getSource() == tx2) {
            if (ke.getKeyCode() >= 48 && ke.getKeyCode() <= 57) {

            } else {
                JOptionPane.showMessageDialog(null, "Enter Digits Only");
                // tx1.setText("");
                tx2.setText(tx2.getText().substring(0, tx2.getText().length() - 1));
            }
        }

    }

    public void keyTyped(KeyEvent ke) {

    }

    public static void main(String[] args) {
        firstprog obj1 = new firstprog();
    }
}
