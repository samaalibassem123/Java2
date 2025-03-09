package Vue.Components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JButton implements ActionListener{
    public Button(String text) {
        super(text);
        this.setBackground(Color.getHSBColor(207, 100, 50));
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String But_name = this.getText();
        if (e.getSource() == this){
            System.out.println(this.getText());
        }

    }
}
