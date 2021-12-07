package views;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class FoodsView {

    private JFrame frame;
    private JPanel panel;
    private JButton addButton;
    private JButton cancelButton;

    public FoodsView() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Foods");
        
        addButton = new JButton("Add");
        cancelButton = new JButton("Cancel");
        
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel.setLayout(new GridLayout(2, 2));
        panel.add(addButton);
        panel.add(cancelButton);

        frame.add(panel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new FoodsView();
    }

}
