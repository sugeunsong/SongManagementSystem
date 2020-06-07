package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import listeners.ButtonAddListener;

public class ConverterUI extends JFrame {
	
	public static void main(String[] args) {

		
		JFrame frame = new JFrame("Myframe");
		JPanel panel1 = new JPanel();
		JLabel l1 = new JLabel("Fahrenheit temperature:");
		JTextField field1 = new JTextField(15);
		JLabel l2 = new JLabel("Celsius temperature:");
		JTextField field2 = new JTextField(15);
		JButton b1 = new JButton("Convert");
		b1.addActionListener(new ButtonConvertListener(field1, field2));
			
		panel1.add(l1);
		panel1.add(field1);
		panel1.add(l2);
		panel1.add(field2);
		panel1.add(b1);
		frame.add(panel1, BorderLayout.NORTH);

		
		frame.setContentPane(panel1);
		frame.setSize(350,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
		

	

}
