package ru.Egor5f421;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Main extends JFrame {

    /** Этот конструктор создаёт окно
     * @param name Имя программы
     * @param w Ширина окна
     * @param h Высота окна */
    public Main(String name, int w, int h) {
        super(name);
        setSize(w,h);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        window();
    }

    /** Отрисовывает всю графику
     * @see #Main(String, int, int)  Main */
    private void window() {
        final JPanel panel = new JPanel(new GridBagLayout()) {
            @Override
            public void paint(Graphics g) {
//                Background
                Graphics2D d = (Graphics2D) g;
                d.setColor(new Color(0,255,127));
                Shape bg = new Ellipse2D.Double(-300,-300,1500,1500);
                d.fill(bg);
                d.draw(bg);
                d.setColor(Color.BLACK);

                int y = 300;
                int w = 70;
                int h = 20;

                int ox = 80;
                int c = 3;
                int o = 130;
                int j = ox + (o * c);
                for (int i = ox; i < j; i+= o) {
                    d.fillRoundRect(i,y,w,h,10,20);
                }

                d.drawImage();
            }
        };
        getContentPane().add(panel);
        /*final GridBagConstraints grid = new GridBagConstraints();
        panel.setBackground(new Color(0, 255, 127));

        grid.gridx = 0;
        grid.gridy = 0;
        grid.gridwidth = 2;
        grid.gridheight = 1;*/
    }

    public static void main(String[] args) {
        new Main("Game", 500,400);
    }
}