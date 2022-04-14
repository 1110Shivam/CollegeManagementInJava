import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;


public class ExamDetails {
    JFrame fr;
    JPanel contentPane;
    JTable table;
    JTextField search;
    JButton b1,b2,b3;

    ExamDetails(){
        fr = new JFrame("Exam Details");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        fr.setSize(screenSize.width,screenSize.height);
        fr.setVisible(true);
        
        contentPane = new JPanel();
        // contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(Color.WHITE);
        fr.setContentPane(contentPane);
        contentPane.setLayout(null);

        
        JLabel l1 = new JLabel("Check Result");
        l1.setForeground(new Color(107, 142, 35));
        l1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 40));
        l1.setBounds(800,40, 400, 50);
        contentPane.add(l1);



        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 128, 128), 3, true), "Exam-Details",
        TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 0)));
        panel.setBounds(100, 100, 1700, 700);
        panel.setBackground(Color.WHITE);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel l3 = new JLabel("Roll No.");
        l3.setForeground(Color.GRAY);
        l3.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
        l3.setBounds(150, 50, 100, 40);
        panel.add(l3);

        
        search = new JTextField();
        search.setBackground(new Color(255, 240, 245));
        search.setBorder(new LineBorder(new Color(255, 105, 180), 2, true));
        search.setForeground(new Color(47, 79, 79));
        search.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
        search.setBounds(290, 50, 350, 40);
        panel.add(search);
        search.setColumns(10);

        b1 = new JButton("Result");
        b1.setBorder(new LineBorder(new Color(255, 20, 147), 2, true));
        b1.setForeground(new Color(199, 21, 133));
        b1.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
        b1.setBounds(1300, 50, 140, 40);
        panel.add(b1);        


        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(100, 150, 1500, 500);
        panel.add(scrollPane);
        
        
        // table.setBackground(new Color(240, 248, 255));
        // table.setForeground(Color.DARK_GRAY);
        // table.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
        // scrollPane.setViewportView(table);
        
     
    }
    public static void main(String[] args) {
        new ExamDetails();
    }
    
}
