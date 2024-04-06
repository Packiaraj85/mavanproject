package local.idpa.mavanproject;
import java.awt.*;
import javax.swing.*;
public class TopLevelWindow {
    private static void createWindow()
    {
//Create and set up the window.
        JFrame frame = new JFrame("Simple GUI for Packiaraj D");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel textLabel = new JLabel("I'm a label in the window",SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(1024, 987));
        frame.getContentPane().add(textLabel, BorderLayout.CENTER);       //Display the window.
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args)
    {
        createWindow();
    }
}
