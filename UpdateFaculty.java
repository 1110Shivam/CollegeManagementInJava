import java.awt.*;
import javax.swing.*;

class UpdateFaculty {

    JFrame fr;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
    JButton b1,b2; 
    
    UpdateFaculty(){
        fr = new JFrame("Update Faculty Details");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        fr.setSize(screenSize.width, screenSize.height);
        fr.setVisible(true);
        fr.setLayout(null);

        l1 = new JLabel("Update Faculty Details");
        l1.setBounds(700,10,500,70);
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("serif",Font.BOLD,50));
        fr.add(l1);
        
        l2 = new JLabel("Enter employee id to update the data of faculty ");
        l2.setBounds(250,150,700,40);
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("serif",Font.ITALIC,35));
        fr.add(l2);

        t1 = new JTextField();
        t1.setBounds(1000,150,350,40);
        t1.setForeground(Color.black);
        t1.setFont(new Font("serif",Font.BOLD,30));
        fr.add(t1);
        
        b1 = new JButton("Update");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Sans Serif",Font.BOLD,25));
        b1.setBounds(1420,150,180,40);
        fr.add(b1);
        
        
        l3 = new JLabel("Name");
        l3.setBounds(250,250,150,50);
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("serif",Font.BOLD,30));
        fr.add(l3);

        t2 = new JTextField();
        t2.setBounds(500,260,300,35);
        t2.setFont(new Font("serif",Font.BOLD,25));
        fr.add(t2);

        
        l4 = new JLabel("Age");
        l4.setBounds(250,320,150,50);
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("serif",Font.BOLD,30));
        fr.add(l4);

        t3 = new JTextField();
        t3.setBounds(500,330,300,35);
        t3.setFont(new Font("serif",Font.BOLD,25));
        fr.add(t3);
        
        l5 = new JLabel("Address");
        l5.setBounds(250,390,150,50);
        l5.setForeground(Color.BLACK);
        l5.setFont(new Font("serif",Font.BOLD,30));
        fr.add(l5);

        t4 = new JTextField();
        t4.setBounds(500,400,300,35);
        t4.setFont(new Font("serif",Font.BOLD,25));
        fr.add(t4);
        
        l6 = new JLabel("Email Id");
        l6.setBounds(250,460,150,50);
        l6.setForeground(Color.BLACK);
        l6.setFont(new Font("serif",Font.BOLD,30));
        fr.add(l6);

        t5 = new JTextField();
        t5.setBounds(500,470,300,35);
        t5.setFont(new Font("serif",Font.BOLD,25));
        fr.add(t5);
        
        l7 = new JLabel("Class XII(%)");
        l7.setBounds(250,530,200,50);
        l7.setForeground(Color.BLACK);
        l7.setFont(new Font("serif",Font.BOLD,30));
        fr.add(l7);

        t6 = new JTextField();
        t6.setBounds(500,540,300,35);
        t6.setFont(new Font("serif",Font.BOLD,25));
        fr.add(t6);
        
        l8 = new JLabel("Employee Id");
        l8.setBounds(250,600,200,50);
        l8.setForeground(Color.BLACK);
        l8.setFont(new Font("serif",Font.BOLD,30));
        fr.add(l8);

        t7 = new JTextField();
        t7.setBounds(500,610,300,35);
        t7.setFont(new Font("serif",Font.BOLD,25));
        fr.add(t7);
        
        l9 = new JLabel("Department");
        l9.setBounds(250,670,200,50);
        l9.setForeground(Color.BLACK);
        l9.setFont(new Font("serif",Font.BOLD,30));
        fr.add(l9);

        t8 = new JTextField();
        t8.setBounds(500,680,300,35);
        t8.setFont(new Font("serif",Font.BOLD,25));
        fr.add(t8);

        
        l10 = new JLabel("Father's Name");
        l10.setBounds(1000,250,200,50);
        l10.setForeground(Color.BLACK);
        l10.setFont(new Font("serif",Font.BOLD,30));
        fr.add(l10);

        t9 = new JTextField();
        t9.setBounds(1300,260,300,35);
        t9.setFont(new Font("serif",Font.BOLD,25));
        fr.add(t9);

        
        l11 = new JLabel("DOB (dd/mm/yyyy)");
        l11.setBounds(1000,320,250,50);
        l11.setForeground(Color.BLACK);
        l11.setFont(new Font("serif",Font.BOLD,30));
        fr.add(l11);

        t10 = new JTextField();
        t10.setBounds(1300,330,300,35);
        t10.setFont(new Font("serif",Font.BOLD,25));
        fr.add(t10);
        
        l12 = new JLabel("Mobile Number");
        l12.setBounds(1000,390,250,50);
        l12.setForeground(Color.BLACK);
        l12.setFont(new Font("serif",Font.BOLD,30));
        fr.add(l12);

        t11 = new JTextField();
        t11.setBounds(1300,400,300,35);
        t11.setFont(new Font("serif",Font.BOLD,25));
        fr.add(t11);

        l12 = new JLabel("Class X(%)");
        l12.setBounds(1000,460,250,50);
        l12.setForeground(Color.BLACK);
        l12.setFont(new Font("serif",Font.BOLD,30));
        fr.add(l12);

        t11 = new JTextField();
        t11.setBounds(1300,470,300,35);
        t11.setFont(new Font("serif",Font.BOLD,25));
        fr.add(t11);

        l13 = new JLabel("Aadhar Number");
        l13.setBounds(1000,530,250,50);
        l13.setForeground(Color.BLACK);
        l13.setFont(new Font("serif",Font.BOLD,30));
        fr.add(l13);

        t12 = new JTextField();
        t12.setBounds(1300,540,300,35);
        t12.setFont(new Font("serif",Font.BOLD,25));
        fr.add(t12);

        l14 = new JLabel("Education");
        l14.setBounds(1000,600,250,50);
        l14.setForeground(Color.BLACK);
        l14.setFont(new Font("serif",Font.BOLD,30));
        fr.add(l14);

        t13 = new JTextField();
        t13.setBounds(1300,610,300,35);
        t13.setFont(new Font("serif",Font.BOLD,25));
        fr.add(t13);

        b2 = new JButton("Submit");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Sans Serif",Font.BOLD,30));
        b2.setBounds(850,850,200,50);
        fr.add(b2);

    }


    public static void main(String[] arg){
        new UpdateFaculty();
    }
}