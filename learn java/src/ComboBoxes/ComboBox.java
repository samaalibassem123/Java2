package ComboBoxes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox extends JFrame implements ActionListener {
    JComboBox comboBox;
    public ComboBox()  {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("ComboBoX");
        this.setLayout(new FlowLayout());

        //COMBOBOX
        String[] animals = {"dog", "cat", "ch1o1o"};
        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);
        this.add(comboBox);


        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox){
            System.out.println(comboBox.getSelectedItem());
        }
    }
}
