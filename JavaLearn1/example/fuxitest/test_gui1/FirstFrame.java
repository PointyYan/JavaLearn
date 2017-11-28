package fuxitest.test_gui1;

import javax.swing.*;

public class FirstFrame extends JFrame {

    public FirstFrame() {
        setTitle("FirstFrame");
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new FirstFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
