import java.awt.*;
import java.awt.event.*;
public class First extends Frame implements ActionListener{

	TextField c;
	Button b;
	public First(){
		c = new TextField();
		setLayout(null);
		c.setBounds(60,50,170,20);
		b=new Button("ClickHere");
		b.setBounds(100,120,80,30);
		add(c);
		add(b);
		b.addActionListener(this);
		setSize(300,300);
		setVisible(true);
		
	}

	public void actionPerformed(ActionEvent ae){
		c.setText("Welcome");
	}
	public static void main(String[] args){
		First obj = new First();
		obj.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}
}
