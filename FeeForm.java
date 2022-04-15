import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class FeeForm {

    JFrame fr;
    JPanel contentPane;
    JTextField t1, t2, t3;
    JComboBox<String> cb1,cb2,cb3;
    JButton b1, b2;
    Choice c1;

    public FeeForm() {
        fr = new JFrame("Student Fee Form");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        fr.setSize(screenSize.width, screenSize.height);
        fr.setVisible(true);
        
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        fr.setContentPane(contentPane);
        
        JLabel l = new JLabel("Student Fee form");
        l.setBounds(780, 30, 500, 50);
        l.setFont(new Font("serif", Font.BOLD, 40));
        contentPane.add(l);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(102, 205, 170), 5, true), "Fee-Form",
        TitledBorder.LEADING, TitledBorder.TOP, null, new Color(30, 144, 255)));
        panel.setBackground(new Color(211, 211, 211));
        panel.setBounds(550, 100, 850, 900);
        contentPane.setBackground(Color.WHITE);
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        contentPane.add(panel);

        
        JLabel l1 = new JLabel("Select Roll No");
        l1.setFont(new Font("Tahoma", Font.BOLD, 25));
        l1.setBounds(100, 100, 200, 40);
        panel.add(l1);

        c1 = new Choice();
        c1.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
        c1.setBounds(350, 100, 400, 40);
        panel.add(c1);

        JLabel l2 = new JLabel("Student Name");
        l2.setFont(new Font("Tahoma", Font.BOLD, 25));
        l2.setBounds(100, 170, 200, 40);
        panel.add(l2);

        
        t1 = new JTextField();
        t1.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
        t1.setBounds(350, 170, 400, 40);
        panel.add(t1);

        JLabel l3 = new JLabel("Father's Name");
        l3.setFont(new Font("Tahoma", Font.BOLD, 25));
        l3.setBounds(100, 240, 200, 40);
        panel.add(l3);

        t2 = new JTextField();
        t2.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
        t2.setBounds(350, 240, 400, 40);
        panel.add(t2);

        JLabel l4 = new JLabel("Course");
        l4.setFont(new Font("Tahoma", Font.BOLD, 25));
        l4.setBounds(100, 310, 200, 40);
        panel.add(l4);

        String course[] = {"B.Tech","BBA","BCA","Bsc","Msc","MBA","MCA","BA","BCom","Other"};
        JComboBox<String> cb1 = new JComboBox<>(course);
        cb1.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
        cb1.setBounds(350, 310, 400, 40);
        panel.add(cb1);

        JLabel l5 = new JLabel("Branch");
        l5.setFont(new Font("Tahoma", Font.BOLD, 25));
        l5.setBounds(100, 380, 200, 40);
        panel.add(l5);

        String branch[] = {"Mechanical","CSE","IT","Civil","Automobile","Electronics","Other"};
        JComboBox<String> cb2 = new JComboBox<>(branch);        
        cb2.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
        cb2.setBounds(350, 380, 400, 40);
        panel.add(cb2);
        

        JLabel l6 = new JLabel("Semester");
        l6.setFont(new Font("Tahoma", Font.BOLD, 25));
        l6.setBounds(100, 450, 200, 40);
        panel.add(l6);       

        String sem[] = {"1st", "2nd","3rd", "4th", "5th", "6th", "7th", "8th"};
        JComboBox<String> cb3 = new JComboBox<>(sem);        
        cb3.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
        cb3.setBounds(350, 450, 400, 40);
        panel.add(cb3);
        
        
        JLabel l7 = new JLabel("Total Payable");
        l7.setFont(new Font("Tahoma", Font.BOLD, 25));
        l7.setBounds(100, 520, 200, 40);
        panel.add(l7);

        t3 = new JTextField();
        t3.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
        t3.setBounds(350, 520, 400, 40);
        panel.add(t3);

        b1 = new JButton("Pay");
        b1.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
        b1.setBounds(150, 700, 150, 50);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        panel.add(b1);

        b2 = new JButton("Back");
        b2.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
        b2.setBounds(500, 700, 150, 50);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        panel.add(b2);
    }

    public static void main(String[] args) {
        new FeeForm();
    }
}
