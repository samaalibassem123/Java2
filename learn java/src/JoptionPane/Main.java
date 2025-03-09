package JoptionPane;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        //JOptionPane.showMessageDialog(parentComponent, message, title, messageType);

        JOptionPane.showMessageDialog(null,"test", "TEST HEyy", JOptionPane.PLAIN_MESSAGE );
        JOptionPane.showMessageDialog(null,"test", "Information Message", JOptionPane.INFORMATION_MESSAGE );
        JOptionPane.showMessageDialog(null,"test", "Question Message", JOptionPane.QUESTION_MESSAGE );
        JOptionPane.showMessageDialog(null,"test", "Warning Message", JOptionPane.WARNING_MESSAGE );
        JOptionPane.showMessageDialog(null,"test", "Error Message", JOptionPane.ERROR_MESSAGE );


        //YES RETURN 0 CANCEL RETURN 1/2 AND NO RETURN -1 / 1
        System.out.println(JOptionPane.showConfirmDialog(null, "How are u", "Howw u doing", JOptionPane.YES_NO_CANCEL_OPTION));

        String name = JOptionPane.showInputDialog("How are u");
        System.out.println(name);

    }
}
