// Q5c: Develop a Swing program in Java to add the countries 
// USA, India, Vietnam, Canada, Denmark, France, Great Britain, 
// Japan, Africa, Greenland, Singapore into a JList and display 
// the capital of the countries on console whenever selected.

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.HashMap;

public class CountryCapitalDemo {

    public CountryCapitalDemo() {

        JFrame frame = new JFrame("Country Capital Demo");

        // Country list
        String countries[] = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        // Create JList
        JList<String> list = new JList<>(countries);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Create mapping (Country -> Capital)
        HashMap<String, String> capitalMap = new HashMap<>();
        capitalMap.put("USA", "Washington D.C.");
        capitalMap.put("India", "New Delhi");
        capitalMap.put("Vietnam", "Hanoi");
        capitalMap.put("Canada", "Ottawa");
        capitalMap.put("Denmark", "Copenhagen");
        capitalMap.put("France", "Paris");
        capitalMap.put("Great Britain", "London");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("Africa", "No single capital"); // continent
        capitalMap.put("Greenland", "Nuuk");
        capitalMap.put("Singapore", "Singapore");

        // Listener
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {

                if (!e.getValueIsAdjusting()) {
                    String selectedCountry = list.getSelectedValue();

                    // Get capital
                    String capital = capitalMap.get(selectedCountry);

                    // Print result
                    System.out.println("Country: " + selectedCountry);
                    System.out.println("Capital: " + capital);
                    System.out.println("------------------------");
                }
            }
        });

        // Add to frame
        frame.add(new JScrollPane(list));
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CountryCapitalDemo();
    }
}