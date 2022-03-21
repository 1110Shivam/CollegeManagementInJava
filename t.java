import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class t implements ActionListener {
    JFrame fr;
    JLabel l1;
    JMenuBar menuBar;
    JMenu addmision,Details,attendance,attendance_detail,updateDetails,feeDetails,examination,about;
    JMenuItem item,faculty,student,sDetail,tDetail,sAttendence,tAttendence,sAttendanceDetail,tAttendanceDetail,studentUpdate,teacherUpdate,f1,f2,e1,e2,aboutus;

    t(){
        fr = new JFrame("College Management System");                           //Make Frame

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();     //Get System's Screen Size
		fr.setSize(screenSize.width, screenSize.height);                        //Open Full Screen On System
		fr.setLayout(null);                                                     
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                      //Close Frame Button

        l1=new JLabel(new ImageIcon("Img\\Home.jpg"));                          //Get Image
		l1.setSize(screenSize.width,screenSize.height);                         //Set Image's According To Screen    
		fr.add(l1);                                                                         

        menuBar = new JMenuBar();                                                    //Make Menu Bar
        menuBar.add(Box.createRigidArea(new Dimension(0,50)));

        ImageIcon icon = new ImageIcon("Img\\Shivam.png");
        item = new JMenuItem(icon);
        item.setBackground(new Color(0,0,0));
        item.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
       
                
        addmision = new JMenu("Addmission");
        addmision.setFont(new Font("SansSerif",Font.BOLD,20));
        addmision.setForeground(new Color(255,255,255));
        addmision.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        
                
        faculty = new JMenuItem("New Faculty");
        faculty.setFont(new Font("SansSerif",Font.BOLD,20));
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("Img\\icon1.png"));
        Image image1 = icon1.getImage().getScaledInstance(45, 45,Image.SCALE_DEFAULT);
        faculty.setIcon(new ImageIcon(image1));
        faculty.setMnemonic('A');        
        faculty.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        faculty.setForeground(Color.WHITE);
        faculty.setBackground(Color.BLACK);
        faculty.setPreferredSize(new Dimension(250, 50));
        faculty.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        faculty.addActionListener(this);


        student = new JMenuItem("New Student");
        student.setFont(new Font("SansSerif",Font.BOLD,20));
        ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("Img\\icon2.png"));
        Image image2 = icon2.getImage().getScaledInstance(40, 40,Image.SCALE_DEFAULT);
        student.setIcon(new ImageIcon(image2));
        student.setMnemonic('B');
        student.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        student.setForeground(Color.WHITE);
        student.setBackground(Color.BLACK);
        student.setPreferredSize(new Dimension(250, 50));
        student.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        student.addActionListener(this);



        Details = new JMenu("Details");
        Details.setFont(new Font("SansSerif",Font.BOLD,20));
        Details.setForeground(new Color(255,255,255));
        Details.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));


        sDetail = new JMenuItem("Student Details");        
        sDetail.setFont(new Font("SansSerif",Font.BOLD,20));
        ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("Img\\icon3.png"));
        Image image4 = icon4.getImage().getScaledInstance(40, 40,Image.SCALE_DEFAULT);
        sDetail.setIcon(new ImageIcon(image4));
        sDetail.setMnemonic('C');
        sDetail.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        sDetail.setForeground(Color.WHITE);
        sDetail.setBackground(Color.BLACK);
        sDetail.setPreferredSize(new Dimension(250, 50));
        sDetail.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        
        tDetail = new JMenuItem("Teacher Details");
        tDetail.setFont(new Font("SansSerif",Font.BOLD,20));
        ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("Img\\icon4.png"));
        Image image5 = icon5.getImage().getScaledInstance(40, 40,Image.SCALE_DEFAULT);
        tDetail.setIcon(new ImageIcon(image5));
        tDetail.setMnemonic('D');
        tDetail.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        tDetail.setForeground(Color.WHITE);
        tDetail.setBackground(Color.BLACK);
        tDetail.setPreferredSize(new Dimension(250, 50));
        tDetail.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

        attendance = new JMenu("Attendance");
        attendance.setFont(new Font("SansSerif",Font.BOLD,20));
        attendance.setForeground(new Color(255,255,255));
        attendance.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));


        sAttendence = new JMenuItem("Student Attendance");        
        sAttendence.setFont(new Font("SansSerif",Font.BOLD,20));
        ImageIcon icon23 = new ImageIcon(ClassLoader.getSystemResource("Img\\icon14.png"));
        Image image24 = icon23.getImage().getScaledInstance(40, 40,Image.SCALE_DEFAULT);
        sAttendence.setIcon(new ImageIcon(image24));
        sAttendence.setMnemonic('M');
        sAttendence.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, ActionEvent.ALT_MASK));
        sAttendence.setForeground(Color.WHITE);
        sAttendence.setBackground(Color.BLACK);
        sAttendence.setPreferredSize(new Dimension(300, 50));
        sAttendence.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        

        tAttendence = new JMenuItem("Teacher Attendance");
        tAttendence.setFont(new Font("SansSerif",Font.BOLD,20));
        ImageIcon icon25 = new ImageIcon(ClassLoader.getSystemResource("Img\\icon15.png"));
        Image image26 = icon25.getImage().getScaledInstance(40, 40,Image.SCALE_DEFAULT);
        tAttendence.setIcon(new ImageIcon(image26));
        tAttendence.setMnemonic('N');
        tAttendence.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
        tAttendence.setForeground(Color.WHITE);
        tAttendence.setBackground(Color.BLACK);
        tAttendence.setPreferredSize(new Dimension(300, 50));
        tAttendence.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));




        attendance_detail = new JMenu("Attendance Details");
        attendance_detail.setFont(new Font("SansSerif",Font.BOLD,20));
        attendance_detail.setForeground(new Color(255,255,255));
        attendance_detail.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));



        sAttendanceDetail = new JMenuItem("Student Attendance Detail");        
        sAttendanceDetail.setFont(new Font("SansSerif",Font.BOLD,20));
        ImageIcon icon27 = new ImageIcon(ClassLoader.getSystemResource("Img\\icon15.png"));
        Image image28 = icon27.getImage().getScaledInstance(40, 40,Image.SCALE_DEFAULT);
        sAttendanceDetail.setIcon(new ImageIcon(image28));
        sAttendanceDetail.setMnemonic('O');
        sAttendanceDetail.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        sAttendanceDetail.setForeground(Color.WHITE);
        sAttendanceDetail.setBackground(Color.BLACK);
        sAttendanceDetail.setPreferredSize(new Dimension(350, 50));
        sAttendanceDetail.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

        
        
        tAttendanceDetail = new JMenuItem("Teacher Attendance Detail");
        tAttendanceDetail.setFont(new Font("SansSerif",Font.BOLD,20));
        ImageIcon icon29 = new ImageIcon(ClassLoader.getSystemResource("Img\\icon14.png"));
        Image image30 = icon29.getImage().getScaledInstance(40, 40,Image.SCALE_DEFAULT);
        tAttendanceDetail.setIcon(new ImageIcon(image30));
        tAttendanceDetail.setMnemonic('P');
        tAttendanceDetail.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        tAttendanceDetail.setForeground(Color.WHITE);
        tAttendanceDetail.setBackground(Color.BLACK);
        tAttendanceDetail.setPreferredSize(new Dimension(350, 50));
        tAttendanceDetail.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

        

        
        updateDetails = new JMenu("Update Details");
        updateDetails.setFont(new Font("SansSerif",Font.BOLD,20));
        updateDetails.setForeground(new Color(255,255,255));
        updateDetails.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));




        studentUpdate = new JMenuItem("Update Students");        
        studentUpdate.setFont(new Font("SansSerif",Font.BOLD,20));
        ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("Img\\icon5.png"));
        Image image7 = icon7.getImage().getScaledInstance(40, 40,Image.SCALE_DEFAULT);
        studentUpdate.setIcon(new ImageIcon(image7));
        studentUpdate.setMnemonic('E');
        studentUpdate.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        studentUpdate.setForeground(Color.WHITE);
        studentUpdate.setBackground(Color.BLACK);
        studentUpdate.setPreferredSize(new Dimension(280, 50));
        studentUpdate.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        
        
        teacherUpdate = new JMenuItem("Update Teachers");
        teacherUpdate.setFont(new Font("SansSerif",Font.BOLD,20));
        ImageIcon iconn = new ImageIcon(ClassLoader.getSystemResource("Img\\icon6.png"));
        Image imagee = iconn.getImage().getScaledInstance(40, 40,Image.SCALE_DEFAULT);
        teacherUpdate.setIcon(new ImageIcon(imagee));
        teacherUpdate.setMnemonic('F');
        teacherUpdate.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        teacherUpdate.setForeground(Color.WHITE);
        teacherUpdate.setBackground(Color.BLACK);
        teacherUpdate.setPreferredSize(new Dimension(280, 50));
        teacherUpdate.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));



      
        feeDetails = new JMenu("Fee Details");
        feeDetails.setFont(new Font("SansSerif",Font.BOLD,20));
        feeDetails.setForeground(new Color(255,255,255));
        feeDetails.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));


        f1 = new JMenuItem("Fee Structure");
        f1.setFont(new Font("SansSerif",Font.BOLD,20));
        ImageIcon icon14 = new ImageIcon(ClassLoader.getSystemResource("Img\\icon7.png"));
        Image image15 = icon14.getImage().getScaledInstance(40, 40,Image.SCALE_DEFAULT);
        f1.setIcon(new ImageIcon(image15));
        f1.setMnemonic('G');
        f1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        f1.setForeground(Color.WHITE);
        f1.setBackground(Color.BLACK);
        f1.setPreferredSize(new Dimension(250, 50));
        f1.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

        
        
        f2 = new JMenuItem("Fee Form");
        f2.setFont(new Font("SansSerif",Font.BOLD,20));
        ImageIcon icon16 = new ImageIcon(ClassLoader.getSystemResource("Img\\icon8.png"));
        Image image17 = icon16.getImage().getScaledInstance(40, 40,Image.SCALE_DEFAULT);
        f2.setIcon(new ImageIcon(image17));
        f2.setMnemonic('H');
        f2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        f2.setForeground(Color.WHITE);
        f2.setBackground(Color.BLACK);
        f2.setPreferredSize(new Dimension(250, 50));
        f2.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        


        examination = new JMenu("Examination");
        examination.setFont(new Font("SansSerif",Font.BOLD,20));
        examination.setForeground(new Color(255,255,255));
        examination.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));



        e1 = new JMenuItem("Exam Detail");        
        e1.setFont(new Font("SansSerif",Font.BOLD,20));
        ImageIcon icon30 = new ImageIcon(ClassLoader.getSystemResource("Img\\icon16.png"));
        Image image31 = icon30.getImage().getScaledInstance(40, 40,Image.SCALE_DEFAULT);
        e1.setIcon(new ImageIcon(image31));
        e1.setMnemonic('Q');
        e1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        e1.setForeground(Color.WHITE);
        e1.setBackground(Color.BLACK);
        e1.setPreferredSize(new Dimension(250, 50));
        e1.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        



        e2 = new JMenuItem("Enter Marks");
        e2.setFont(new Font("SansSerif",Font.BOLD,20));
        ImageIcon icon32 = new ImageIcon(ClassLoader.getSystemResource("Img\\icon17.png"));
        Image image33 = icon32.getImage().getScaledInstance(40, 40,Image.SCALE_DEFAULT);
        e2.setIcon(new ImageIcon(image33));
        e2.setMnemonic('R');
        e2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        e2.setForeground(Color.WHITE);
        e2.setBackground(Color.BLACK);
        e2.setPreferredSize(new Dimension(250, 50));
        e2.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        

               
        
        about = new JMenu("About");
        about.setFont(new Font("SansSerif",Font.BOLD,20));
        about.setForeground(new Color(255,255,255));
        about.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));



        aboutus = new JMenuItem("About Us");                
        aboutus.setFont(new Font("SansSerif",Font.BOLD,20));
        ImageIcon icon21 = new ImageIcon(ClassLoader.getSystemResource("Img\\icon13.png"));
        Image image22 = icon21.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        aboutus.setIcon(new ImageIcon(image22));
        aboutus.setMnemonic('L');
        aboutus.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        aboutus.setForeground(Color.WHITE);
        aboutus.setBackground(Color.BLACK);
        aboutus.setPreferredSize(new Dimension(180, 50));
        aboutus.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));


        
        addmision.add(faculty);
        addmision.add(student);
        
        Details.add(sDetail);
        Details.add(tDetail);
        
        attendance.add(sAttendence);
        attendance.add(tAttendence);
        
        attendance_detail.add(sAttendanceDetail);
        attendance_detail.add(tAttendanceDetail);
        
        updateDetails.add(studentUpdate);
        updateDetails.add(teacherUpdate);
        
        feeDetails.add(f1);
        feeDetails.add(f2);
        
        examination.add(e1);
        examination.add(e2);
        
        about.add(aboutus);



        
        menuBar.add(item);
        menuBar.add(addmision);
        menuBar.add(Details);
        menuBar.add(attendance);
        menuBar.add(attendance_detail);
        menuBar.add(updateDetails);
        menuBar.add(feeDetails);
        menuBar.add(examination);
        menuBar.add(about);
        menuBar.add(Box.createHorizontalGlue()); 
        menuBar.add(Box.createHorizontalGlue()); 
        fr.setJMenuBar(menuBar);

        menuBar.setBackground(new Color(0, 0, 0));
        menuBar.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        

    }



        public void actionPerformed(ActionEvent ae){
            String msg = ae.getActionCommand();
            if(msg.equals("New Faculty")){
                new NewFaculty();
            }
            else if(msg.equals("New Student")){
                new NewStudent();
            }
        }

        
    

    public static void main(String[] args) {
        new t();
    }
}
