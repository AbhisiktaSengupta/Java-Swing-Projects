import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.lang.model.util.ElementScanner14;
import javax.swing.*;

class abc_game extends JFrame implements ActionListener {

    String arr[] = { "--Select--", "Apple", "Box", "Cat", "Dog" };
    JComboBox cb = new JComboBox();
    JComboBox cb2 = new JComboBox(arr);
    JLabel lb = new JLabel();
    JLabel label = new JLabel();
    Dimension di = Toolkit.getDefaultToolkit().getScreenSize();
    ImageIcon bg = new ImageIcon(
            new ImageIcon("bg (1).jpg").getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH));

    abc_game() {
        setLayout(null);
        setSize(500, 500);
        setVisible(true);
        setResizable(false);
        setLocation(((int) di.getWidth() / 2) - 250, ((int) di.getHeight() / 2) - 250);
        label.setIcon(bg);
        cb.setFont(new Font("Times New Roman", Font.BOLD, 17));
        cb2.setFont(new Font("Times New Roman", Font.BOLD, 17));
        setTitle("Alphabet Game");
        cb.addItem("--Select--");
        cb.addItem("A");
        cb.addItem("B");
        cb.addItem("C");
        cb.addItem("D");
        cb.setBounds(30, 20, 100, 30);
        cb2.setBounds(150, 20, 100, 30);
        lb.setBounds(90, 50, 350, 350);
        label.setBounds(0, 0, 500, 500);
        add(cb2);
        add(cb);
        add(lb);
        add(label);

        cb.addActionListener(this);
        cb2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == cb) {
            cb2.setSelectedIndex(cb.getSelectedIndex());
            ImageIcon img = new ImageIcon(new ImageIcon(cb.getSelectedItem() + ".jpg").getImage().getScaledInstance(300,
                    300, Image.SCALE_DEFAULT));
            lb.setIcon(img);
        }

        if (e.getSource() == cb2) {
            cb.setSelectedIndex(cb2.getSelectedIndex());
            cb2.setSelectedIndex(cb.getSelectedIndex());
            ImageIcon img = new ImageIcon(new ImageIcon(cb.getSelectedItem() + ".jpg").getImage().getScaledInstance(300,
                    300, Image.SCALE_DEFAULT));
            lb.setIcon(img);
        }
    }

    public static void main(String[] args) {
        abc_game obj = new abc_game();
    }

}