package fuxitest.test_gui1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonTest extends JFrame {

    private ButtonTest() {
        setTitle("Button Test");
        JButton helloButton = new JButton("Hello");
        add(helloButton);
        ButtonHandler handler = new ButtonHandler();
        helloButton.addActionListener(handler);
        setSize(300, 200);
        setVisible(true);
    }

    private class ButtonHandler implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            JOptionPane.showMessageDialog( null, "You pressed: " + e.getActionCommand() );
        }


    }
    public static void main(String[] args) {
        ButtonTest t = new ButtonTest();
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
