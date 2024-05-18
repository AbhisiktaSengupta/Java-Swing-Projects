import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.lang.model.util.ElementScanner14;
import javax.swing.*;

class loginform extends JFrame implements ActionListener {

    JLabel name = new JLabel("Username");
    JLabel pass = new JLabel("Password");
    JLabel label = new JLabel("Access Granted");
    JCheckBox ch = new JCheckBox("I accept the terms of service");
    JButton submit = new JButton(
            new ImageIcon(new ImageIcon("btn.png").getImage().getScaledInstance(150, 35, Image.SCALE_SMOOTH)));
    JTextField nm = new JTextField();
    JPasswordField p = new JPasswordField();
    JLabel img = new JLabel();
    ImageIcon imgicon = new ImageIcon(
            new ImageIcon("formback.jpg").getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH));
    Dimension di = Toolkit.getDefaultToolkit().getScreenSize();

    loginform() {
        setLayout(null);
        setSize(400, 300);
        setVisible(true);
        setResizable(false);
        // setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        // setExtendedState(this.MAXIMIZED_BOTH);

        ch.setSelected(true);
        img.setIcon(imgicon);
        setLocation(((int) di.getWidth() / 2) - 190, ((int) di.getHeight() / 2) - 250);

        name.setFont(new Font("Britannic Bold", Font.ITALIC, 17));
        pass.setFont(new Font("Britannic Bold", Font.ITALIC, 17));
        nm.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        name.setFont(new Font("Britannic Bold", Font.ITALIC, 17));
        submit.setFont(new Font("Britannic Bold", Font.ITALIC, 17));
        label.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        img.setBounds(0, 0, 400, 300);
        name.setBounds(20, 10, 100, 50);
        nm.setBounds(150, 15, 150, 35);
        pass.setBounds(20, 80, 100, 50);
        p.setBounds(150, 80, 150, 35);
        submit.setBounds(110, 150, 150, 35);
        ch.setBounds(20, 110, 200, 30);
        ch.setOpaque(false);
        add(ch);
        // exit.setBounds(280,150,)
        label.setBounds(100, 200, 150, 40);
        label.setVisible(false);
        p.setEchoChar('*');
        add(name);
        add(nm);
        add(pass);
        add(p);
        add(submit);
        add(label);
        add(img);
        submit.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            if ((nm.getText().equals("Abhisikta")) && new String(p.getPassword()).equals("Abhi123")) {
                label.setVisible(true);
            }
        }
    }

    public static void main(String[] args) {
        loginform obj = new loginform();
    }
}