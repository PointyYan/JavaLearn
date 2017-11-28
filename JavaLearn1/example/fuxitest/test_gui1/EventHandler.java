package fuxitest.test_gui1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler implements ActionListener {

    JPanel parent;
    JComponent src;
    public EventHandler( JPanel m ) {
// Establish a link to my parent
        parent = m;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
