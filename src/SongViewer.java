package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import manager.SongManager;
import song.SongInput;

public class SongViewer extends JPanel {
	
	WindowFrame frame;
	
	SongManager songManager ;

	public SongViewer(WindowFrame frame, SongManager songManager) {
		this.frame = frame;
		this.songManager = songManager;
		
		System.out.println("***" + songManager.size() + "***");
		
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Singer");
		model.addColumn("Genre");
		
		
		for (int i = 0; i < songManager.size(); i++) {
			Vector row = new Vector();
			SongInput si = songManager.get(i);
			row.add(si.getName());
			row.add(si.getSinger());
			row.add(si.getGenre());
			model.addRow(row);
		}
		
	
		JTable tabel = new JTable(model);
		JScrollPane sp = new JScrollPane(tabel);
		
		this.add(sp);
		 
		
	}

}
