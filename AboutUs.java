import java.awt.*;
import javax.swing.*;

public class AboutUs{

    JFrame fr;
    JPanel contentPane;

    public AboutUs() {

        fr = new JFrame("About Us");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        fr.setSize(screenSize.width,screenSize.height);
        fr.setVisible(true);
        
        contentPane = new JPanel();
        fr.setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel l1 = new JLabel();
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Img\\about.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l1 = new JLabel(i3);
        l1.setBounds(1000, 40, 800, 400);
        contentPane.add(l1);

        JLabel l3 = new JLabel("College");
        l3.setForeground(new Color(89, 160, 187));
        l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 70));
        l3.setBounds(400, 150, 410, 80);
        contentPane.add(l3);

        JLabel l4 = new JLabel("Mangement System");
        l4.setForeground(new Color(17, 125, 120));
        l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 70));
        l4.setBounds(200, 230, 850, 75);
        contentPane.add(l4);

        
        JLabel l5 = new JLabel("Developed By :");
        l5.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
        l5.setBounds(800, 500, 600, 50);
        contentPane.add(l5);

        JLabel l6 = new JLabel("Name : ");
        l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
        l6.setBounds(250, 650, 120, 30);
        contentPane.add(l6);
        
        JLabel l7 = new JLabel("Shivam");
        l7.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
        l7.setBounds(400, 650, 200, 30);
        contentPane.add(l7);

        JLabel l8 = new JLabel("Roll No. : ");
        l8.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
        l8.setBounds(250, 700, 150, 30);
        contentPane.add(l8);

        JLabel l9 = new JLabel("190942106114");
        l9.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
        l9.setBounds(400, 700, 600, 30);
        contentPane.add(l9);

        JLabel l10 = new JLabel("Course : ");
        l10.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
        l10.setBounds(250, 750, 150, 30);
        contentPane.add(l10);

        JLabel l11 = new JLabel("BCA");
        l11.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
        l11.setBounds(400, 750, 600, 30);
        contentPane.add(l11);

        JLabel l12 = new JLabel("Name : ");
        l12.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
        l12.setBounds(1250, 650, 120, 30);
        contentPane.add(l12);
        
        JLabel l13 = new JLabel("Achal Sharma");
        l13.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
        l13.setBounds(1400, 650, 400, 30);
        contentPane.add(l13);

        JLabel l14 = new JLabel("Roll No. : ");
        l14.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
        l14.setBounds(1250, 700, 150, 30);
        contentPane.add(l14);

        JLabel l15 = new JLabel("190942106005");
        l15.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
        l15.setBounds(1400, 700, 600, 30);
        contentPane.add(l15);

        JLabel l16 = new JLabel("Course : ");
        l16.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
        l16.setBounds(1250, 750, 150, 30);
        contentPane.add(l16);

        JLabel l17 = new JLabel("BCA");
        l17.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
        l17.setBounds(1400, 750, 600, 30);
        contentPane.add(l17);
    }

    public static void main(String[] args) {
        new AboutUs();
    }

}
