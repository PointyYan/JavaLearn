package fuxitest.test_gui1;

import javax.swing.*;

public class LableTest extends JFrame {
    public LableTest() {
        setTitle("Label Test");
        JLabel helloLabel = new JLabel("Hello");
        add( helloLabel);
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        LableTest t = new LableTest();
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
