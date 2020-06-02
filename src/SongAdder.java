package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class SongAdder extends JFrame {
	

	public SongAdder( ) {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelName  = new JLabel("Name:", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelSinger  = new JLabel("Singer:", JLabel.TRAILING);
		JTextField fieldSinger = new JTextField(10);
		labelName.setLabelFor(fieldSinger);
		panel.add(labelSinger);
		panel.add(fieldSinger);
		
		JLabel labelGenre  = new JLabel("Genre:", JLabel.TRAILING);
		JTextField fieldGenre = new JTextField(10);
		labelName.setLabelFor(fieldGenre);
		panel.add(labelGenre);
		panel.add(fieldGenre); 

		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		
		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(panel);
		this.setContentPane(panel);
		this.setVisible(true);
		
		
		
		
		
		
		
	}

	private void setDefaultCloseOperation(JPanel panel) {
		// TODO Auto-generated method stub
		
	}
	

}
