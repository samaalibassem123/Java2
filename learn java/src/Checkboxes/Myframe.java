package Checkboxes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Myframe extends JFrame implements ActionListener {
    JCheckBox checkBox;
    JButton but;
    public Myframe()  {
        this.setTitle("Checkbox");
        this.setLayout(new FlowLayout());
        this.setSize(500,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Button
        but = new JButton("submit");
        but.addActionListener(this);

        //CHECKBOX
        checkBox = new JCheckBox("check me ");
        checkBox.setFocusable(false);

        this.add(checkBox);
        this.add(but);

        //bech trod el taille ta3 el fenetre 3la 9ad les elements eli mawjoudin
        this.pack();


        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == but){
            System.out.println(checkBox.isSelected());
        }
    }
}
