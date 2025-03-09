package BorderLayout;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Myframe extends JFrame{
    // Layout Manager = Defines the naturel layout for components within a container
    // 3 common managers
    // BorderLayout = A BorderLaout places components in five areas : NORTH , SOUTH , WEST , EAST, CENTER, ALL extra space is placed in the center area
    public Myframe() {
        //CREATE THE FRAME
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("BorderLayout");
        setSize(600,500);
        setLayout(new BorderLayout(10,10));
        setVisible(true);
        //CREATE PANNELS
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.RED);
        panel1.setOpaque(true);
        panel1.setPreferredSize(new Dimension(100,100));

        panel2.setBackground(Color.GREEN);
        panel2.setOpaque(true);
        panel2.setPreferredSize(new Dimension(100,100));


        panel3.setBackground(Color.gray);
        panel3.setOpaque(true);
        panel3.setPreferredSize(new Dimension(100,100));


        panel4.setBackground(Color.blue);
        panel4.setOpaque(true);
        panel4.setPreferredSize(new Dimension(100,100));


        panel5.setBackground(Color.yellow);
        panel5.setOpaque(true);


        //ADD THE PANELS
        getContentPane().add(panel1, BorderLayout.NORTH);
        getContentPane().add(panel2, BorderLayout.WEST);
        getContentPane().add(panel3, BorderLayout.EAST);
        getContentPane().add(panel4, BorderLayout.SOUTH);
        getContentPane().add(panel5, BorderLayout.CENTER);

    }
}
