package first;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class MyMouseAdapter extends MouseAdapter {
	MyPanel panel;

	public MyMouseAdapter(MyPanel panel) {
		this.panel = panel;
	}

	public void mouseClicked(MouseEvent e) {	
		panel.x = e.getX();
		panel.y = e.getY();
		panel.repaint();	
	}
}
