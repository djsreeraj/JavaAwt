import java.awt.*;
import java.awt.event.*;
public class CCounter extends Frame implements ActionListener{
	int count =0;
	Label l;
	TextField c;
	Button b;
	public CCounter(){
		setLayout(null);
		l = new Label("Count");
		l.setBounds(60,100,50,60);
		c = new TextField("0",10);
		c.setBounds(150,120,100,50);
		b = new Button("Inc");
		b.setBounds(150,200,100,60);
		add(l);
		add(c);
		add(b);
		c.setText(count+"");
		b.addActionListener(this);
		setSize(500,500);
		setVisible(true);
	}
		
	public static void main(String args[]){
		CCounter obj = new CCounter();
		obj.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent ev){
				System.exit(0);
			}
		});
	}

	public void actionPerformed(ActionEvent e){
		count++;
		c.setText(count+"");
	}
}