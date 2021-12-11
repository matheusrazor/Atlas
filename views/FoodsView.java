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
    private JTextField foodCalorieField;
    private JTextField foodProteinField;
    private JTextField foodCarbField;
    private JTextField foodFatField;

    public FoodsView() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Foods");
        
        foodNameField = new JTextField("Food name");
        foodCalorieField = new JTextField("Calories");
        foodProteinField = new JTextField("Proteins");
        foodCarbField = new JTextField("Carbs");
        foodFatField = new JTextField("Fats");
        
        addButton = new JButton("Add");
        cancelButton = new JButton("Cancel");
        
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel.setLayout(new GridLayout(5, 2));
        panel.setBackground(new ColorUIResource(100, 120, 100));
        panel.add(addButton);
        panel.add(cancelButton);
        panel.add(foodNameField);
        panel.add(foodCalorieField);
        panel.add(foodProteinField);
        panel.add(foodCarbField);
        panel.add(foodFatField);

        frame.add(panel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new FoodsView();
    }

}
