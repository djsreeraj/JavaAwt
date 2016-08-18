import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class SwingLogin extends JFrame implements ActionListener{
	JButton btn1;
	JPanel panel1;
	JLabel label1,label2;
	JTextField text1,text2;
	
	public SwingLogin(){
		label1 = new JLabel("Username");
		label2 = new JLabel("Password");
		text1 = new JTextField(15);
		text2 = new JPasswordField(15);
		btn1 = new JButton("SUBMIT");
		panel1 = new JPanel(new GridLayout(3,1));
		panel1.add(label1);
		panel1.add(label2);
		panel1.add(text1);
		panel1.add(text2);
		panel1.add(btn1);
		add(panel1,BorderLayout.CENTER);
		btn1.addActionListener(this);
		setTitle("Login");
	}
	public void actionPerformed(ActionEvent ae){
		String value1 = text1.getText();
		String value2 = text2.getText();
		if(value1.equals("sreeraj") && value2.equals("12345")){
			NextPage page = new NextPage();
			page.setVisible(true);
			JLabel label3 = new JLabel("Welcome:"+value1);
			page.getContentPane().add(label3);
		}
		else{
			System.out.println("Enter valid username & Password");
			text1.setText("");
			text2.setText("");
			JOptionPane.showMessageDialog(this,"Incorrect Login","error",JOptionPane.ERROR_MESSAGE);
		}
	}
	public static void main(String[] args){
		try{
			SwingLogin obj = new SwingLogin();
			obj.setSize(500,500);
			obj.setVisible(true);
			obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null,"ERROR");
		}
	}
}
		
				