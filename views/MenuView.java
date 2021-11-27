package views;

import javax.swing.*;
import java.awt.*;

public class MenuView extends JFrame {
    
    GridLayout gridButtons = new GridLayout(2, 2, 12, 12);
    private JLabel bgLabel;
    private JFrame bgFrame;
    private JButton foodButton;
    private JButton waterButton;

    public MenuView() {

        bgFrame = new JFrame("Food Atlas");
        bgFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bgFrame.setResizable(false);
        bgFrame.setLayout(gridButtons);
        
        bgLabel = new JLabel();
        bgLabel.setIcon(new ImageIcon(getClass().getResource("../assets/Background.png")));
        
        foodButton = new JButton(new ImageIcon(getClass().getResource("../assets/FoodsButton.png")));
        foodButton.setSize(228, 228);
        
        /*waterButton = new JButton(new ImageIcon(getClass().getResource("../assets/WaterButton.png")));
        waterButton.setSize(228, 228);*/

        bgFrame.getContentPane().add(foodButton);
        //bgFrame.getContentPane().add(waterButton);
        bgFrame.getContentPane().add(bgLabel);
        bgFrame.setSize(500, 639);
        bgFrame.setVisible(true);

    }
                    
    public static void main(String args[]) {
        
        new MenuView();
        
    }
}
