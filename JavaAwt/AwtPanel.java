import java.awt.*;
public class AwtPanel extends Frame{
	Panel panel;
	Button b1,b2;
	public AwtPanel(){
		panel = new Panel();
		setTitle("AWT Panel");
		setSize(600,600);
		setLayout(new FlowLayout());
		panel.setBackground(Color.gray);
		b1 = new Button("Button1");
		b2= new Button("Button2");
		panel.add(b1);
		panel.add(b2);
		add(panel);
		setVisible(true);
	}

	public static void main(String args[]){
		 AwtPanel obj = new AwtPanel();
		obj.setSize(600,600);
		obj.setVisible(true);
	}

}