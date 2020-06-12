package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import manager.SongManager;

public class WindowFrame extends JFrame {
	
	SongManager songManager ;
	
	MenuSelection menuselection ;
	SongAdder songadder ;
	SongViewer songviewer ;

	
	
	public WindowFrame(SongManager songManager) {
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.songManager = songManager;	
		menuselection = new MenuSelection(this);
		songadder = new SongAdder(this);
		songviewer = new SongViewer(this, this.songManager);

		
		this.add(menuselection);	
				
		this.setVisible(true);
	}
	 
	public void setupPanel(JPanel panel) { 
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
		
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public SongAdder getSongadder() {
		return songadder;
	}

	public void setSongadder(SongAdder songadder) {
		this.songadder = songadder;
	}

	public SongViewer getSongviewer() {
		return songviewer;
	}

	public void setSongviewer(SongViewer songviewer) {
		this.songviewer = songviewer;
	}

}
