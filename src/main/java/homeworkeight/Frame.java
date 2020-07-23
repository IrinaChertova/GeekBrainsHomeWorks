package homeworkeight;

import javax.swing.*;
import java.awt.*;

import static java.awt.Toolkit.getDefaultToolkit;

public class Frame extends JFrame {

    public Frame(){
        Toolkit kit = getDefaultToolkit(); // из Хорстманна
        Dimension screenSize = kit.getScreenSize(); // = Toolkit.getDefaultToolkit().getScreenSize()
        int screenWidth = screenSize.width;
        int screenHeigth = screenSize.height;
        this.setSize(screenWidth / 2, screenHeigth / 2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
