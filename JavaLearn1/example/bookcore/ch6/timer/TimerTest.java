package bookcore.ch6.timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Timer;

public class TimerTest {
    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();

//        Timer timer = new Timer(10000, listener);
        javax.swing.Timer timer = new javax.swing.Timer(10000, listener);
        timer.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }

    static class TimePrinter implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("At the tone , the time is " + new Date());
            //beep() 发出一声铃响
            Toolkit.getDefaultToolkit().beep();
        }
    }


}
