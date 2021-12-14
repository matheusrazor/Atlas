package views;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.ColorUIResource;

import java.awt.GridLayout;
import java.awt.BorderLayout;

public class UsersView {

    private JFrame frame;
    private JPanel panel;
    private JButton addButton;
    private JButton cancelButton;
    private JTextField userNameField;
    private JTextField userHeightField;
    private JTextField userWeightField;
    private JTextField userActivityField;

    public UsersView() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Users");
        
        userNameField = new JTextField("Name");
        userHeightField = new JTextField("Height in cm");
        userWeightField = new JTextField("Weight in kg");
        userActivityField= new JTextField("Activity 1 - 5");

        addButton = new JButton("Add");
        cancelButton = new JButton("Cancel");
        
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                /*Controller gets all the text from the text fields and creates a new object*/
            }
        });

        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                /*Go back to the menu view*/
            }
        });
        
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel.setLayout(new GridLayout(5, 2));
        panel.setBackground(new ColorUIResource(150, 100, 100));
        panel.add(addButton);
        panel.add(cancelButton);
        panel.add(userNameField);
        panel.add(userHeightField);
        panel.add(userWeightField);
        panel.add(userActivityField);

        frame.add(panel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new UsersView();
    }

}