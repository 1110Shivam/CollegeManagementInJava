import java.awt.*;
import javax.swing.*;


public class FacultyDetails {
 
    JFrame fr;
    JLabel l1,l2,l3;
    JTextField t;  
    JButton b1,b2,b3;
    
    FacultyDetails(){
        
        fr = new JFrame("Faculty Details");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        fr.setSize(screenSize.width, screenSize.height);
        fr.setVisible(true);
        fr.setLayout(null);


        
        JScrollPane sp = new JScrollPane();
        sp.setBounds(20,20,1500,450);
        fr.add(sp);
        
        fr.getContentPane().setBackground(Color.WHITE);

        l1 = new JLabel("Enter employee id to delete faculty :");
        l1.setBounds(50,500,800,40);
        l1.setFont(new Font("Sans serif",Font.BOLD,30));
        fr.add(l1);
        
        t = new JTextField();
        t.setBounds(600,500,350,35);
        t.setFont(new Font("Sans serif",Font.BOLD,25));
        fr.add(t);
        
        b1 = new JButton("Delete");
        b1.setBounds(1000, 500, 150 ,35);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Sans serif",Font.BOLD,25));
        fr.add(b1);

        l2 = new JLabel("Add New Faculty");
        l2.setBounds(50,570,800,40);
        l2.setFont(new Font("Sans serif",Font.BOLD,30));
        fr.add(l2);

        b2 = new JButton("Add");
        b2.setBounds(450, 570, 150 ,35);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Sans serif",Font.BOLD,25));
        fr.add(b2);

        l3 = new JLabel("Update Faculty Details");
        l3.setBounds(50,640,800,40);
        l3.setFont(new Font("Sans serif",Font.BOLD,30));
        fr.add(l3);
            
        b3 = new JButton("Update");
        b3.setBounds(450, 640, 150 ,35);
        b3.setFont(new Font("Sans serif",Font.BOLD,25));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        fr.add(b3);
        
    }
    
    public static void main(String[] args){
        new FacultyDetails();
    }
    
}

