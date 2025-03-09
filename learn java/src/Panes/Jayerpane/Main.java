package Panes.Jayerpane;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        //JlayerPane  = swing container that provides a
        // third Dimenssion for positioning components
        // ex. depth; Z-index


        //Create the frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("JlayerPane");
        frame.setLayout(null);
        frame.setSize(600,500);



        //CREATE A LAYERPANE
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);
        layeredPane.setBackground(Color.BLACK);
        layeredPane.setOpaque(true);

        //ADD THE LAYER PANE TO THE FRAME
        frame.add(layeredPane);

        //CREATE PANES
        JPanel panel1 = new JPanel();
        panel1.setBounds(50,50,100,100);
        panel1.setBackground(Color.RED);
        panel1.setOpaque(true);

        JPanel panel2 = new JPanel();
        panel2.setBounds(75,75,100,100);
        panel2.setBackground(Color.yellow);
        panel2.setOpaque(true);

        JPanel panel3 = new JPanel();
        panel3.setBounds(125,125,100,100);
        panel3.setBackground(Color.blue);
        panel3.setOpaque(true);

        //ADD PANELS TO THE LAYERPANEL
        layeredPane.add(panel1, Integer.valueOf(0)); // Lyaer number = 0
        layeredPane.add(panel2, Integer.valueOf(2));// Lyaer number = 2
        layeredPane.add(panel3, Integer.valueOf(1));// Lyaer number = 1


        frame.setVisible(true);
    }
}
