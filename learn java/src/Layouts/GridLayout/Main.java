package Layouts.GridLayout;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static  void main(String[] args){
        //CREATE THE FRAME
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GridLayout");
        frame.setSize(600,500);
        // SET THE FRAME LAYOUT
        frame.setLayout(new GridLayout(2,3));

        //ADD BUTTONS
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));

        frame.setVisible(true);
    }
}
