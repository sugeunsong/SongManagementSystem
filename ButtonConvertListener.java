package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class ButtonConvertListener implements ActionListener {
	JTextField field1;
	JTextField field2;

	public ButtonConvertListener(JTextField field1,JTextField field2) {
		this.field1 = field1;
		this.field2 = field2;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		int f = Integer.parseInt(field1.getText());
		double c = (f-32)/1.8;
		
		field2.setText(String.valueOf(c));
		
	

	}

}
