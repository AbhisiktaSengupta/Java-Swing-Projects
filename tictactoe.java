import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

class tictactoe extends JFrame implements ActionListener {

    JButton b1 = new JButton();
    JButton b2 = new JButton();
    JButton b3 = new JButton();
    JButton b4 = new JButton();
    JButton b5 = new JButton();
    JButton b6 = new JButton();
    JButton b7 = new JButton();
    JButton b8 = new JButton();
    JButton b9 = new JButton();
    JLabel title = new JLabel("TIC TAC TOE");
    JLabel lb1 = new JLabel("");
    JLabel lb2 = new JLabel("");
    JLabel lb3 = new JLabel("");
    JLabel lb4 = new JLabel("");
    JLabel lb5 = new JLabel("");
    JLabel lb6 = new JLabel("");
    JLabel lb7 = new JLabel("");
    JLabel lb8 = new JLabel("");
    JLabel lb9 = new JLabel("");
    JLabel img = new JLabel();
    JLabel winner = new JLabel("");
    JMenuBar mb = new JMenuBar();
    JMenu menu = new JMenu("Settings");
    JMenuItem newgame = new JMenuItem("New Game");
    JMenuItem replay = new JMenuItem("Replay");
    JMenuItem exit = new JMenuItem("Exit");
    Image icon = Toolkit.getDefaultToolkit().getImage("tictactoeicon.png");
    Dimension di = Toolkit.getDefaultToolkit().getScreenSize();
    ImageIcon imgicon = new ImageIcon(
            new ImageIcon("background_tictac.jpg").getImage().getScaledInstance(600, 500, Image.SCALE_SMOOTH));
    String player1;
    String player2;

    public tictactoe(String p1, String p2) {
        player1 = p1;
        player2 = p2;
        setIconImage(icon);
        setLocation(((int) di.getWidth() / 2) - 270, ((int) di.getHeight() / 2) - 250);
        setLayout(null);
        setSize(600, 500);
        setVisible(true);
        setTitle("Tic Tac Toe");
        setResizable(false);
        title.setFont(new Font("Britannic Bold", Font.ITALIC, 30));
        winner.setFont(new Font("Britannic Bold", Font.ITALIC, 25));
        lb1.setFont(new Font("Rubik Moonrocks", Font.BOLD, 45));
        lb2.setFont(new Font("Rubik Moonrocks", Font.BOLD, 45));
        lb3.setFont(new Font("Rubik Moonrocks", Font.BOLD, 45));
        lb4.setFont(new Font("Rubik Moonrocks", Font.BOLD, 45));
        lb5.setFont(new Font("Rubik Moonrocks", Font.BOLD, 45));
        lb6.setFont(new Font("Rubik Moonrocks", Font.BOLD, 45));
        lb7.setFont(new Font("Rubik Moonrocks", Font.BOLD, 45));
        lb8.setFont(new Font("Rubik Moonrocks", Font.BOLD, 45));
        lb9.setFont(new Font("Rubik Moonrocks", Font.BOLD, 45));
        winner.setForeground(new Color(86, 51, 239));
        title.setForeground(new Color(91, 101, 221));
        img.setIcon(imgicon);
        img.setBounds(0, 0, 600, 500);
        title.setBounds(195, 10, 200, 50);
        winner.setBounds(200, 350, 200, 20);
        lb1.setBounds(150, 100, 50, 50);
        lb2.setBounds(250, 100, 50, 50);
        lb3.setBounds(350, 100, 50, 50);
        lb4.setBounds(150, 180, 50, 50);
        lb5.setBounds(250, 180, 50, 50);
        lb6.setBounds(350, 180, 50, 50);
        lb7.setBounds(150, 260, 50, 50);
        lb8.setBounds(250, 260, 50, 50);
        lb9.setBounds(350, 260, 50, 50);

        b1.setBounds(150, 100, 50, 50);
        b2.setBounds(250, 100, 50, 50);
        b3.setBounds(350, 100, 50, 50);
        b4.setBounds(150, 180, 50, 50);
        b5.setBounds(250, 180, 50, 50);
        b6.setBounds(350, 180, 50, 50);
        b7.setBounds(150, 260, 50, 50);
        b8.setBounds(250, 260, 50, 50);
        b9.setBounds(350, 260, 50, 50);
        // winner.setVisible(false);
        menu.add(newgame);
        menu.add(replay);
        menu.add(exit);
        mb.add(menu);
        this.setJMenuBar(mb);
        mb.setVisible(true);
        add(title);
        add(winner);

        add(lb1);
        add(lb2);
        add(lb3);
        add(lb4);
        add(lb5);
        add(lb6);
        add(lb7);
        add(lb8);
        add(lb9);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);

