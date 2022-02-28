import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NewStudent{
    JFrame fr;
    JLabel l1,l2;

    NewStudent(){
        fr = new JFrame("New Student");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();   
		fr.setSize(screenSize.width, screenSize.height);                      
		fr.setLayout(null);                                                     
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         
        
        l1=new JLabel(new ImageIcon("Img\\Student Background.png"));          
		l1.setSize(screenSize.width,screenSize.height);                       
        
        l2 = new JLabel("New Student Details");
        l2.setBounds(700,80,800,100);
        l2.setFont(new Font("Sans Serif",Font.ITALIC,65));
        l2.setForeground(Color.white);
        l1.add(l2);
        
        
        
		fr.add(l1);                                                                         
    }
    public static void main(String[] args) {
        new NewStudent();
    }
}