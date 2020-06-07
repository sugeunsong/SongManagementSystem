package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SongViewer extends JPanel {
	
	WindowFrame frame;

	public SongViewer(WindowFrame frame) {
		this.frame = frame;
		
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Singer");
		model.addColumn("Genre");
		model.addColumn("Contact Info");
		
		
		JTable tabel = new JTable(model);
		JScrollPane sp = new JScrollPane(tabel);
		
		this.add(sp);
		 
		
	}

}
