package Open_new_window;

import javax.swing.*;

public class NewWindow extends JFrame {
    JLabel label ;
    public NewWindow() {
        //CREATE A WINDOW
        label = new JLabel("hello");
        label.setOpaque(true);

        //SET THE FRAME
        setSize(200,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("NEW Window");
        getContentPane().add(label);
        setVisible(true);
    }
}
