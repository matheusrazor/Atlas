package views;

import javax.swing.*;
import java.awt.*;

public class MenuView extends JFrame {
    
    GridLayout gridButtons = new GridLayout(2, 2, 12, 12);
    private JPanel headerPanel;
    private JLabel headerLabel;
    private JFrame bgFrame;
    private JButton foodButton;
    private JButton waterButton;

    public MenuView() {

        bgFrame = new JFrame("Food Atlas");
        bgFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bgFrame.setResizable(false);
        bgFrame.setLayout(gridButtons);
        
        headerPanel = new JPanel();
        headerPanel.setSize(500, 100);

        headerLabel = new JLabel();
        headerLabel.setSize(500, 100);
        headerLabel.setMaximumSize(new java.awt.Dimension(500, 100));
        headerLabel.setIcon(new ImageIcon("assets/headerBackground.png"));

        headerPanel.add(headerLabel);
        
        foodButton = new JButton(new ImageIcon("assets/FoodsButton.png"));
        foodButton.setSize(228, 228);
        
        /*waterButton = new JButton(new ImageIcon(getClass().getResource("../assets/WaterButton.png")));
        waterButton.setSize(228, 228);*/

        //bgFrame.getContentPane().add(waterButton);
        bgFrame.getContentPane().add(headerPanel);
        bgFrame.getContentPane().add(foodButton);
        bgFrame.setSize(500, 639);
        bgFrame.setVisible(true);

    }
                    
    public static void main(String args[]) {
        
        new MenuView();
        
    }
}
