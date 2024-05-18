import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Math;

public class emoji extends JFrame implements MouseListener, MouseMotionListener {
    int r[] = { 148, 75, 0, 0, 255, 255, 255 };
    int g[] = { 0, 0, 0, 255, 255, 127, 0 };
    int b[] = { 211, 130, 255, 0, 0, 0, 0 };
    JLabel img = new JLabel();
    ImageIcon happy = new ImageIcon(
            new ImageIcon("smiling.png").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH));
    ImageIcon tensed = new ImageIcon(
            new ImageIcon("tensed.png").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH));
    JButton btn = new JButton("You clicked me 0 times");
    int click = 0;

    emoji() {
        setLayout(null);
        setSize(500, 600);
        setVisible(true);
        setResizable(false);
        setTitle("emoji");
        img.setIcon(happy);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        img.setBounds(40, 50, 300, 300);
        btn.setBounds(50, 400, 200, 40);
        add(img);
        add(btn);
        img.addMouseListener(this);
        btn.addMouseListener(this);
    }

    public void mouseExited(MouseEvent me) {
        // img.setIcon(happy);
    }

    public void mouseEntered(MouseEvent me) {
        // img.setIcon(tensed);
    }

    public void mouseReleased(MouseEvent me) {
        // img.setIcon(happy);
        // System.out.println("You released the button");
        if (me.getSource() == img) {
            img.setIcon(happy);
        }

    }

    public void mousePressed(MouseEvent me) {
        if (me.getSource() == img) {
            img.setIcon(tensed);
        }

    }

    public void mouseClicked(MouseEvent me) {
        // System.out.println(me.getX() + "," + me.getY());

        if (me.getSource() == btn) {
            btn.setText("You clicked me " + (++click) + " times");
            int index = (int) Math.floor(Math.random() * 7);
            btn.setBackground(new Color(r[index], g[index], b[index]));
            System.out.println(index);
        }
    }

    public void mouseMoved(MouseEvent me) {
    }

    public void mouseDragged(MouseEvent me) {

    }

    public static void main(String[] args) {
        emoji obj = new emoji();
    }
}