import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
    public MyWindow() {
        setLocation(650, 450);
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(1, 2));

        JButton btn1 = new JButton("Push the button");
        add(btn1, BorderLayout.SOUTH);

        JButton btn2 = new JButton("Выход");
        add(btn2, BorderLayout.EAST);

        setVisible(true);
    }

}
