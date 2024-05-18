import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.io.PrintWriter;
import javax.swing.*;
import java.util.Date;
import java.text.SimpleDateFormat;

class registrationform extends JFrame implements ActionListener, KeyListener, FocusListener {
    Date dt = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    String date[] = { "Date", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
            "17", "18", "19", "20" };
    String month[] = { "Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };
    String yr[] = { "Year", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001",
            "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010" };
    JLabel title = new JLabel("REGISTRATION FORM");
    JLabel nm = new JLabel("Name");
    JLabel mob = new JLabel("Phone No.");
    JLabel gen = new JLabel("Gender");
    JLabel dob = new JLabel("DOB");
    JLabel add = new JLabel("Address");
    JTextArea doc = new JTextArea();
    JTextField name = new JTextField();
    JTextArea focustext = new JTextArea();
    JTextField phn = new JTextField();
    JRadioButton male = new JRadioButton("M");
    JRadioButton female = new JRadioButton("F");
    JComboBox d = new JComboBox(date);
    JComboBox m = new JComboBox(month);
    JComboBox y = new JComboBox(yr);
    JTextArea address = new JTextArea();
    JCheckBox contd = new JCheckBox("I accepts the terms and conditions", false);
    JButton submit = new JButton("Submit");
    JButton clear = new JButton("Clear");
    JButton print = new JButton("Print");
    ButtonGroup bg = new ButtonGroup();
    Dimension di = Toolkit.getDefaultToolkit().getScreenSize();

    registrationform() {
        setLayout(null);
        setSize(650, 600);
        setVisible(true);
        setResizable(false);
        setLocation(((int) di.getWidth() / 2) - 300, ((int) di.getHeight() / 2) - 310);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        bg.add(male);
        bg.add(female);
        address.setLineWrap(true);
        doc.setLineWrap(true);
        title.setBounds(170, 10, 150, 30);
        nm.setBounds(20, 60, 60, 30);
        name.setBounds(100, 60, 170, 30);
        mob.setBounds(20, 110, 60, 30);
        phn.setBounds(100, 110, 170, 30);
        gen.setBounds(20, 160, 60, 30);
        male.setBounds(100, 160, 60, 30);
        female.setBounds(170, 160, 60, 30);
        dob.setBounds(20, 210, 60, 30);
        d.setBounds(100, 210, 80, 30);
        m.setBounds(190, 210, 80, 30);
        y.setBounds(280, 210, 80, 30);
        add.setBounds(20, 270, 60, 30);
        address.setBounds(100, 270, 150, 150);
        contd.setBounds(70, 440, 250, 30);
        submit.setBounds(30, 500, 100, 30);
        clear.setBounds(170, 500, 100, 30);
        print.setBounds(310, 500, 100, 30);
        doc.setBounds(370, 80, 240, 150);
        focustext.setBounds(370, 80, 240, 150);
        add(focustext);
        doc.setEditable(false);
        doc.setVisible(false);
        add(title);
        add(nm);
        add(name);
        add(mob);
        add(phn);
        add(gen);
        add(male);
        add(female);
        add(dob);
        add(d);
        add(m);
        add(y);
        add(add);
        add(address);
        add(contd);
        add(submit);
        add(print);
        add(clear);
        add(doc);
        name.addFocusListener(this);
        phn.addFocusListener(this);
        name.addKeyListener(this);
        submit.addActionListener(this);
        clear.addActionListener(this);
        print.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            if (name.getText() == "" || phn.getText() == "" || bg.getSelection() == null || d.getSelectedIndex() == 0
                    || m.getSelectedIndex() == 0 || y.getSelectedIndex() == 0 || address.getText() == "") {
                JOptionPane.showMessageDialog(null, "All filled are not filled !");
            }
            if (!(contd.isSelected())) {
                JOptionPane.showMessageDialog(null, "You have to accept the terms and conditions to proceed further !");
            } else {
                doc.setVisible(true);
                doc.setText("  Name : " + name.getText() + "\n");
                doc.append("  Phone No. : " + phn.getText() + "\n");
                if (male.isSelected())
                    doc.append("  Gender : M\n");
                else
                    doc.append("  Gender : F\n");
                doc.append("  DOB : " + d.getSelectedItem() + " / " + m.getSelectedItem() + " / " + y.getSelectedItem()
                        + "\n");
                doc.append("  Address : " + address.getText() + "\n");
                doc.append("  Date : " + sdf.format(dt));
            }

        }
        if (e.getSource() == clear) {
            int a;
            a = JOptionPane.showConfirmDialog(null, "Are you sure you want to clear all ?");
            if (a != 1) {
                name.setText("");
                phn.setText("");
                bg.clearSelection();
                d.setSelectedIndex(0);
                m.setSelectedIndex(0);
                y.setSelectedIndex(0);
                address.setText("");
                doc.setText("");
                doc.setVisible(false);
                contd.setSelected(false);
            }
        }
        if (e.getSource() == print) {
            try {
                PrintWriter pw = new PrintWriter("receipt.txt");
                pw.println(doc.getText());
                pw.close();
                Runtime rt = Runtime.getRuntime();
                rt.exec("notepad receipt.txt");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }

    public void keyReleased(KeyEvent ke) {

    }

    public void keyPressed(KeyEvent ke) {
        if (ke.getSource() == name) {
            if ((ke.getKeyCode() >= 48 & ke.getKeyCode() <= 57)) {
                JOptionPane.showMessageDialog(null, "Enter Alphabets Only");
                name.setText(name.getText().substring(0, name.getText().length() - 1));
            } else {

            }

        }

    }

    public void keyTyped(KeyEvent ke) {

    }

    public void focusLost(FocusEvent fe) {
        if (fe.getSource() == name) {
            focustext.append("Name : " + name.getText());
        }

    }

    public void focusGained(FocusEvent fe) {
        if (fe.getSource() == phn) {
            focustext.append("Focus gained on phone");
        }
    }

    public static void main(String[] args) {
        registrationform obj = new registrationform();
    }
}