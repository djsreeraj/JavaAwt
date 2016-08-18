import java.awt.*;
import java.awt.event.*;
public class TxtArea extends Frame implements TextListener{
	TextArea enter,display;
	public TxtArea(){
		enter =new TextArea(2,5);
		display=new TextArea(2,5);
		enter.addTextListener(this);
		display.addTextListener(this);
		add(enter, BorderLayout.NORTH);
		add(display,BorderLayout.SOUTH);
		setSize(300,300);
		setVisible(true);
	}
	public void textValueChanged(TextEvent e){
		String str = enter.getText();
		display.setText(str);
	}

	public static void main(String args[]){
		TxtArea obj = new TxtArea();

		obj.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}



}