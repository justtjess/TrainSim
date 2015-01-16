import javax.swing.*;

public class Gui1{
	public static void main (String[] args){
		JFrame frame = new JFrame();
		JButton start = new JButton("START");

		frame.setSize(400,400);
		frame.setVisible(true);
		frame.getContentPane().add(start);
		start.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}