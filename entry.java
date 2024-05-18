import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
//import javax.lang.model.util.ElementScanner14;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

class entry extends JFrame implements ActionListener {
    JButton play = new JButton("PLAY");
    JButton exit = new JButton("EXIT");
    JLabel img = new JLabel();
    ImageIcon imgicon = new ImageIcon(
            new ImageIcon("backgroundtic.jpg").getImage().getScaledInstance(500, 400, Image.SCALE_SMOOTH));
    Image icon = Toolkit.getDefaultToolkit().getImage("tictactoeicon.png");
    Dimension di = Toolkit.getDefaultToolkit().getScreenSize();

    public entry() {
        setIconImage(icon);
        setLocation(((int) di.getWidth() / 2) - 270, ((int) di.getHeight() / 2) - 250);
        setLayout(null);
        setSize(500, 400);
        setVisible(true);
        setTitle("Tic Tac Toe");
        setResizable(false);

        img.setIcon(imgicon);
        img.setBounds(0, 0, 600, 400);
        play.setBounds(100, 300, 130, 50);
        exit.setBounds(260, 300, 130, 50);

        play.setFont(new Font("Times New Roman", Font.BOLD, 20));
        exit.setFont(new Font("Times New Roman", Font.BOLD, 20));
        play.setBackground(new Color(255, 73, 163, 255));
        play.setForeground(Color.BLACK);
        exit.setBackground(new Color(255, 73, 163, 255));
        exit.setForeground(Color.BLACK);

        add(play);
        add(exit);
        add(img);

        play.addActionListener(this);
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
        if (e.getSource() == play) {
            try {
                // AudioInputStream ais = AudioSystem.getAudioInputStream(new
                // File("trumpet.mp3").getAbsoluteFile());
                AudioInputStream ais = AudioSystem.getAudioInputStream(new File("buttonpress.wav").getAbsoluteFile());
                Clip c = AudioSystem.getClip();
                c.open(ais);
                c.start();
            } catch (Exception ex) {
                System.out.println(ex);
            }
            players obj1 = new players();
            this.dispose();
        }

    }

    public static void main(String[] args) {
        entry obj = new entry();
    }
}