        add(img);

        b9.addActionListener(this);
        b8.addActionListener(this);
        b7.addActionListener(this);
        b6.addActionListener(this);
        b5.addActionListener(this);
        b4.addActionListener(this);
        b3.addActionListener(this);
        b2.addActionListener(this);
        b1.addActionListener(this);
        newgame.addActionListener(this);
        replay.addActionListener(this);
        exit.addActionListener(this);
    }

    int flag = 1, win = 0;

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
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
            if (flag == 1) {
                lb1.setText("X");
                lb1.setForeground(Color.RED);
                b1.setVisible(false);
                flag = 0;
            } else {
                lb1.setText("O");
                lb1.setForeground(Color.BLUE);
                b1.setVisible(false);
                flag = 1;
                lb1.setForeground(Color.BLUE);
            }

        }
        if (e.getSource() == b2) {
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
            if (flag == 1) {
                lb2.setText("X");
                lb2.setForeground(Color.RED);
                b2.setVisible(false);
                flag = 0;
            } else {
                lb2.setText("O");
                lb2.setForeground(Color.BLUE);
                b2.setVisible(false);
                flag = 1;
            }
        }
        if (e.getSource() == b3) {
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
            if (flag == 1) {
                lb3.setText("X");
                lb3.setForeground(Color.RED);
                b3.setVisible(false);
                flag = 0;
            } else {
                lb3.setText("O");
                lb3.setForeground(Color.BLUE);
                b3.setVisible(false);
                flag = 1;
            }
        }
        if (e.getSource() == b4) {
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
            if (flag == 1) {
                lb4.setText("X");
                lb4.setForeground(Color.RED);
                b4.setVisible(false);
                flag = 0;
            } else {
                lb4.setText("O");
                lb4.setForeground(Color.BLUE);
                b4.setVisible(false);
                flag = 1;
            }
        }
        if (e.getSource() == b5) {
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
            if (flag == 1) {
                lb5.setText("X");
                lb5.setForeground(Color.RED);
                b5.setVisible(false);
                flag = 0;
            } else {
                lb5.setText("O");
                lb5.setForeground(Color.BLUE);
                b5.setVisible(false);
                flag = 1;
            }
        }
        if (e.getSource() == b6) {
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
            if (flag == 1) {
                lb6.setText("X");
                lb6.setForeground(Color.RED);
                b6.setVisible(false);
                flag = 0;
            } else {
                lb6.setText("O");
                lb6.setForeground(Color.BLUE);
                b6.setVisible(false);
                flag = 1;
            }
        }
        if (e.getSource() == b7) {
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
            if (flag == 1) {
                lb7.setText("X");
                lb7.setForeground(Color.RED);
                b7.setVisible(false);
                flag = 0;
            } else {
                lb7.setText("O");
                lb7.setForeground(Color.BLUE);
                b7.setVisible(false);
                flag = 1;
            }
        }
        if (e.getSource() == b8) {
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
            if (flag == 1) {
                lb8.setText("X");
                lb8.setForeground(Color.RED);
                b8.setVisible(false);
                flag = 0;
            } else {
                lb8.setText("O");
                lb8.setForeground(Color.BLUE);
                b8.setVisible(false);
                flag = 1;
            }
        }
        if (e.getSource() == b9) {
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
            if (flag == 1) {
                lb9.setText("X");
                lb9.setForeground(Color.RED);
                b9.setVisible(false);
                flag = 0;
            } else {
                lb9.setText("O");
                lb9.setForeground(Color.BLUE);
                b9.setVisible(false);
                flag = 1;
            }
        }
        if (e.getSource() == exit) {
            int a;
            a = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit ?");
            if (a != 1) {
                this.dispose();
            }
        }
        if (e.getSource() == newgame) {
            // System.out.println("hi");
            players pl = new players();
            this.dispose();

            // winner.setVisible(false);
            // b1.setEnabled(true);
            // b2.setEnabled(true);
            // b3.setEnabled(true);
            // b4.setEnabled(true);
            // b5.setEnabled(true);
            // b6.setEnabled(true);
            // b7.setEnabled(true);
            // b8.setEnabled(true);
            // b9.setEnabled(true);
            // lb1.setText("");
            // lb1.setText("");
            // lb1.setText("");
            // lb1.setText("");
            // lb1.setText("");
            // lb1.setText("");
            // lb1.setText("");
            // lb1.setText("");
            // lb1.setText("");

        }
        if (e.getSource() == replay) {

            winner.setVisible(false);
            b1.setVisible(true);
            win = 0;
            flag = 1;
            b2.setVisible(true);
            b3.setVisible(true);
            b4.setVisible(true);
            b5.setVisible(true);
            b6.setVisible(true);
            b7.setVisible(true);
            b8.setVisible(true);
            b9.setVisible(true);
            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
            b5.setEnabled(true);
            b6.setEnabled(true);
            b7.setEnabled(true);
            b8.setEnabled(true);
            b9.setEnabled(true);
            lb1.setText("");
            lb2.setText("");
            lb3.setText("");
            lb4.setText("");
            lb5.setText("");
            lb6.setText("");
            lb7.setText("");
            lb8.setText("");
            lb9.setText("");
        }

        if ((lb1.getText().equals(lb2.getText())) && (lb2.getText().equals(lb3.getText()))
                && lb1.getText().length() != 0) {
            win = 1;
        } else if ((lb4.getText().equals(lb5.getText())) && (lb5.getText().equals(lb6.getText()))
                && lb4.getText().length() != 0) {
            win = 1;
        } else if ((lb7.getText().equals(lb8.getText())) && (lb8.getText().equals(lb9.getText()))
                && lb7.getText().length() != 0) {
            win = 1;
        } else if ((lb1.getText().equals(lb4.getText())) && (lb4.getText().equals(lb7.getText()))
                && lb1.getText().length() != 0) {
            win = 1;
        } else if ((lb2.getText().equals(lb5.getText())) && (lb5.getText().equals(lb8.getText()))
                && lb2.getText().length() != 0) {
            win = 1;
        } else if ((lb3.getText().equals(lb6.getText())) && (lb6.getText().equals(lb9.getText()))
                && lb3.getText().length() != 0) {
            win = 1;
        } else if ((lb1.getText().equals(lb5.getText())) && (lb5.getText().equals(lb9.getText()))
                && lb1.getText().length() != 0) {
            win = 1;
        } else if ((lb3.getText().equals(lb5.getText())) && (lb5.getText().equals(lb7.getText()))
                && lb3.getText().length() != 0) {
            win = 1;
        } else if (lb1.getText().length() != 0 && lb2.getText().length() != 0 && lb3.getText().length() != 0
                && lb4.getText().length() != 0 && lb5.getText().length() != 0 && lb6.getText().length() != 0
                && lb7.getText().length() != 0 && lb8.getText().length() != 0 && lb9.getText().length() != 0) {
            win = -1;
        }
        if (win == 1 && flag == 0) {
            // player1 win
            winner.setText(player1 + " has won!!");
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
            winner.setVisible(true);
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        } else if (win == 1 && flag == 1) {
            // player2 win
            winner.setText(player2 + " has won!!");
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
            winner.setVisible(true);
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
        if (win == -1) {
            winner.setText("It's a Tie!!");
            winner.setVisible(true);
        }
        // else if (win == 0) {
        // // draw
        // }

    }

    public static void main(String[] args) {
        tictactoe obj = new tictactoe("a", "b");

    }

}