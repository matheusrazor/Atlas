package views;

public class MenuView extends javax.swing.JFrame {
    
    java.awt.GridLayout gridButtons = new java.awt.GridLayout(2, 2, 12, 12);
    private javax.swing.JPanel headerPanel, bodyPanel;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JFrame bgFrame;
    private javax.swing.JButton foodButton;
    private javax.swing.JButton goalsButton;

    public MenuView() {

        bgFrame = new javax.swing.JFrame("Food Atlas");
        bgFrame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        bgFrame.setResizable(false);
        bgFrame.setMaximumSize(new java.awt.Dimension(516, 600));
        bgFrame.setPreferredSize(new java.awt.Dimension(516, 600));
        
        headerPanel = new javax.swing.JPanel();
        headerPanel.setSize(516, 100);
        
        headerLabel = new javax.swing.JLabel();
        headerLabel.setSize(516, 100);
        headerLabel.setMaximumSize(new java.awt.Dimension(500, 100));
        headerLabel.setIcon(new javax.swing.ImageIcon("assets/headerBackground.png"));
        
        headerPanel.add(headerLabel);
        
        bodyPanel.setLayout(gridButtons);

        foodButton = new javax.swing.JButton(new javax.swing.ImageIcon("assets/FoodsButton.png"));
        foodButton.setSize(220, 220);
        
        goalsButton = new javax.swing.JButton(new javax.swing.ImageIcon("assets/WaterButton.png"));
        goalsButton.setSize(220, 220);
        
        bodyPanel.add(foodButton);
        bodyPanel.add(goalsButton);

        bgFrame.getContentPane().add(headerPanel);
        bgFrame.getContentPane().add(bodyPanel);
        bgFrame.setVisible(true);

    }
                    
    public static void main(String args[]) {
        
        new MenuView();
        
    }
}
