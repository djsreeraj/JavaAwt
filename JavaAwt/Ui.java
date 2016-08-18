import java.awt.*;
public class Hello extends Frame{
	Label l;
	TextField c;
	Button b;
	Hello(){
		setLayout(null);
		l=new Label("Enter name:");
		l.setBounds(180,100,100,100);
		add(l);
		add(c);
		add(b);
		setSize(600,60);
		setVisible(true);
	}
}

class Ui{
	public static void main(String args[]){

		Hello obj = new Hello();
	
	}
}