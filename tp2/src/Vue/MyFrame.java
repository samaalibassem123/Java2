package Vue;

import Vue.Components.Button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame{



    public MyFrame(){
        //SET THE FRAME
        this.setSize(500,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));



        //ADD BUTTONS
        JButton Add_but = new Button("Ajouter");
        JButton Find_but = new Button("Recherche");;
        JButton Modify_but = new Button("Modifyer");;
        JButton Delete_but = new Button("Delete");;

        this.add(Add_but);
        this.add(Find_but);
        this.add(Modify_but);
        this.add(Delete_but);

        this.pack();
        setVisible(true);
    }

}



