import java.awt.*;
import java.awt.event.*;
public class Calculator extends Frame implements ActionListener{
	Label l,in,inp,title;
	TextField a,b,c;
	Button b1,b2,b3,b4,b5;
	int i =0;
	public Calculator(){
		setLayout(null);
			
		title = new Label("-+-/-*--    CALCULATOR    -+-/-*--");
		title .setBounds(100,40,200,30);

		in = new Label("INPUT-1:");
		in.setBounds(50,100,100,30);

		a= new TextField();
		a.setBounds(150,100,100,30);

		b = new TextField();
		b.setBounds(150,135,100,30);

		inp = new Label("INPUT-2:");
		inp.setBounds(50,135,100,30);

		l = new Label("Output:");
		l.setBounds(50,240,100,30);

		c = new TextField();
		c.setBounds(150,240,100,30);

		b1= new Button("ADD");
		b1.setBounds(100,170,100,30);

		b2= new Button("SUBTRACT");
		b2.setBounds(200,170,100,30);

		b3= new Button("MULTIPLY");
		b3.setBounds(100,195,100,30);

		b4= new Button("DIVIDE");
		b4.setBounds(200,195,100,30);

		b5= new Button("CLEAR");
		b5.setBounds(120,280,150,35);
		add(title);
		add(a);	
		add(b);	
		add(in);
		add(inp);
		add(c);	
		add(l);
		add(b1);	
		add(b2);	
		add(b3);
		add(b4);	
		add(b5);	
		b1.addActionListener(this);	
		b2.addActionListener(this);	
		b3.addActionListener(this);	
		b4.addActionListener(this);	
		b5.addActionListener(this);	
	}
	public static void main(String[] args){
		Calculator obj = new Calculator();
		obj.setSize(400,400);
		obj.setVisible(true);
		obj.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent ev){
		int n1 = Integer.parseInt(a.getText());
		int n2 = Integer.parseInt(b.getText());
		if(ev.getSource()==b1){
			c.setText(String.valueOf(n1+n2));
		}

		if(ev.getSource()==b2){
			c.setText(String.valueOf(n1-n2));
		}
		if(ev.getSource()==b3){
			c.setText(String.valueOf(n1*n2));
		}
		if(ev.getSource()==b4){
			c.setText(String.valueOf(n1/n2));
		}
		if(ev.getSource()==b5){
			a.setText("");
			b.setText("");
			c.setText("");			
		}
	}
}

	

