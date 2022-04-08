import javax.swing.*;
import java.awt.*;

public class NewFaculty{
    JFrame fr;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;

    NewFaculty(){
        fr = new JFrame("New Faculty");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        fr.setSize(screenSize.width,screenSize.height);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel l=new JLabel(new ImageIcon("Img\\W.jpg"));           
        l.setSize(screenSize.width,screenSize.height);                        
        // fr.add(l);               
        l1 = new JLabel("New Faculty Details");
        l1.setBounds(800,50,500,50);
        l1.setFont(new Font("serif",Font.ITALIC,40));
        l1.setForeground(Color.white);
        l.add(l1);

        l2 = new JLabel("Faculty Name");
        l2.setBounds(250,200,300,35);
        l2.setFont(new Font("serif",Font.BOLD,25));
        l2.setForeground(Color.WHITE);
        l.add(l2);

        t1 = new JTextField();
        t1.setBounds(550,200,330,35);
        t1.setForeground(Color.BLACK);
        t1.setFont(new Font("Sans Serif",Font.BOLD,25));
        l.add(t1);

        l3 = new JLabel("Father's Name");
        l3.setBounds(1050,200,200,35);
        l3.setFont(new Font("serif",Font.BOLD,25));
        l3.setForeground(Color.white);
        l.add(l3);

        t2 = new JTextField();
        t2.setBounds(1270,200,330,35);
        t2.setForeground(Color.BLACK);
        t2.setFont(new Font("Sans Serif",Font.BOLD,25));
        l.add(t2);

        
        l4 = new JLabel("DOB (dd/mm/yyyy)");
        l4.setBounds(250,300,300,35);
        l4.setFont(new Font("serif",Font.BOLD,25));
        l4.setForeground(Color.white);
        l.add(l4);

        t3 = new JTextField();
        t3.setBounds(550,300,330,35);
        t3.setForeground(Color.BLACK);
        t3.setFont(new Font("Sans Serif",Font.BOLD,25));
        l.add(t3);

        l5 = new JLabel("Address");
        l5.setBounds(1050,300,200,35);
        l5.setFont(new Font("serif",Font.BOLD,25));
        l5.setForeground(Color.white);
        l.add(l5);

        t4 = new JTextField();
        t4.setBounds(1270,300,330,35);
        t4.setForeground(Color.BLACK);
        t4.setFont(new Font("Sans Serif",Font.BOLD,25));
        l.add(t4);

        fr.add(l);
    }
    public static void main(String[] args){
        new NewFaculty();
    }
}