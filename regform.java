import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.io.PrintWriter;
import javax.swing.*;
import java.util.Date;
import java.text.SimpleDateFormat;

class regform extends JFrame implements ActionListener, KeyListener {
    JLabel img = new JLabel();
    ImageIcon imgicon = new ImageIcon(
            new ImageIcon("form.jpg").getImage().getScaledInstance(650, 600, Image.SCALE_SMOOTH));
    Date dt = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    String dat[] = { "Date", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
            "17", "18", "19", "20", "21", "22", "23", "24", "25", "26",
            "27", "28", "29", "30", "31" };
    String month[] = { "Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };
    String yr[] = { "Year", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001",
            "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011",
            "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023" };
    JLabel title = new JLabel("REGISTRATION FORM");
    JLabel nm = new JLabel("Name");
    JLabel date = new JLabel("Today's Date");
    JLabel id = new JLabel("Reg. Id.");
    JLabel mob = new JLabel("Phone No.");
    JLabel gen = new JLabel("Gender");
    JLabel dob = new JLabel("DOB");
    JLabel add = new JLabel("Address");
    JTextField name = new JTextField();
    JTextField phn = new JTextField();
    JTextField datetx = new JTextField();
    JTextField rid = new JTextField();
    JRadioButton male = new JRadioButton("M");
    JRadioButton female = new JRadioButton("F");
    JComboBox d = new JComboBox(dat);
    JComboBox m = new JComboBox(month);
    JComboBox y = new JComboBox(yr);
    JTextArea address = new JTextArea();
    JCheckBox contd = new JCheckBox("I accepts the terms and conditions", false);
    JButton save = new JButton("Save");
    JButton newbtn = new JButton("New");
    JButton edit = new JButton("Edit");
    JButton search = new JButton("Search");
    ButtonGroup bg = new ButtonGroup();
    Dimension di = Toolkit.getDefaultToolkit().getScreenSize();
    int i = 100;

    regform() {
        setLayout(null);
        setSize(650, 600);
        setVisible(true);
        setResizable(false);
        setTitle("Registration Form");
        setLocation(((int) di.getWidth() / 2) - 300, ((int) di.getHeight() / 2) - 310);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        bg.add(male);
        bg.add(female);
        // rid.setBackground(Color.BLUE);
        // id.setOpaque(false);
        address.setLineWrap(true);
        // textfield e setOpaque() kaaj kore naah??
        img.setIcon(imgicon);
        title.setFont(new Font("Britannic Bold", Font.ITALIC, 25));
        nm.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        date.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        id.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        mob.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        gen.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        dob.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        add.setFont(new Font("Times New Roman", Font.ITALIC, 15));

        name.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        datetx.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        rid.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        mob.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        male.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        female.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        d.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        m.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        y.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        address.setFont(new Font("Times New Roman", Font.ITALIC, 15));

        contd.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        save.setFont(new Font("Britannic Bold", Font.ITALIC, 15));
        newbtn.setFont(new Font("Britannic Bold", Font.ITALIC, 15));
        edit.setFont(new Font("Britannic Bold", Font.ITALIC, 15));
        search.setFont(new Font("Britannic Bold", Font.ITALIC, 15));
        img.setBounds(0, 0, 650, 600);
        title.setBounds(180, 5, 250, 30);
        id.setBounds(20, 50, 80, 30);
        rid.setBounds(100, 50, 100, 30);
        date.setBounds(275, 50, 100, 30);
        datetx.setBounds(380, 50, 100, 30);
        nm.setBounds(20, 100, 60, 30);
        name.setBounds(100, 100, 170, 30);
        mob.setBounds(20, 150, 80, 30);
        phn.setBounds(100, 150, 170, 30);
        gen.setBounds(20, 200, 60, 30);
        male.setBounds(100, 200, 60, 30);
        female.setBounds(170, 200, 60, 30);
        dob.setBounds(20, 250, 60, 30);
        d.setBounds(100, 250, 80, 30);
        m.setBounds(190, 250, 80, 30);
        y.setBounds(280, 250, 80, 30);
        add.setBounds(20, 300, 60, 30);
        address.setBounds(100, 300, 150, 150);
        contd.setBounds(20, 460, 300, 30);
        save.setBounds(30, 510, 100, 30);
        newbtn.setBounds(170, 510, 100, 30);
        edit.setBounds(310, 510, 100, 30);
        search.setBounds(450, 510, 100, 30);
        contd.setOpaque(false);
        male.setOpaque(false);
        female.setOpaque(false);
        add(title);
        add(id);
        add(rid);
        add(date);
        add(datetx);
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
        add(save);
        add(edit);
        add(newbtn);
        add(search);
        add(img);
        save.setEnabled(false);
        edit.setEnabled(false);
        search.setEnabled(false);

        name.addKeyListener(this);
        save.addActionListener(this);
        newbtn.addActionListener(this);
        search.addActionListener(this);
        edit.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == save) {

        }
        if (e.getSource() == newbtn) {
            save.setEnabled(true);
            edit.setEnabled(true);
            search.setEnabled(true);
            datetx.setText(sdf.format(dt));
            rid.setText("" + (++i));
            name.setText("");
            phn.setText("");
            bg.clearSelection();
            d.setSelectedIndex(0);
            m.setSelectedIndex(0);
            y.setSelectedIndex(0);
            address.setText("");
            contd.setSelected(false);
        }
        if (e.getSource() == edit) {

        }
        if (e.getSource() == search) {

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

    public static void main(String[] args) {
        regform obj = new regform();
    }
}