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
        final JPanel panel = new JPanel(new GridBagLayout());
        final GridBagConstraints grid = new GridBagConstraints();
        panel.setBackground(new Color(0, 255, 127));
        getContentPane().add(panel);

        grid.gridx = 0;
        grid.gridy = 0;
        grid.gridwidth = 2;
        grid.gridheight = 1;
        panel.add(new JLabel("Hello world!", SwingConstants.CENTER), grid);
    }

    public static void main(String[] args) {
        new Main("Game", 500,400);
    }
}