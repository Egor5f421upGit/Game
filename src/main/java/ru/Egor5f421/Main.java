package ru.Egor5f421;

import javax.swing.*;
import java.awt.*;

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
        var f = this;
        final JPanel panel = new JPanel(new GridBagLayout()) {
            @Override
            public void paint(Graphics g) {
                //Background
                Graphics2D d = (Graphics2D) g;
                d.setColor(new Color(0,255,127));
                d.fillRect(0,0,getWidth(),getHeight());

                d.setColor(new Color(231, 66, 101));
                d.setFont(new Font("font", Font.BOLD, 50));
                d.drawString("Фон", 195,getHeight()/2-getHeight()/4);

                d.setStroke(new BasicStroke(10));
                d.drawRoundRect(195, getHeight()/2-getHeight()/4+10, 105,1,5,1);
                try {
                    String patch = System.getProperty("user.dir")+"/src/main/resources/E.png";
                    d.drawImage(new ImageIcon(patch).getImage(), 195, 180, 100, 170, super::imageUpdate);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        };
        getContentPane().add(panel);

        final GridBagConstraints grid = new GridBagConstraints();

        grid.gridx = 0;
        grid.gridy = 0;
        grid.gridwidth = 3;
        grid.gridheight = 1;

    }

    public static void main(String[] args) {
        new Main("Game", 500,400);
    }
}