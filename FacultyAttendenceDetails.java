import javax.swing.*;
import java.awt.*;

public class FacultyAttendenceDetails {
    JFrame fr;
    JButton b1;
        
    FacultyAttendenceDetails(){

        fr = new JFrame("Faculty Attendence Details");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        fr.setSize(screenSize.width, screenSize.height);
        fr.setVisible(true);
        
        
        
        b1=new JButton("Print");
        // b1.setSize(20,50);
        b1.setFont(new Font("Sans serif",Font.BOLD,25));
        fr.add(b1,"South");
    
    }
    
    public static void main(String[] args){
        new FacultyAttendenceDetails();
    }    
}
