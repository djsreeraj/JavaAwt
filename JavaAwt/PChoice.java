import java.awt.*;
import java.awt.event.*;
public class PChoice extends Frame{
	public PChoice(){
		setLayout(new FlowLayout());
		Label l = new Label("Select Language");
		Choice lang = new Choice();
		lang.add("English");
		lang.add("Malayalam");
		lang.add("Hindi");
		lang.add("Tamil");
		add(l);
		add(lang);
		setSize(600,600);
		setVisible(true);
	}

	public static void main(String args[]){
		PChoice obj = new PChoice();
		obj.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}
}