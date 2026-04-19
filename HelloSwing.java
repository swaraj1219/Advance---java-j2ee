import javax.swing.*;
import java.awt.*;

public class HelloSwing {
    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Swing Hello Program");

        // Create JLabel
        JLabel label = new JLabel("Hello! IV D , Welcome to Swing Programming", JLabel.CENTER);

        // Set font (plain, size 32)
        label.setFont(new Font("Arial", Font.PLAIN, 32));

        // Set text color to blue
        label.setForeground(Color.BLUE);

        // Add label to frame
        frame.add(label);

        // Frame settings
        frame.setSize(800, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}