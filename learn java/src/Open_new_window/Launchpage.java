package Open_new_window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Launchpage extends JFrame implements ActionListener {
    private JButton button;
    public Launchpage(){
        //CREATE A BUTTON
        button = new JButton("new window");
        button.setBounds(100,160,200,40);
        button.addActionListener(this);

        //SET THE FRAME
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("HOME");
        setSize(420,420);
        setLayout(null);
        //add the button
        getContentPane().add(button);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            dispose();
            NewWindow window = new NewWindow();
        }
    }
}
