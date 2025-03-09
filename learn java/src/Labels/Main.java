package Labels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class Main extends JFrame{
    public static void main(String[] args){
        JFrame f = new JFrame();
        JLabel label = new JLabel();

        try{
            ImageIcon img = new ImageIcon("Labels/logo.png");
            label.setText("hyyy");
            label.setIcon(img);
            label.setBackground(Color.black);
            label.setOpaque(true);// TO DISPLAY THE BACKGROUND
            label.setForeground(Color.RED);
            // SET BORDER
            Border border = BorderFactory.createLineBorder(Color.green, 3);
            label.setBorder(border);
            //SET THE TEXT IN THE CENTER
            label.setHorizontalAlignment(JLabel.CENTER);
            //SET THE POSTION OF THE LABEL
            label.setBounds(0,0,250,250);
        }catch (Exception e){
            System.out.printf(e.getMessage());
        }

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("hh");
        f.setSize(600,400);//add the label to the window

        f.setVisible(true);f.getContentPane().add(label);



    }
}

