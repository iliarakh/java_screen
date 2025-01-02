package main;

import java.awt.Color;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;

public class Main {

    static final int DEFUALT_WIDTH = 600;
    static final int DEFUALT_HEIGHT = 600;

    public static JFrame createScreen() {

        JFrame window = new JFrame("Ilias Window");

        window.setSize(DEFUALT_WIDTH, DEFUALT_HEIGHT);

        window.setVisible(true);

        return window;

    }

    public static void colorChanger(JFrame window, Color color) {

        window.getContentPane().setBackground(color);

    }

    public static void colorAlternator(JFrame window) throws InterruptedException {

        while (true) {

            Color randomColor = createRandomColor();

            colorChanger(window, randomColor);

            TimeUnit.SECONDS.sleep(1);
        }

    }

    public static Color createRandomColor() {
        Random rand = new Random();
        int randR = rand.nextInt(255);
        int randG = rand.nextInt(255);
        int randB = rand.nextInt(255);

        Color color = new Color(randR, randG, randB);

        return color;
    }

    public static void main(String[] args) throws InterruptedException {

        JFrame window = createScreen();
        colorAlternator(window);

    }

}
