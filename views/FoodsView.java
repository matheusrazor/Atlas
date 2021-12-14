package views;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.ColorUIResource;

import java.awt.GridLayout;
import java.awt.BorderLayout;

public class FoodsView {

    private JFrame frame;
    private JPanel panel;
    private JButton addButton;
    private JButton cancelButton;
    private JTextField foodNameField;
    private JTextField foodQuantityField;
    private JTextField foodCalorieField;
    private JTextField foodProteinField;
    private JTextField foodCarbField;
    private JTextField foodFatField;

    public FoodsView() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Foods");
        
        foodNameField = new JTextField("Food name");
        foodQuantityField = new JTextField("Quantity");
        foodCalorieField = new JTextField("Calories");
        foodProteinField = new JTextField("Proteins");
        foodCarbField = new JTextField("Carbs");
        foodFatField = new JTextField("Fats");
        
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
        panel.setBackground(new ColorUIResource(100, 120, 100));
        panel.add(addButton);
        panel.add(cancelButton);
        panel.add(foodNameField);
        panel.add(foodQuantityField);
        panel.add(foodCalorieField);
        panel.add(foodProteinField);
        panel.add(foodCarbField);
        panel.add(foodFatField);

        frame.add(panel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }


    public String getFoodNameField() {
        return foodNameField.getText();
    }

    public int getfoodQuantityField() {
        return Integer.parseInt(foodQuantityField.getText());
    }

    public double getFoodCalorieField() {
        return Double.parseDouble(foodCalorieField.getText());
    }
  
    public double getFoodProteinField() {
        return Double.parseDouble(foodProteinField.getText());
    }

    public double getFoodCarbField() {
        return Double.parseDouble(foodCarbField.getText());
    }

    public double getFoodFatField() {
        return Double.parseDouble(foodFatField.getText());
    }


    public static void main(String[] args) {
        new FoodsView();
    }

}
