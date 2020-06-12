package first;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	public int x = 20;
	public int y = 20;
	
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(x, y, 20, 20);
	}
}
	


	

