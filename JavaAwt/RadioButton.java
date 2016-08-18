import java.awt.*;
import java.awt.event.*;
public class RadioButton extends Frame{
	Label m;
	Panel p;
	public RadioButton(){
		setSize(300,300);
		setLayout(new GridLayout(3,1));
		m = new Label();
		m.setAlignment(Label.CENTER);
		p =new Panel();
		p.setLayout(new FlowLayout());
		add(m);
		add(p);
	}

	public static void main(String args[]){
		RadioButton obj = new RadioButton();
		obj.showDemo();
		obj.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}

	public void showDemo(){
		CheckboxGroup fruit = new CheckboxGroup();
		Checkbox Apple = new Checkbox("Apple",fruit,true);
		Checkbox Orange = new Checkbox("Orange ",fruit,false);
		Checkbox Mango = new Checkbox("Mango",fruit,false);
		m.setText("Apple is checked");
		
		Apple.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				m.setText("Apple is checked");
			}
		 });

		Orange.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				m.setText("Orange is checked");
			} 
		});
	
		Mango.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				m.setText("Mango is checked");
			}
		 });
		p.add(Apple);
		p.add(Orange);
		p.add(Mango);
		setVisible(true);  
			
	}		
}