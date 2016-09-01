import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CardLayoutFrame extends JFrame implements ActionListener
{  
   
    JButton b1,b2;
    CardLayout ly;
    Container c;
    public CardLayoutFrame()
    {  
        c=getContentPane();
        ly=new CardLayout(40,30);
        c.setLayout(ly);
        b1=new JButton("LENOVO");
        b2=new JButton("MOTOROLA");
        b1.addActionListener(this);
        b2.addActionListener(this);
        c.add("a",b1);
        c.add("b",b2);
    }      
    public void actionPerformed(ActionEvent e)
    {   ly.next(c);
    }
    public static void main(String[] arg)
    {   try{
        CardLayoutFrame obj=new CardLayoutFrame();
        obj.setSize(600,600);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        catch(Exception e)
        {}
    }
}