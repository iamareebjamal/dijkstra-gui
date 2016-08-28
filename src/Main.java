import gui.MainWindow;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {  }

        JFrame j = new JFrame();
        j.setTitle("Dijkstra Algorithm");

        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(new Dimension(900, 600));
        j.add(new MainWindow());
        j.setVisible(true);

    }

}
