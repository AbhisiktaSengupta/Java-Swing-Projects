import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

//import javax.lang.model.util.ElementScanner14;
import javax.swing.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

class players extends JFrame implements ActionListener {
    JTextField player1 = new JTextField();
    JTextField player2 = new JTextField();
    JLabel lp1 = new JLabel("1st Player's Name");
    JLabel lp2 = new JLabel("2nd Player's Name");
    JButton cont = new JButton("CONTINUE");
    JButton exit = new JButton("EXIT");
    JLabel img = new JLabel();
    ImageIcon imgicon = new ImageIcon(
            new ImageIcon("playersback.jpg").getImage().getScaledInstance(450, 380, Image.SCALE_SMOOTH));
    Image icon = Toolkit.getDefaultToolkit().getImage("tictactoeicon.png");
    Dimension di = Toolkit.getDefaultToolkit().getScreenSize();

    public players() {
        setIconImage(icon);
        setLocation(((int) di.getWidth() / 2) - 200, ((int) di.getHeight() / 2) - 200);
        setLayout(null);
        setSize(450, 380);
        setVisible(true);
        setTitle("Tic Tac Toe");
        setResizable(false);
        img.setIcon(imgicon);

        lp1.setFont(new Font("Elephant", Font.BOLD, 15));
        lp2.setFont(new Font("Elephant", Font.BOLD, 15));
        cont.setFont(new Font("Britannic Bold", Font.BOLD, 15));
        exit.setFont(new Font("Britannic Bold", Font.BOLD, 15));

        player1.setBackground(Color.GRAY);
        player2.setBackground(Color.GRAY);
        player1.setForeground(Color.BLACK);
        player2.setForeground(Color.BLACK);

        cont.setBackground(Color.BLACK);
        exit.setBackground(Color.BLACK);
        cont.setForeground(Color.WHITE);
        exit.setForeground(Color.WHITE);

        player1.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        player2.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        img.setBounds(0, 0, 450, 380);
        lp1.setBounds(25, 50, 150, 40);
        player1.setBounds(170, 50, 200, 50);
        lp2.setBounds(25, 150, 160, 40);
        player2.setBounds(170, 150, 200, 50);
        cont.setBounds(70, 250, 130, 30);
        exit.setBounds(215, 250, 100, 30);
        add(lp1);
        add(player1);
        add(lp2);
        add(player2);
        add(cont);
        add(exit);
        add(img);
        cont.addActionListener(this);
        exit.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exit) {
            int a;
            a = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit ?");
            if (a != 1) {
                this.dispose();
            }
        }
        if (e.getSource() == cont) {
            tictactoe obj1 = new tictactoe(player1.getText(), player2.getText());
            this.dispose();
            try {
                // AudioInputStream ais = AudioSystem.getAudioInputStream(new
                // File("trumpet.mp3").getAbsoluteFile());
                AudioInputStream ais = AudioSystem.getAudioInputStream(new File("trumpet.wav").getAbsoluteFile());
                Clip c = AudioSystem.getClip();
                c.open(ais);
                c.start();
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }

    }

    public static void main(String[] args) {
        players obj = new players();
    }
}