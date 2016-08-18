import java.awt.*;
import java.awt.event.*;
public class CheckBox extends Frame{
	Label m;
	Panel p;
	public CheckBox(){
		//setSize(300,300);
		setLayout(new GridLayout(3,1));
		m = new Label("Fruit:");
		m.setAlignment(Label.CENTER);
		p =new Panel();
		p.setLayout(new FlowLayout());
		add(m);
		add(p);
		setSize(600,600);
		setVisible(true);  
	}

	public static void main(String args[]){
		CheckBox obj = new CheckBox();
		obj.showDemo();

	}

	public void showDemo(){
		CheckboxGroup fruit = new CheckboxGroup();
		Checkbox Apple = new Checkbox("Apple");
		Checkbox Orange = new Checkbox("Orange ");
		Checkbox Mango = new Checkbox("Mango");
		//m.setText("Apple is checked");

		p.add(Apple);
		p.add(Orange);
		p.add(Mango);


	}


			
}