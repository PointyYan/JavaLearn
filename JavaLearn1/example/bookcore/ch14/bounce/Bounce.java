package bookcore.ch14.bounce;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Bounce {

    public static void main(String[] args) {
        EventQueue.invokeLater(() ->{
            JFrame frame = new BounceFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }

}

class BounceFrame extends JFrame{
    private BallComponent comp;
    public static final int STEPS = 1000;
    public static final int DELAY = 30;

    public BounceFrame() {
        setTitle("Bounce");
        comp = new BallComponent();
        add(comp, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        addButton(buttonPanel, "Start", e -> addBall());
        addButton(buttonPanel, "Close", e -> System.exit(0));
        add(buttonPanel, BorderLayout.SOUTH);
        pack();
    }

    private void addButton(Container c, String title, ActionListener listener) {
        JButton button = new JButton((title));
        c.add(button);
        button.addActionListener(listener);
    }

    public void addBall() {
        try {
            Ball ball = new Ball();
            comp.add(ball);

            for (int i = 0; i <= STEPS ; i++) {
                ball.move(comp.getBounds());
                comp.paint(comp.getGraphics());
                Thread.sleep(DELAY);
            }
        } catch (InterruptedException ignored) {

        }
    }
}
