import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class SwingPgm extends JFrame {
	JLabel label1;
	//JButton b1,b2;
	public SwingPgm(){
		setLayout(new FlowLayout());
		label1 = new JLabel("Enter the string:");
		add(label1);
		setVisible(true);
		JButton btn1 = new JButton("ALPHA");
		JButton btn2 = new JButton("BETA");
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				label1.setText("You Pressed ALPHA");
			}
		});
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent  ae){
				label1.setText("You Pressed BETA");
			}
		});

		add(btn1);
		add(btn2);
	}

	public static void main(String[] args){
		SwingPgm obj = new SwingPgm();
		obj.setSize(600,600);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
		