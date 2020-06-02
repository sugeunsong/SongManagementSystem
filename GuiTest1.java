package gui;

	import java.awt.BorderLayout;
	import java.awt.FlowLayout;
	import java.awt.GridLayout;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.JTextArea;

	public class GuiTest1 {

		public static void main(String[] args) {

			
			JFrame frame = new JFrame("Myframe");
			JPanel panel1 = new JPanel();
			JPanel panel2 = new JPanel();
			FlowLayout L = new FlowLayout();
			JLabel label = new JLabel();
			JLabel l1 = new JLabel("Welcome to Java pizza. Choose the type of pizza.");
			JButton b1 = new JButton("Combination Pizza");
			JButton b2 = new JButton("Potato pizza");
			JButton b3 = new JButton("Roasted meat pizza");
			JLabel l2 = new JLabel("count");
			JTextArea ta1 = new JTextArea("                                  ");
			panel1.add(l1);
			panel2.add(b1);
			panel2.add(b2);
			panel2.add(b3);
			panel2.add(l2);
			panel2.add(ta1);
			frame.add(panel1, BorderLayout.NORTH);
			frame.add(panel2, BorderLayout.CENTER);
			
			
			frame.setSize(900,200);
			frame.setVisible(true);
			


		}

	}
