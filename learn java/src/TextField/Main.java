package TextField;

import javax.print.DocFlavor;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("TextField");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(new Dimension(500, 500));


        //ADD A TEXT INPUT
        JTextField input = new JTextField();
        input.setOpaque(true);
        input.setBounds(0,0,150,30);
        frame.add(input);





        frame.setVisible(true);


    }
}
