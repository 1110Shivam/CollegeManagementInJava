import javax.swing.*;
import java.awt.*;

public class StudentAttendence {
    JFrame fr;
    JLabel l1,l2,l3,l4;
    Choice c1,c2,c3;
    
    
    StudentAttendence(){
        fr = new JFrame("Student Attendence");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        fr.setSize(screenSize.width, screenSize.height);
        fr.setVisible(true);
        fr.setLayout(null);

        l1 = new JLabel("Student Attendence");
        l1.setBounds(800,50,500,50);
        l1.setFont(new Font("serif",Font.BOLD,50));
        fr.add(l1);

        l2 = new JLabel("Select Roll Number");
        l2.setBounds(600,200,400,50);
        l2.setFont(new Font("Sans serif",Font.BOLD,30));
        fr.add(l2);

        
        c1 = new Choice();
        c1.setBounds(1000,200,400,50);
        c1.setFont(new Font("Sans Serif",Font.BOLD,30));
        fr.add(c1);

        l3 = new JLabel("First Half");
        l3.setBounds(600,300,400,50);
        l3.setFont(new Font("Sans serif",Font.BOLD,30));
        fr.add(l3);

        
        c2 = new Choice();
        c2.setBounds(1000,300,400,50);
        c2.setFont(new Font("Sans Serif",Font.BOLD,30));
        c2.add("Present");
        c2.add("Absent");
        c2.add("Leave");
        fr.add(c2);

        l4 = new JLabel("Second Half");
        l4.setBounds(600,400,400,50);
        l4.setFont(new Font("Sans serif",Font.BOLD,30));
        fr.add(l4);

        
        c3 = new Choice();
        c3.setBounds(1000,400,400,50);
        c3.setFont(new Font("Sans Serif",Font.BOLD,30));
        c3.add("Present");
        c3.add("Absent");
        c3.add("Leave");
        fr.add(c3);

        
        JButton b1 =new JButton("Submit");
        b1.setBounds(900,600,150,50);
        b1.setFont(new Font("Sans Serif",Font.BOLD,30));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        fr.add(b1);
    }
    public static void main(String[] args) {
        new StudentAttendence();
    }
}
