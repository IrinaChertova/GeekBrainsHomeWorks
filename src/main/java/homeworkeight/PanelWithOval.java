package homeworkeight;

import java.awt.Color;
import java.awt.Graphics;

public class PanelWithOval extends Panel {


    public void paintComponent (Graphics g) {

        int red=(int)(Math.random()*255);
        int green=(int)(Math.random()*255);
        int blue=(int)(Math.random()*255);
        Color color = new Color(red, green,blue);
        g.setColor(color);
        g.fillOval(100, 100, 70, 50);

        }
    }


