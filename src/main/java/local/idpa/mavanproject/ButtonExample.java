package local.idpa.mavanproject;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Example");
        JPanel panel = new JPanel();

        JButton button = new JButton("Click Me"); // Creating a JButton with text "Click Me"
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        }); // Adding an ActionListener to the button
        panel.add(button); // Adding the button to the panel
        frame.add(panel); // Adding the panel to the frame

        frame.setSize(300, 200); // Setting the size of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Setting default close operation
        frame.setVisible(true); // Making the frame visible
    }
}
