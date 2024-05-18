import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {
    JTextField res = new JTextField();
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton b0 = new JButton("0");
    JButton add = new JButton("+");
    JButton sub = new JButton("-");
    JButton mul = new JButton("*");
    JButton div = new JButton("/");
    JButton equal = new JButton("=");
    JButton point = new JButton(".");
    JButton clear = new JButton("C");
    JButton bspace = new JButton("Backspace");
    JRadioButton on = new JRadioButton("ON", false);
    JRadioButton off = new JRadioButton("OFF", false);
    ButtonGroup bg = new ButtonGroup();
    Image icon = Toolkit.getDefaultToolkit().getImage("calcicon.png");
    Dimension di = Toolkit.getDefaultToolkit().getScreenSize();

    public Calculator() {

        setLocation(((int) di.getWidth() / 2) - 150, ((int) di.getHeight() / 2) - 300);
        setIconImage(icon);
        setLayout(null);
        setSize(400, 550);
        setVisible(true);
        setTitle("Abhi's Calculator");
        setResizable(false);
        off.setSelected(true);
        // Purple:179, 198, 255
        // Yellow:255, 236, 179
        // Pink:255, 179, 198
        res.setEditable(false);
        getContentPane().setBackground(new Color(141, 103, 255));
        res.setBackground(new Color(217, 255, 103));
        // on.setOpaque(false);

        on.setBackground(new Color(141, 103, 255));
        off.setBackground(new Color(141, 103, 255));

        b0.setFont(new Font("Times New Roman", Font.BOLD, 20));
        b1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        b2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        b3.setFont(new Font("Times New Roman", Font.BOLD, 20));
        b4.setFont(new Font("Times New Roman", Font.BOLD, 20));
        b5.setFont(new Font("Times New Roman", Font.BOLD, 20));
        b6.setFont(new Font("Times New Roman", Font.BOLD, 20));
        b7.setFont(new Font("Times New Roman", Font.BOLD, 20));
        b8.setFont(new Font("Times New Roman", Font.BOLD, 20));
        b9.setFont(new Font("Times New Roman", Font.BOLD, 20));
        bspace.setFont(new Font("Times New Roman", Font.BOLD, 20));
        clear.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add.setFont(new Font("Times New Roman", Font.BOLD, 25));
        sub.setFont(new Font("Times New Roman", Font.BOLD, 25));
        mul.setFont(new Font("Times New Roman", Font.BOLD, 25));
        div.setFont(new Font("Times New Roman", Font.BOLD, 25));
        on.setFont(new Font("Times New Roman", Font.BOLD, 15));
        off.setFont(new Font("Times New Roman", Font.BOLD, 15));
        res.setFont(new Font("Times New Roman", Font.BOLD, 20));
        res.setHorizontalAlignment(SwingConstants.RIGHT);
        on.setBounds(20, 10, 70, 50);
        off.setBounds(100, 10, 70, 50);

        res.setBounds(20, 70, 350, 50);
        bspace.setBounds(20, 130, 150, 50);
        clear.setBounds(200, 130, 150, 50);

        b7.setBounds(25, 210, 75, 50);
        b8.setBounds(105, 210, 75, 50);
        b9.setBounds(185, 210, 75, 50);
        add.setBounds(265, 210, 75, 50);

        b4.setBounds(25, 280, 75, 50);
        b5.setBounds(105, 280, 75, 50);
        b6.setBounds(185, 280, 75, 50);
        sub.setBounds(265, 280, 75, 50);

        b1.setBounds(25, 350, 75, 50);
        b2.setBounds(105, 350, 75, 50);
        b3.setBounds(185, 350, 75, 50);
        mul.setBounds(265, 350, 75, 50);

        b0.setBounds(25, 420, 75, 50);
        point.setBounds(105, 420, 75, 50);
        equal.setBounds(185, 420, 75, 50);
        div.setBounds(265, 420, 75, 50);

        // bspace.setEnabled(true);
        // clear.setEnabled(true);
        bg.add(on);
        bg.add(off);

        add(res);
        add(bspace);
        add(clear);
        add(b7);
        add(b8);
        add(b9);
        add(add);
        add(b4);
        add(b5);
        add(b6);
        add(sub);
        add(b1);
        add(b2);
        add(b3);
        add(mul);
        add(b0);
        add(point);
        add(equal);
        add(div);
        add(on);
        add(off);

        b9.addActionListener(this);
        b8.addActionListener(this);
        b7.addActionListener(this);
        b6.addActionListener(this);
        b5.addActionListener(this);
        b4.addActionListener(this);
        b3.addActionListener(this);
        b2.addActionListener(this);
        b1.addActionListener(this);
        b0.addActionListener(this);
        bspace.addActionListener(this);
        clear.addActionListener(this);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        equal.addActionListener(this);
        point.addActionListener(this);
        on.addActionListener(this);
        off.addActionListener(this);
        CheckOff();

    }

    double a, c = 0, m = 1;
    int flag = 0;
    String last = "";

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == on) {
            CheckOn();
        }
        if (e.getSource() == off) {
            CheckOff();
        }
        if (e.getSource() == bspace) {
            res.setText(res.getText().substring(0, res.getText().length() - 1));
        }
        if (e.getSource() == clear) {
            res.setText("");

        }
        if (e.getSource() == b9) {
            res.setText(res.getText() + "9");
        }
        if (e.getSource() == b8) {
            res.setText(res.getText() + "8");
        }
        if (e.getSource() == b7) {
            res.setText(res.getText() + "7");
        }
        if (e.getSource() == b6) {
            res.setText(res.getText() + "6");
        }
        if (e.getSource() == b5) {
            res.setText(res.getText() + "5");
        }
        if (e.getSource() == b4) {
            res.setText(res.getText() + "4");
        }
        if (e.getSource() == b3) {
            res.setText(res.getText() + "3");
        }
        if (e.getSource() == b2) {
            res.setText(res.getText() + "2");
        }
        if (e.getSource() == b1) {
            res.setText(res.getText() + "1");
        }
        if (e.getSource() == b0) {
            res.setText(res.getText() + "0");
        }
        if (e.getSource() == point) {
            res.setText(res.getText() + ".");
        }
        if (e.getSource() == add) {
            a = Double.parseDouble(res.getText());
            if (last.equals("sub")) {
                c = c - a;
            } else if (last.equals("mul")) {
                c = c + (m * a);
            } else if (last.equals("div")) {
                c = c + (m / a);
            } else
                c = c + a;
            flag = 1;
            last = "add";
            res.setText("");
        }
        if (e.getSource() == sub) {
            a = Double.parseDouble(res.getText());
            if (last.equals("add")) {
                c = c + a;
            } else if (last.equals("mul")) {
                c = (m * a) - c;
            } else if (last.equals("div")) {
                c = (m / a) - c;
            } else {
                if (flag == 0) {
                    c = a;
                } else {
                    c = c - a;
                }
            }
            System.out.println(c);
            flag = 1;
            last = "sub";
            res.setText("");
            System.out.println(c);
        }
        if (e.getSource() == mul) {
            a = Double.parseDouble(res.getText());
            m = a * m;
            last = "mul";
            res.setText("");
        }
        if (e.getSource() == div) {
            a = Double.parseDouble(res.getText());
            m = a / m;
            last = "div";
            res.setText("");
        }
        if (e.getSource() == equal) {
            if (last.equals("add")) {
                c = c + Double.parseDouble(res.getText());
                res.setText("" + c);
                c = 0;
            }
            if (last.equals("sub")) {
                System.out.println(c);
                c = c - Double.parseDouble(res.getText());
                System.out.println(c);
                res.setText("" + c);
                c = 0;
                flag = 0;
            }
            if (last.equals("mul")) {
                m = m * Double.parseDouble(res.getText());
                res.setText("" + m);
                m = 1;
            }
            if (last.equals("div")) {
                m = m / Double.parseDouble(res.getText());
                res.setText("" + m);
                m = 1;
            }
            c = 0;
            flag = 0;
            m = 1;
        }

    }

    public void CheckOff() {
        if (off.isSelected()) {
            b9.setEnabled(false);
            b8.setEnabled(false);
            b7.setEnabled(false);
            b6.setEnabled(false);
            b5.setEnabled(false);
            b4.setEnabled(false);
            b3.setEnabled(false);
            b2.setEnabled(false);
            b1.setEnabled(false);
            b0.setEnabled(false);
            bspace.setEnabled(false);
            clear.setEnabled(false);
            add.setEnabled(false);
            sub.setEnabled(false);
            mul.setEnabled(false);
            div.setEnabled(false);
            equal.setEnabled(false);
            point.setEnabled(false);
        }

    }

    public void CheckOn() {
        if (on.isSelected()) {
            b9.setEnabled(true);
            b8.setEnabled(true);
            b7.setEnabled(true);
            b6.setEnabled(true);
            b5.setEnabled(true);
            b4.setEnabled(true);
            b3.setEnabled(true);
            b2.setEnabled(true);
            b1.setEnabled(true);
            b0.setEnabled(true);
            bspace.setEnabled(true);
            clear.setEnabled(true);
            add.setEnabled(true);
            sub.setEnabled(true);
            mul.setEnabled(true);
            div.setEnabled(true);
            equal.setEnabled(true);
            point.setEnabled(true);
        }
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
    }
}