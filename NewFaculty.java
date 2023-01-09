import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.*;

public class NewFaculty implements ActionListener{
    JFrame fr;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
    JComboBox<String> c1,c2;
    JButton b1,b2;



    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    long first = Math.abs(first4);

    NewFaculty(){
        fr = new JFrame("New Faculty");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        fr.setSize(screenSize.width,screenSize.height);
        fr.setVisible(true);
        
        JLabel l=new JLabel(new ImageIcon("Img\\W.jpg"));           
        l.setSize(screenSize.width,screenSize.height);                        
        
        
        l1 = new JLabel("New Faculty Details");
        l1.setBounds(600,50,800,50);
        l1.setFont(new Font("serif",Font.ITALIC,30));
        l1.setForeground(Color.BLACK);
        l.add(l1);

        l2 = new JLabel("Full Name");
        l2.setBounds(150,200,200,30);
        l2.setFont(new Font("serif",Font.BOLD,20));
        l2.setForeground(Color.black);
        l.add(l2);

        t1 = new JTextField();
        t1.setBounds(350,200,300,30);
        t1.setForeground(Color.BLACK);
        t1.setFont(new Font("Sans Serif",Font.BOLD,20));
        l.add(t1);

        l3 = new JLabel("Father's Name");
        l3.setBounds(900,200,200,30);
        l3.setFont(new Font("serif",Font.BOLD,20));
        l3.setForeground(Color.black);
        l.add(l3);

        t2 = new JTextField();
        t2.setBounds(1100,200,300,30);
        t2.setForeground(Color.BLACK);
        t2.setFont(new Font("Sans Serif",Font.BOLD,20));
        l.add(t2);

        
        l4 = new JLabel("DOB (dd/mm/yyyy)");
        l4.setBounds(150,270,200,30);
        l4.setFont(new Font("serif",Font.BOLD,20));
        l4.setForeground(Color.black);
        l.add(l4);

        t3 = new JTextField();
        t3.setBounds(350,270,300,30);
        t3.setForeground(Color.BLACK);
        t3.setFont(new Font("Sans Serif",Font.BOLD,20));
        l.add(t3);

        l5 = new JLabel("Address");
        l5.setBounds(900,270,200,30);
        l5.setFont(new Font("serif",Font.BOLD,20));
        l5.setForeground(Color.black);
        l.add(l5);

        t4 = new JTextField();
        t4.setBounds(1100,270,300,30);
        t4.setForeground(Color.BLACK);
        t4.setFont(new Font("Sans Serif",Font.BOLD,20));
        l.add(t4);

        l6 = new JLabel("Mobile No.");
        l6.setBounds(150,340,200,30);
        l6.setFont(new Font("serif",Font.BOLD,20));
        l6.setForeground(Color.black);
        l.add(l6);

        t5 = new JTextField();
        t5.setBounds(350,340,300,30);
        t5.setForeground(Color.BLACK);
        t5.setFont(new Font("Sans Serif",Font.BOLD,20));
        l.add(t5);

        
        l7 = new JLabel("Alternate Mob.");
        l7.setBounds(900,340,200,30);
        l7.setFont(new Font("serif",Font.BOLD,20));
        l7.setForeground(Color.black);
        l.add(l7);

        t6 = new JTextField();
        t6.setBounds(1100,340,300,30);
        t6.setForeground(Color.BLACK);
        t6.setFont(new Font("Sans Serif",Font.BOLD,20));
        l.add(t6);

        l8 = new JLabel("Email Id");
        l8.setBounds(150,410,200,30);
        l8.setFont(new Font("serif",Font.BOLD,20));
        l8.setForeground(Color.black);
        l.add(l8);

        t7 = new JTextField();
        t7.setBounds(350,410,300,30);
        t7.setForeground(Color.BLACK);
        t7.setFont(new Font("Sans Serif",Font.BOLD,20));
        l.add(t7);

        l9 = new JLabel("Aadhar No.");
        l9.setBounds(900,410,200,30);
        l9.setFont(new Font("serif",Font.BOLD,20));
        l9.setForeground(Color.black);
        l.add(l9);

        t8 = new JTextField();
        t8.setBounds(1100,410,300,30);
        t8.setForeground(Color.BLACK);
        t8.setFont(new Font("Sans Serif",Font.BOLD,20));
        l.add(t8);

        l10 = new JLabel("Class X(%)");
        l10.setBounds(150,480,200,30);
        l10.setFont(new Font("serif",Font.BOLD,20));
        l10.setForeground(Color.black);
        l.add(l10);

        t9 = new JTextField();
        t9.setBounds(350,480,300,30);
        t9.setForeground(Color.BLACK);
        t9.setFont(new Font("Sans Serif",Font.BOLD,20));
        l.add(t9);

        l11 = new JLabel("Class XII(%)");
        l11.setBounds(900,480,200,30);
        l11.setFont(new Font("serif",Font.BOLD,20));
        l11.setForeground(Color.black);
        l.add(l11);

        t10 = new JTextField();
        t10.setBounds(1100,480,300,30);
        t10.setForeground(Color.BLACK);
        t10.setFont(new Font("Sans Serif",Font.BOLD,20));
        l.add(t10);

        l12 = new JLabel("Education");
        l12.setBounds(150,550,200,30);
        l12.setFont(new Font("serif",Font.BOLD,20));
        l12.setForeground(Color.black);
        l.add(l12);

        String course[] = {"B.Tech","BBA","BCA","Bsc","Msc","MBA","MCA","BA","BCom","Other"};
        JComboBox<String> c1 = new JComboBox<>(course);
        c1.setBounds(350,550,300,30);
        c1.setForeground(Color.BLACK);
        c1.setFont(new Font("Sans Serif",Font.BOLD,20));
        l.add(c1);

        l13 = new JLabel("Department");
        l13.setBounds(900,550,200,30);
        l13.setFont(new Font("serif",Font.BOLD,20));
        l13.setForeground(Color.black);
        l.add(l13);

        String branch[] = {"Computer Science","Electronics","Electrical","Mechanical","Civil","Other"};
        JComboBox<String> c2 = new JComboBox<>(branch);
        c2.setBounds(1100,550,300,30);
        c2.setForeground(Color.BLACK);
        c2.setFont(new Font("Sans Serif",Font.BOLD,20));
        l.add(c2);

        l14 = new JLabel("Emp. Id");
        l14.setBounds(150,620,200,30);
        l14.setFont(new Font("serif",Font.BOLD,20));
        l14.setForeground(Color.black);
        l.add(l14);

        t11 = new JTextField();
        t11.setText("101"+first);
        t11.setBounds(350,630,300,30);
        t11.setForeground(Color.BLACK);
        t11.setFont(new Font("Sans Serif",Font.BOLD,20));
        l.add(t11);

        b1 = new JButton("Submit");
        b1.setBackground(Color.white);
        b1.setForeground(Color.black);
        b1.setFont(new Font("Sans Serif",Font.BOLD,25));
        b1.setBounds(550,700,150,40);
        b1.addActionListener(this);
        l.add(b1);

        b2 = new JButton("Reset");
        b2.setBackground(Color.white);
        b2.setForeground(Color.black);
        b2.setFont(new Font("Sans Serif",Font.BOLD,25));
        b2.setBounds(850,700,150,40);
        b2.addActionListener(this);
        l.add(b2);
        
        fr.add(l);
    }

    public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1)
		{
            new Error();

		}
		else if(e.getSource()==b2)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			t6.setText("");
			t7.setText("");
			t8.setText("");
			t9.setText("");
			t10.setText("");
		}
	}

    public static void main(String[] args){
        new NewFaculty();
    }
}