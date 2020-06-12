package first;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyKeyAdapter extends KeyAdapter {
	MyPanel panel;

	public MyKeyAdapter(MyPanel panel) {
		this.panel = panel;
	}
	
//	@Override
//	public void keyPressed(KeyEvent e) {
//		int keyCode = e.getKeyCode();
//		switch(keyCode) {
//		case KeyEvent.VK_UP:
//		    panel.setLocation(panel.getX(), panel.getY() -10);
//		    break;
//		case KeyEvent.VK_DOWN:
//			panel.setLocation(panel.getX(), panel.getY() +10);
//		    break;
//		case KeyEvent.VK_LEFT:
//			panel.setLocation(panel.getX() -10, panel.getY());
//		    break;
//		case KeyEvent.VK_RIGHT:
//			panel.setLocation(panel.getX() +10, panel.getY());
//		    break;
//		}
//	}
	
	
	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		switch(keyCode) {
		case KeyEvent.VK_UP:
		    panel.y -=30;
		    panel.repaint();
		    break;
		case KeyEvent.VK_DOWN:
			panel.y +=30;
		    panel.repaint();
		    break;
		case KeyEvent.VK_LEFT:
			panel.x -=30;
		    panel.repaint();
		    break;
		case KeyEvent.VK_RIGHT:
			panel.x +=30;
		    panel.repaint();
		    break;
		}
	}


}