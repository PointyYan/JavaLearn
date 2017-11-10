import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.io.*;
import javax.imageio.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;

public class TestBufferedImage2 extends Canvas {

	static int i = 0;
	File[] file;
	JLabel lab;
	JButton lb;
	JButton rb;
	MyCanvas mc;
	Timer timer;	

	public TestBufferedImage2() {
		file = new File[10];
		JFrame f = new JFrame();
		lab = new JLabel();
		lb = new JButton("<<");
		rb = new JButton(">>");
		mc = new MyCanvas();
		timer = new Timer(true);

		rb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eve) {
				if (++i >= 10)
					i = 0;
				handler(i);
			}
		});
		lb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eve) {
				if (--i < 0)
					i = 9;
				handler(i);
			}
		});
		mc.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent eve) {
				if (eve.getX() > 250)
					if (++i >= 10)
						i = 0;
				if (eve.getX() < 150)
					if (--i < 0)
						i = 9;
				handler(i);
			}

			public void mouseEntered(MouseEvent eve) {
				timer.cancel();
				timer = null;
			}

			public void mouseExited(MouseEvent eve) {
				if (timer == null) {
					timer = new Timer(true);
					timer.schedule(new MyTask(), new Date(), 2000);
				}
			}
		});
		f.setLayout(new BorderLayout());
		lab.setText(String.valueOf(i + 1));
		f.add(BorderLayout.NORTH, lab);
		f.add(BorderLayout.WEST, lb);
		f.add(BorderLayout.EAST, rb);
		f.add(BorderLayout.CENTER, mc);
		try {
			for (; i < 10; i++)
				file[i] = new File("./src/pic/" + (i+1) + ".jpg");
			BufferedImage bi = ImageIO.read(file[0]);
			mc.setImage(bi);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mc.repaint();
		if (timer != null)
			timer.schedule(new MyTask(), new Date(), 2000);
		f.setSize(400, 550);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

	void handler(int i) {
		lab.setText(String.valueOf(i + 1));
		try {
			if (i >= 0 && i < 10 && file[i] != null) {
				BufferedImage bi = ImageIO.read(file[i]);
				mc.setImage(bi);
				mc.repaint();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	class MyTask extends TimerTask {
		public void run() {
			if (++i >= 10)
				i = 0;
			handler(i);
		}
	}

	public static void main(String[] args) {
		new TestBufferedImage2();
	}
}

class MyCanvas extends Canvas {
	private BufferedImage bi;
	private Image im;
	private int image_width;
	private int image_height;

	public void setImage(BufferedImage bi) {
		this.bi = bi;
		this.zoom();
	}

	public void paint(Graphics g) {
		g.drawImage(im, 0, 0, this.getWidth(), this.getHeight(), this);
	}

	public void zoom() {
		image_width = bi.getWidth();
		image_height = bi.getHeight();
		im = bi.getScaledInstance(image_width, image_height, Image.SCALE_SMOOTH);
	}
}