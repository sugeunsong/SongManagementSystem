package first;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {

	
	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel panel = new MyPanel();
		this.add(panel);
//		this.addMouseListener(new MyMouseAdapter(panel));
		this.addKeyListener(new MyKeyAdapter(panel));
		setSize(500, 500);	
		setVisible(true);
	}
	
}

