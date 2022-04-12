import javax.swing.*;
import java.awt.*;

public class EnterMarks{

    JFrame fr;
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17;
    JButton b1;

    EnterMarks(){
        fr = new JFrame("Enter Marks");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        fr.setSize(screenSize.width,screenSize.height);
        fr.setVisible(true);
        fr.setLayout(null);

        l1 = new JLabel("Enter marks of Student");
        l1.setBounds(780,50,500,50);
        l1.setFont(new Font("serif",Font.BOLD,40));
        fr.add(l1);

        l2 = new JLabel("Enter Roll No.");
        l2.setBounds(700,200,200,35);
        l2.setFont(new Font("serif",Font.BOLD,25));
        fr.add(l2);

        t1 = new JTextField();
        t1.setBounds(950,200,300,35);
        t1.setFont(new Font("serif",Font.BOLD,25));
        fr.add(t1);

        l3 = new JLabel("Enter Subject");
        l3.setBounds(700,300,200,25);
        l3.setFont(new Font("serif",Font.BOLD,20));
        fr.add(l3);

        l4 = new JLabel("Enter Marks");
        l4.setBounds(1000,300,200,25);
        l4.setFont(new Font("serif",Font.BOLD,20));
        fr.add(l4);

        t2 = new JTextField();
        t2.setBounds(700,350,250,25);
        t2.setFont(new Font("serif",Font.BOLD,20));
        fr.add(t2);

        t3 = new JTextField();
        t3.setBounds(1000,350,250,25);
        t3.setFont(new Font("serif",Font.BOLD,20));
        fr.add(t3);

        t4 = new JTextField();
        t4.setBounds(700,390,250,25);
        t4.setFont(new Font("serif",Font.BOLD,20));
        fr.add(t4);

        t5 = new JTextField();
        t5.setBounds(1000,390,250,25);
        t5.setFont(new Font("serif",Font.BOLD,20));
        fr.add(t5);

        t6 = new JTextField();
        t6.setBounds(700,430,250,25);
        t6.setFont(new Font("serif",Font.BOLD,20));
        fr.add(t6);

        t7 = new JTextField();
        t7.setBounds(1000,430,250,25);
        t7.setFont(new Font("serif",Font.BOLD,20));
        fr.add(t7);

        t8 = new JTextField();
        t8.setBounds(700,470,250,25);
        t8.setFont(new Font("serif",Font.BOLD,20));
        fr.add(t8);

        t9 = new JTextField();
        t9.setBounds(1000,470,250,25);
        t9.setFont(new Font("serif",Font.BOLD,20));
        fr.add(t9);

        t10 = new JTextField();
        t10.setBounds(700,510,250,25);
        t10.setFont(new Font("serif",Font.BOLD,20));
        fr.add(t10);

        t11 = new JTextField();
        t11.setBounds(1000,510,250,25);
        t11.setFont(new Font("serif",Font.BOLD,20));
        fr.add(t11);

        t12 = new JTextField();
        t12.setBounds(700,550,250,25);
        t12.setFont(new Font("serif",Font.BOLD,20));
        fr.add(t12);

        t13 = new JTextField();
        t13.setBounds(1000,550,250,25);
        t13.setFont(new Font("serif",Font.BOLD,20));
        fr.add(t13);

        t14 = new JTextField();
        t14.setBounds(700,590,250,25);
        t14.setFont(new Font("serif",Font.BOLD,20));
        fr.add(t14);

        t15 = new JTextField();
        t15.setBounds(1000,590,250,25);
        t15.setFont(new Font("serif",Font.BOLD,20));
        fr.add(t15);

        t16 = new JTextField();
        t16.setBounds(700,630,250,25);
        t16.setFont(new Font("serif",Font.BOLD,20));
        fr.add(t16);

        t17 = new JTextField();
        t17.setBounds(1000,630,250,25);
        t17.setFont(new Font("serif",Font.BOLD,20));
        fr.add(t17);

        b1 = new JButton("Submit");
        b1.setBounds(870,700,200,50);
        b1.setFont(new Font("serif",Font.BOLD,28));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        fr.add(b1);


    }
    public static void main(String[] args) {
        new EnterMarks();
    }
}