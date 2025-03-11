package Vue.Components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JButton implements ActionListener{
    public Button(String text) {
        super(text);
        this.setForeground(Color.RED);
        this.setBackground(Color.gray);
        this.setOpaque(true);
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String But_name = this.getText();
        if (But_name == "Ajouter"){
            System.out.println("Ajouter");
        }else if(But_name == "Recherche"){
            System.out.println("Recherche");
        } else if (But_name == "Modifyer") {
            System.out.println("modif");
        }else if (But_name == "Delete") {
            System.out.println("delte");
        }

    }
}
