package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SongViewer extends JFrame {

	public SongViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Singer");
		model.addColumn("Genre");
		model.addColumn("Contact Info");
		
		
		JTable tabel = new JTable(model);
		JScrollPane sp = new JScrollPane(tabel);
		
		this.add(sp);
		
		this.setSize(300, 300); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		this.setVisible(true);
		 
		
	}

}
