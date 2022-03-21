import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Error{
    Error(){
        String message = "Invalid User Name Or Password"+"\n"+"              Try Again";
        JOptionPane.showMessageDialog(new JFrame(),message,"Error!",JOptionPane.ERROR_MESSAGE);
    }
    public static void main(String[] args){
        new Error();
    }
}