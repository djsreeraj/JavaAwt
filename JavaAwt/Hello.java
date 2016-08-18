import java.awt.*;
public class Hello extends Frame{
	Label l;
	TextField a;
	Button b;
	public Hello(){
		setLayout(null);
		l=new Label("Enter name:");
		l.setBounds(80,100,100,30);
		a=new TextField();
		b=new Button("Click Here");
		a.setBounds(180,100,100,30);
		b.setBounds(300,100,100,30);
		add(l);
		add(a);
		add(b);
		
	}

	public static void main(String args[]){

		Hello obj = new Hello();
		obj.setSize(600,600);
		obj.setVisible(true);
	
	}
}