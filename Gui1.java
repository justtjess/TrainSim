import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui1 {
public static void main (String[] args){
	JFrame frame = new JFrame();
	ImagePanel panel = new ImagePanel("train.jpg");
	panel.setPreferredSize(new Dimension(400, 400));
	JButton start = new JButton("START");
	panel.add(start);
	frame.getContentPane().add(panel, BorderLayout.CENTER);
	frame.setSize(400,400);
	
	// frame.getContentPane().add(start);
	start.setFont(new Font( "Arial", Font.BOLD, 18));
	start.setVisible(true);
	start.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae) {
				// frame.setVisible(false);
// 				new SecondFrame();
			start.setVisible(false);
			}
	});
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
}
}

	
