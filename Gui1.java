import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.image.BufferedImage;


public class Gui1 {
	public static void main (String[] args){
		JFrame frame = new JFrame();
		ImagePanel panel = new ImagePanel("train.jpg");
		panel.setPreferredSize(new Dimension(800, 600));
		JButton start = new JButton("START");

		Graphics g;
		BufferedImage image;
		Animals animals;

		panel.add(start);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		frame.setSize(800,600);
	
		// frame.getContentPane().add(start);
		start.setFont(new Font( "Arial", Font.BOLD, 18));
		start.setVisible(true);
		start.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae) {
					//frame.setVisible(false);
	 				//new SecondFrame();
					start.setVisible(false);
				 	//start.dispose();
					frame.remove(panel);
					ImagePanel panel2 = new ImagePanel("bg.jpg");
					panel2.setPreferredSize(new Dimension(800, 600));
					frame.getContentPane().add(panel2, BorderLayout.CENTER);

					image = Image.load("test_animals(birds).png");
					animals = new Animals(image);
					g.drawImage(animals.image(0,0,32,32),5,5,null);

				}
		});
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

	
