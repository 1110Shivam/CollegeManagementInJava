import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NewFaculty{
    JFrame fr;
    JLabel l1;

    NewFaculty(){
        fr = new JFrame("New Faculty");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();    
		fr.setSize(screenSize.width, screenSize.height);                       
		fr.setLayout(null);                                                     
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         
        
        l1=new JLabel(new ImageIcon("Img\\Teacher Background.png"));           
		l1.setSize(screenSize.width,screenSize.height);                        
		fr.add(l1);                                                                         

    }
    public static void main(String[] args) {
        new NewFaculty();
    }
}