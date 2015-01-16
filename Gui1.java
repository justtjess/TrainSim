import javax.swing;

public class Gui1{
	public static void main (String[] args){
		Jframe frame = new Jframe();
		JButton start = new JButton("START");

		frame.setSize(400,400);
		frame.setVisible(true);
		frame.getContentPane().add(start);
	}
}