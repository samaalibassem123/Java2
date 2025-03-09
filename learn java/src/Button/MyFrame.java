package Button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    MyFrame(){
        //CREATE A BUTTON
        this.button = new JButton();
        button.setText("click me");
        button.setBounds(100,100, 100,50);
        button.addActionListener(this);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setFocusable(false);
        //CREATE A LABEL
        label = new JLabel();
        label.setText("hello");
        label.setBounds(250, 250, 100,100);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setForeground(Color.white);
        label.setVisible(false);
        //CREATE THE FRAME
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(500,500);
        setVisible(true);
        //ADD THE BUTTON
        getContentPane().add(button);
        getContentPane().add(label);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            System.out.println("button clicked");
            button.setEnabled(false);
            label.setVisible(true);
        }
    }
}
