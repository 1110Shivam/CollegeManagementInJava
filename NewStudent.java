import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.*;


public class NewStudent implements ActionListener{
    JFrame fr;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
    JComboBox<String> c1,c2;
    JButton b1,b2;



    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    long first = Math.abs(first4);

    NewStudent(){
        fr = new JFrame("New Student");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        fr.setSize(screenSize.width,screenSize.height);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel l=new JLabel(new ImageIcon("Img\\W.jpg"));           
        l.setSize(screenSize.width,screenSize.height);                        
        // fr.add(l);               
        l1 = new JLabel("New Student Details");
        l1.setBounds(800,50,500,50);
        l1.setFont(new Font("serif",Font.ITALIC,40));
        l1.setForeground(Color.white);
        l.add(l1);

        l2 = new JLabel("Full Name");
        l2.setBounds(250,200,300,35);
        l2.setFont(new Font("serif",Font.BOLD,25));
        l2.setForeground(Color.WHITE);
        l.add(l2);

        t1 = new JTextField();
        t1.setBounds(520,200,330,35);
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
        t3.setBounds(520,300,330,35);
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

        l6 = new JLabel("Mobile No.");
        l6.setBounds(250,400,300,35);
        l6.setFont(new Font("serif",Font.BOLD,25));
        l6.setForeground(Color.white);
        l.add(l6);

        t5 = new JTextField();
        t5.setBounds(520,400,330,35);
        t5.setForeground(Color.BLACK);
        t5.setFont(new Font("Sans Serif",Font.BOLD,25));
        l.add(t5);

        
        l7 = new JLabel("Alternate Mob.");
        l7.setBounds(1050,400,200,35);
        l7.setFont(new Font("serif",Font.BOLD,25));
        l7.setForeground(Color.white);
        l.add(l7);

        t6 = new JTextField();
        t6.setBounds(1270,400,330,35);
        t6.setForeground(Color.BLACK);
        t6.setFont(new Font("Sans Serif",Font.BOLD,25));
        l.add(t6);

        l8 = new JLabel("Email Id");
        l8.setBounds(250,500,300,35);
        l8.setFont(new Font("serif",Font.BOLD,25));
        l8.setForeground(Color.white);
        l.add(l8);

        t7 = new JTextField();
        t7.setBounds(520,500,330,35);
        t7.setForeground(Color.BLACK);
        t7.setFont(new Font("Sans Serif",Font.BOLD,25));
        l.add(t7);

        l9 = new JLabel("Aadhar No.");
        l9.setBounds(1050,500,200,35);
        l9.setFont(new Font("serif",Font.BOLD,25));
        l9.setForeground(Color.white);
        l.add(l9);

        t8 = new JTextField();
        t8.setBounds(1270,500,330,35);
        t8.setForeground(Color.BLACK);
        t8.setFont(new Font("Sans Serif",Font.BOLD,25));
        l.add(t8);

        l10 = new JLabel("Class X(%)");
        l10.setBounds(250,600,300,35);
        l10.setFont(new Font("serif",Font.BOLD,25));
        l10.setForeground(Color.white);
        l.add(l10);

        t9 = new JTextField();
        t9.setBounds(520,600,330,35);
        t9.setForeground(Color.BLACK);
        t9.setFont(new Font("Sans Serif",Font.BOLD,25));
        l.add(t9);

        l11 = new JLabel("Class XII(%)");
        l11.setBounds(1050,600,200,35);
        l11.setFont(new Font("serif",Font.BOLD,25));
        l11.setForeground(Color.white);
        l.add(l11);

        t10 = new JTextField();
        t10.setBounds(1270,600,330,35);
        t10.setForeground(Color.BLACK);
        t10.setFont(new Font("Sans Serif",Font.BOLD,25));
        l.add(t10);

        l12 = new JLabel("Course");
        l12.setBounds(250,700,300,35);
        l12.setFont(new Font("serif",Font.BOLD,25));
        l12.setForeground(Color.white);
        l.add(l12);

        String course[] = {"B.Tech","BBA","BCA","Bsc","Msc","MBA","MCA","BA","BCom","Other"};
        JComboBox<String> c1 = new JComboBox<>(course);
        c1.setForeground(Color.black);
        c1.setBounds(520,700,330,30);
        c1.setFont(new Font("Sans Serif",Font.BOLD,25));
        l.add(c1);

        l13 = new JLabel("Branch");
        l13.setBounds(1050,700,200,35);
        l13.setFont(new Font("serif",Font.BOLD,25));
        l13.setForeground(Color.white);
        l.add(l13);

        String branch[] = {"Computer Science","Electronics","Electrical","Mechanical","Civil","Other"};
        JComboBox<String> c2 = new JComboBox<>(branch);
        c2.setForeground(Color.BLACK);
        c2.setBounds(1270,700,330,35);
        c2.setFont(new Font("Sans Serif",Font.BOLD,25));
        l.add(c2);

        l14 = new JLabel("Roll No.");
        l14.setBounds(700,800,200,35);
        l14.setFont(new Font("serif",Font.BOLD,25));
        l14.setForeground(Color.white);
        l.add(l14);

        t11 = new JTextField();
        t11.setText("2022"+first);
        t11.setBounds(900,800,330,35);
        t11.setForeground(Color.BLACK);
        t11.setFont(new Font("Sans Serif",Font.BOLD,25));
        l.add(t11);

        b1 = new JButton("Submit");
        b1.setBackground(Color.white);
        b1.setForeground(Color.black);
        b1.setFont(new Font("Sans Serif",Font.BOLD,25));
        b1.setBounds(400,900,150,40);
        b1.addActionListener(this);
        l.add(b1);

        b2 = new JButton("Reset");
        b2.setBackground(Color.white);
        b2.setForeground(Color.black);
        b2.setFont(new Font("Sans Serif",Font.BOLD,25));
        b2.setBounds(1300,900,150,40);
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

    public static void main(String[] args) {
        new NewStudent();
    }
}