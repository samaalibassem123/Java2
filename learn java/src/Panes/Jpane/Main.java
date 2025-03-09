package Panes.Jpane;

import javax.swing.*;
import java.awt.*;

public class Main  {
    public static void main(String[] args){
         //JPanel a GUI component that functions as a container to hold other components
        JPanel redPanel = new JPanel();
        JPanel bluePanel = new JPanel();
        JPanel greenPanel = new JPanel();

        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);
        redPanel.setLayout(new BorderLayout());

        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);

        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,250,250);

        //CREATE A JLABEL
        JLabel label = new JLabel();
        label.setText("HEllo");
        label.setForeground(Color.black);
        label.setHorizontalAlignment(JLabel.CENTER);


        //CREATE THE JFRAME
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("JPANELS");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        //ADD THE JPANEL COMPONENT
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

        //ADD A LABEL TO A PANEL
        redPanel.add(label);


    }
}
