// Q5d: Develop a Swing program in Java to create a Tabbed Pane 
// of Cyan, Magenta and Yellow and display the concerned color 
// whenever the specific tab is selected in the Pane.

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class TabbedPaneCMYDemo {

    public TabbedPaneCMYDemo() {

        JFrame frame = new JFrame("CMY Tabbed Pane");

        // Create Tabbed Pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Panels for each color
        JPanel cyanPanel = new JPanel();
        JPanel magentaPanel = new JPanel();
        JPanel yellowPanel = new JPanel();

        // Set background colors
        cyanPanel.setBackground(Color.CYAN);
        magentaPanel.setBackground(Color.MAGENTA);
        yellowPanel.setBackground(Color.YELLOW);

        // Add tabs
        tabbedPane.addTab("CYAN", cyanPanel);
        tabbedPane.addTab("MAGENTA", magentaPanel);
        tabbedPane.addTab("YELLOW", yellowPanel);

        // Change listener
        tabbedPane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {

                int index = tabbedPane.getSelectedIndex();
                String tabName = tabbedPane.getTitleAt(index);

                System.out.println("Selected Tab: " + tabName);
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
        new TabbedPaneCMYDemo();
    }
}