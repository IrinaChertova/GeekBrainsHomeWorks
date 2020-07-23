package homeworkeight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        m.start();
    }

    public void start() {
        Frame frame = new Frame();
        Panel panel1 = new Panel();
        PanelWithOval panel2 = new PanelWithOval();
        Button buttonColor = new Button("change color");
        Button buttonClose = new Button("CLOSE");
        Button buttonOval = new Button("change oval");

        buttonColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int red=(int)(Math.random()*255);
                int green=(int)(Math.random()*255);
                int blue=(int)(Math.random()*255);
                Color color = new Color(red, green,blue);
                panel1.setBackground(color);
            }
        });


        buttonClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        buttonOval.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel2.repaint();
            }
        });

        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel1.add(buttonColor);

        frame.getContentPane().add(BorderLayout.EAST, panel1);
        frame.getContentPane().add(BorderLayout.CENTER, panel2);
        frame.getContentPane().add(BorderLayout.SOUTH, buttonClose);
        frame.getContentPane().add(BorderLayout.NORTH, buttonOval);
        frame.setVisible(true);
    }

}


