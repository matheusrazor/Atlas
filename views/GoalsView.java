package views;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.ColorUIResource;

import controllers.GoalsController;

import java.awt.GridLayout;
import java.awt.BorderLayout;

public class GoalsView {

    private JFrame frame;
    private JPanel panel;
    private JButton addButton;
    private JButton cancelButton;
    private JTextField goalWaterField;
    private JTextField goalCalorieField;
    private JTextField goalProteinField;
    private JTextField goalCarbField;
    private JTextField goalFatField;

    public GoalsView() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Goals");
        
        goalWaterField = new JTextField("Water");
        goalCalorieField = new JTextField("Calories");
        goalProteinField = new JTextField("Proteins");
        goalCarbField= new JTextField("Carbs");
        goalFatField = new JTextField("Fats");

        addButton = new JButton("Add");
        cancelButton = new JButton("Cancel");
        
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                /*Controller gets all the text from the text fields and creates a new object*/
                frame.dispose();
                new GoalsController();
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
        panel.setBackground(new ColorUIResource(100, 100, 150));
        panel.add(addButton);
        panel.add(cancelButton);
        panel.add(goalWaterField);
        panel.add(goalCalorieField);
        panel.add(goalProteinField);
        panel.add(goalCarbField);
        panel.add(goalFatField);

        frame.add(panel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    public int getGoalWaterField() {
        return Integer.parseInt(goalWaterField.getText());
    }

    public int getGoalCalorieField() {
        return Integer.parseInt(goalCalorieField.getText());
    }

    public int getGoalProteinField() {
        return Integer.parseInt(goalProteinField.getText());
    }

    public int getGoalCarbField() {
        return Integer.parseInt(goalCarbField.getText());
    }
    
    public int getGoalFatField() {
        return Integer.parseInt(goalFatField.getText());
    }

    public static void main(String[] args) {
        new GoalsView();
    }

}