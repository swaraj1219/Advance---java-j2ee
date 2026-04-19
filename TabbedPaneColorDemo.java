
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class TabbedPaneColorDemo {

    public TabbedPaneColorDemo() {

        JFrame frame = new JFrame("Tabbed Pane Color Demo");

        // Create Tabbed Pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create Panels for each tab
        JPanel redPanel = new JPanel();
        JPanel bluePanel = new JPanel();
        JPanel greenPanel = new JPanel();

        // Set background colors
        redPanel.setBackground(Color.RED);
        bluePanel.setBackground(Color.BLUE);
        greenPanel.setBackground(Color.GREEN);

        // Add tabs
        tabbedPane.addTab("RED", redPanel);
        tabbedPane.addTab("BLUE", bluePanel);
        tabbedPane.addTab("GREEN", greenPanel);

        // Add Change Listener (detect tab switch)
        tabbedPane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {

                int index = tabbedPane.getSelectedIndex();
                String title = tabbedPane.getTitleAt(index);

                // Print selected tab color
                System.out.println("Selected Tab: " + title);
            }
        });

        // Add to frame
        frame.add(tabbedPane);

        // Frame settings
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new TabbedPaneColorDemo();
    }
}