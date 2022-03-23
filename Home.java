import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home{
    JFrame fr;
    JMenuBar menuBar;
    JMenu addmission,details,attendance,attendanceDetails,updateDetails,feeDetails,examination,about;
    JMenuItem faculty,student,fDetails,sDetails,fAttendance,sAttendance,fAttendDetails,sAttendDetails,updateFac,updateStd,feeStructure,feeForm,exmDetails,enterExmMarks,aboutUs;

    Home(){
        //Create frame
        fr = new JFrame("College Management System");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        fr.setSize(screenSize.width,screenSize.height);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add background image on frame
        JLabel bg = new JLabel(new ImageIcon("Img\\Home.jpg"));
        bg.setSize(screenSize.width,screenSize.height);
        fr.add(bg);

        //Create Menu Bar
        menuBar = new JMenuBar(); 
        menuBar.setBorder(BorderFactory.createEmptyBorder(0,0,0,0)); //Create Border on menubar for reduce difference between menubar and menu items
        menuBar.setBackground(new Color(0,0,0));

        //Add logo in menu bar
        JLabel b = new JLabel(new ImageIcon("Img\\Shivam.png"));

        
        //Make admision menu in menu bar
        addmission = new JMenu("Addmission");
        addmission.setFont(new Font("SansSerif",Font.BOLD,20));
        addmission.setForeground(Color.decode("#ffffff"));

        //Add new faculty section in the addmission menu
        faculty = new JMenuItem("New Faculty");
        faculty.setFont(new Font("SansSerif",Font.BOLD,20));
        //Add Image
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("Img\\icon1.png"));
        Image image1 = icon1.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
        faculty.setIcon(new ImageIcon(image1));
        //Set Color
        faculty.setForeground(Color.WHITE);
        faculty.setBackground(Color.BLACK);
        //Set Mnemonic
        // faculty.setMnemonic('A');        
        faculty.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK)); 
        //Set Dimension
        faculty.setPreferredSize(new Dimension(250, 50));
        

        addmission.add(faculty);

        //Add new student section in the addmission menu
        student = new JMenuItem("New Student");
        student.setFont(new Font("SansSerif",Font.BOLD,20));
        //Add Image
        ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("Img\\icon2.png"));
        Image image2 = icon2.getImage().getScaledInstance(45,45,Image.SCALE_DEFAULT);
        student.setIcon(new ImageIcon(image2));
        //Set Color
        student.setForeground(Color.WHITE);
        student.setBackground(Color.BLACK);
        //Set Mnemonic
        student.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
        //Set Dimension
        student.setPreferredSize(new Dimension(250, 50));
        
        
        addmission.add(student);

        //Make details menu in menu bar
        details = new JMenu("Details");
        details.setFont(new Font("SansSerif",Font.BOLD,20));
        details.setForeground(Color.WHITE);

        //Add faculty details section in menu
        fDetails = new JMenuItem("Faculty Details");
        fDetails.setFont(new Font("SansSerif",Font.BOLD,20));
        //Add Image
        ImageIcon icon3 = new ImageIcon(ClassLoader.getSystemResource("Img\\icon3.png"));
        Image image3 = icon3.getImage().getScaledInstance(40,45,Image.SCALE_DEFAULT);
        fDetails.setIcon(new ImageIcon(image3));
        //Set Color
        fDetails.setForeground(Color.WHITE);
        fDetails.setBackground(Color.BLACK);
        //Set Mnemonic
        fDetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
        //Set Dimension
        fDetails.setPreferredSize(new Dimension(270, 50));

        details.add(fDetails);

        //Add student details section in menu
        sDetails = new JMenuItem("Student Details");
        sDetails.setFont(new Font("SansSerif",Font.BOLD,20));
        //Add Image
        ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("Img\\icon4.png"));
        Image image4 = icon4.getImage().getScaledInstance(45,40,Image.SCALE_DEFAULT);
        sDetails.setIcon(new ImageIcon(image4));
        //Set Color
        sDetails.setForeground(Color.WHITE);
        sDetails.setBackground(Color.BLACK);
        //Set Mnemonic
        sDetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
        //Set Dimension
        sDetails.setPreferredSize(new Dimension(270, 50));
 
        details.add(sDetails);

        //Make attendence menu in menu bar
        attendance = new JMenu("Attendance");
        attendance.setFont(new Font("SansSerif",Font.BOLD,20));
        attendance.setForeground(Color.WHITE);

        
        //Add faculty attendence section in menu
        fAttendance = new JMenuItem("Faculty");
        fAttendance.setFont(new Font("SansSerif",Font.BOLD,20));
        //Add Image
        ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("Img\\icon5.png"));
        Image image5 = icon5.getImage().getScaledInstance(45,40,Image.SCALE_DEFAULT);
        fAttendance.setIcon(new ImageIcon(image5));
        //Set Color
        fAttendance.setForeground(Color.WHITE);
        fAttendance.setBackground(Color.BLACK);
        //Set Mnemonic
        fAttendance.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.CTRL_MASK));
        //Set Dimension
        fAttendance.setPreferredSize(new Dimension(210,50));
        
        attendance.add(fAttendance);
        
        //Add student attendence section in menu
        sAttendance = new JMenuItem("Student");
        sAttendance.setFont(new Font("SansSerif",Font.BOLD,20));
        //Add Image
        ImageIcon icon6 = new ImageIcon(ClassLoader.getSystemResource("Img\\icon6.png"));
        Image image6 = icon6.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
        sAttendance.setIcon(new ImageIcon(image6));
        //Set Color
        sAttendance.setForeground(Color.WHITE);
        sAttendance.setBackground(Color.BLACK);
        //Set Mnemonic
        sAttendance.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,ActionEvent.CTRL_MASK));
        //Set Dimension
        sAttendance.setPreferredSize(new Dimension(210,50));

        attendance.add(sAttendance);

        //Make attendance details menu in menu bar
        attendanceDetails = new JMenu("Attendance Details");
        attendanceDetails.setFont(new Font("SansSerif",Font.BOLD,20));
        attendanceDetails.setForeground(Color.white);

        //Add faculty attendance details in attendance details menu
        fAttendDetails = new JMenuItem("Faculty Attendance");
        fAttendDetails.setFont(new Font("SansSerif",Font.BOLD,20));
        //Add Image
        ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("Img\\icon5.png"));
        Image image7 = icon7.getImage().getScaledInstance(45,40,Image.SCALE_DEFAULT);
        fAttendDetails.setIcon(new ImageIcon(image7));
        //Set Color
        fAttendDetails.setForeground(Color.WHITE);
        fAttendDetails.setBackground(Color.BLACK);
        //Set Mnemonic
        fAttendDetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G,ActionEvent.CTRL_MASK));
        //Set Dimension
        fAttendDetails.setPreferredSize(new Dimension(320,50));
        
        attendanceDetails.add(fAttendDetails);

        //Add student attendance details in attendance details menu
        sAttendDetails = new JMenuItem("Student Attendance");
        sAttendDetails.setFont(new Font("SansSerif",Font.BOLD,20));
        //Add Image
        ImageIcon icon8 = new ImageIcon(ClassLoader.getSystemResource("Img\\icon6.png"));
        Image image8 = icon8.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
        sAttendDetails.setIcon(new ImageIcon(image8));
        //Set Color
        sAttendDetails.setForeground(Color.WHITE);
        sAttendDetails.setBackground(Color.BLACK);
        //Set Mnemonic
        sAttendDetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,ActionEvent.CTRL_MASK));
        //Set Dimension
        sAttendDetails.setPreferredSize(new Dimension(320,50));

        attendanceDetails.add(sAttendDetails);
        
        // Make update details menu in menu bar
        updateDetails = new JMenu("Update Details");
        updateDetails.setFont(new Font("SansSerif",Font.BOLD,20));
        updateDetails.setForeground(Color.white);

        //Add update faculty section in update details
        updateFac = new JMenuItem("Update Faculty");
        updateFac.setFont(new Font("SansSerif",Font.BOLD,20));
        //Add Image
        ImageIcon icon9 = new ImageIcon(ClassLoader.getSystemResource("Img\\icon7.png"));
        Image image9 = icon9.getImage().getScaledInstance(35,35,Image.SCALE_DEFAULT);
        updateFac.setIcon(new ImageIcon(image9));
        //Set Color
        updateFac.setForeground(Color.WHITE);
        updateFac.setBackground(Color.BLACK);
        //Set Mnemonic
        updateFac.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I,ActionEvent.CTRL_MASK));
        //Set Dimension
        updateFac.setPreferredSize(new Dimension(270,50));

        updateDetails.add(updateFac);

        //Add update student sectin in update details
        updateStd = new JMenuItem("Update Student");
        updateStd.setFont(new Font("SansSerif",Font.BOLD,20));
        //Add Image
        ImageIcon icon10 = new ImageIcon(ClassLoader.getSystemResource("Img\\icon8.png"));
        Image image10 = icon10.getImage().getScaledInstance(35,35,Image.SCALE_DEFAULT);
        updateStd.setIcon(new ImageIcon(image10));
        //Set Color
        updateStd.setForeground(Color.WHITE);
        updateStd.setBackground(Color.BLACK);
        //Set Mnemonic
        updateStd.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_J,ActionEvent.CTRL_MASK));
        //Set Dimension
        updateStd.setPreferredSize(new Dimension(270,50));

        updateDetails.add(updateStd);

        //Make fee Details menu in menu bar
        feeDetails = new JMenu("Fee Details");
        feeDetails.setFont(new Font("SansSerif",Font.BOLD,20));
        feeDetails.setForeground(Color.white);
        

        //Add fee structure in fee details menu
        feeStructure = new JMenuItem("Fee Structure");
        feeStructure.setFont(new Font("SansSerif",Font.BOLD,20));
        //Add Image
        ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("Img\\icon9.png"));
        Image image11 = icon11.getImage().getScaledInstance(45,45,Image.SCALE_DEFAULT);
        feeStructure.setIcon(new ImageIcon(image11));
        //Set Color
        feeStructure.setForeground(Color.WHITE);
        feeStructure.setBackground(Color.BLACK);
        //Set Mnemonic
        feeStructure.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K,ActionEvent.CTRL_MASK));
        //Set Dimension
        feeStructure.setPreferredSize(new Dimension(250,50));

        feeDetails.add(feeStructure);

        //Add fee form in fee details menu
        feeForm = new JMenuItem("Fee Form");
        feeForm.setFont(new Font("SansSerif",Font.BOLD,20));
        //Add Image
        ImageIcon icon12 = new ImageIcon(ClassLoader.getSystemResource("Img\\icon10.png"));
        Image image12 = icon12.getImage().getScaledInstance(45,40,Image.SCALE_DEFAULT);
        feeForm.setIcon(new ImageIcon(image12));
        //Set Color
        feeForm.setForeground(Color.WHITE);
        feeForm.setBackground(Color.BLACK);
        //Set Mnemonic
        feeForm.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,ActionEvent.CTRL_MASK));
        //Set Dimension
        feeForm.setPreferredSize(new Dimension(250,50));

        feeDetails.add(feeForm);

        //Make examination menu in menu bar
        examination = new JMenu("Examination");
        examination.setFont(new Font("SansSerif",Font.BOLD,20));
        examination.setForeground(Color.white);

        //Add exam details in examination menu
        exmDetails = new JMenuItem("Exam Details");
        exmDetails.setFont(new Font("SansSerif",Font.BOLD,20));
        //Add Image
        ImageIcon icon13 = new ImageIcon(ClassLoader.getSystemResource("Img\\icon11.png"));
        Image image13 = icon13.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
        exmDetails.setIcon(new ImageIcon(image13));
        //Set Color
        exmDetails.setForeground(Color.WHITE);
        exmDetails.setBackground(Color.BLACK);
        //Set Mnemonic
        exmDetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
        //Set Dimension
        exmDetails.setPreferredSize(new Dimension(260,50));

        examination.add(exmDetails);

        //Add enter exam marks in examination menu
        enterExmMarks = new JMenuItem("Exam Marks");
        enterExmMarks.setFont(new Font("SansSerif",Font.BOLD,20));
        //Add Image
        ImageIcon icon14 = new ImageIcon(ClassLoader.getSystemResource("Img\\icon12.png"));
        Image image14 = icon14.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
        enterExmMarks.setIcon(new ImageIcon(image14));
        //Set Color
        enterExmMarks.setForeground(Color.WHITE);
        enterExmMarks.setBackground(Color.BLACK);
        //Set Mnemonic
        enterExmMarks.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
        //Set Dimension
        enterExmMarks.setPreferredSize(new Dimension(260,50));
                
        examination.add(enterExmMarks);

        //Make about menu in menu bar
        about = new JMenu("About");
        about.setFont(new Font("SansSerif",Font.BOLD,20));
        about.setForeground(Color.white);

        //Add about us in about menu
        aboutUs = new JMenuItem("About Us");
        aboutUs.setFont(new Font("SansSerif",Font.BOLD,20));
        //Add Image
        ImageIcon icon15 = new ImageIcon(ClassLoader.getSystemResource("Img\\icon13.png"));
        Image image15 = icon15.getImage().getScaledInstance(35,35,Image.SCALE_DEFAULT);
        aboutUs.setIcon(new ImageIcon(image15));
        //Set Color
        aboutUs.setForeground(Color.WHITE);
        aboutUs.setBackground(Color.BLACK);
        //Set Mnemonic
        aboutUs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.CTRL_MASK));
        //Set Dimension
        aboutUs.setPreferredSize(new Dimension(210,50));

        about.add(aboutUs);

        //Add cancel button
        JLabel cancel = new JLabel(new ImageIcon("Img\\cancel.png"));
    

        menuBar.add(b);
        menuBar.add(Box.createHorizontalGlue());
        menuBar.add(addmission);
        menuBar.add(details);
        menuBar.add(attendance);
        menuBar.add(attendanceDetails);
        menuBar.add(updateDetails);
        menuBar.add(feeDetails);
        menuBar.add(examination);
        menuBar.add(about);
        menuBar.add(Box.createHorizontalGlue());
        menuBar.add(cancel);
        fr.setJMenuBar(menuBar);


    }
    public static void main(String[] args){
        new Home();
    }
}