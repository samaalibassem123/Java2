package Radiobut;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioFrame extends JFrame implements ActionListener {
    JRadioButton femme;
    JRadioButton homme;

    public RadioFrame() {
        this.setTitle("RadioButtons");
        this.setLayout(new FlowLayout());

        femme = new JRadioButton("femme");
        homme = new JRadioButton("homme");

        femme.addActionListener(this);
        homme.addActionListener(this);

        ButtonGroup group = new ButtonGroup();
        group.add(femme);
        group.add(homme);

        this.add(femme);
        this.add(homme);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == femme){
            System.out.println("femme selected");
        }else if(e.getSource() == homme){
            System.out.println("Homem selected");
        }
    }
}
