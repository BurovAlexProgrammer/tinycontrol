package ru.avb.tinycontrol;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Alex on 27.11.2016.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException{
        JFrame frame = new JFrame("My title");
        //set resolution
        frame.setSize(100,100);
        frame.setSize(new Dimension(800,300));
        //title
        frame.setTitle("My test frame1");

        frame.setVisible(true);

        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);  //if click krestik button - app will be close
        //frame.setDefaultCloseOperation(frame.DO_NOTHING_ON_CLOSE);

        frame.setLocationRelativeTo(null); //app open by screen center

        /*
        Thread.sleep(500);
        frame.setState(JFrame.ICONIFIED);  //Minimaze
        Thread.sleep(500);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);  //Maximize
        Thread.sleep(500);
        frame.setState(JFrame.NORMAL);
        */


        frame.setLayout(new GridBagLayout());
        Font font = new Font("Verdana", Font.ITALIC, 25);
        JButton b1 = new JButton();
        b1.setText("button1");
        b1.setFont(font);
        JButton b2 = new JButton();
        b2.setText("button2");
        frame.add(b1);
        frame.add(b2);

        JProgressBar progress = new JProgressBar();
        frame.add(progress);
        progress.setMinimum(0);
        progress.setMaximum(100);
        progress.setIndeterminate(true);

        Thread.sleep(1000);
        progress.setValue(10);
        Thread.sleep(3000);
        progress.setValue(30);
        progress.setIndeterminate(false);




        //======LISTENERS
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                //Print
                System.out.println(e.getKeyCode());
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }
}
