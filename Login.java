import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login implements ActionListener {
	JFrame fr;
	JTextField t1;
	JPasswordField Pass;
	JButton Submit,Reset;
	
	public Login(){
		fr = new JFrame("Login Page"); //create frame and give title
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();	//take screensize from user screen
		fr.setSize(screenSize.width,screenSize.height); //set screen size 
		fr.setVisible(true);							//visible frame
		fr.setLayout(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close frame parmanentlty

		JLabel Bg = new JLabel(new ImageIcon("Img\\Login Page.jpg")); //get image from the path
		Bg.setSize(screenSize.width,screenSize.height); //set size of bg image on frame 
		fr.add(Bg); //set backgroung image on frame 

		JLabel Heading = new JLabel("LOGIN");	//Write Heading
		Heading.setBounds(300,130,200,150);
		Heading.setFont(new Font("sans serif",Font.BOLD,45));
        Heading.setForeground(Color.black);
		Bg.add(Heading);

		JLabel User = new JLabel("User Name"); //Write User Name
		User.setBounds(175,300,250,40);
		User.setFont(new Font("serif",Font.BOLD,30));
		User.setForeground(Color.black);
		Bg.add(User);

		t1 = new JTextField(); //TextField to fill user his name
		t1.setBounds(175,340,375,40);
		t1.setFont(new Font("sans serif",Font.BOLD,27));
		t1.setForeground(Color.decode("#356eff"));
		Bg.add(t1);

		JLabel Password = new JLabel("Password");
		Password.setBounds(175,400,200,40);
		Password.setFont(new Font("serif",Font.BOLD,30));
		Password.setForeground(Color.black);
		Bg.add(Password);

		Pass = new JPasswordField();
		Pass.setBounds(175,440,375,40);
		Pass.setFont(new Font("sans serif",Font.BOLD,27));
		Pass.setForeground(Color.decode("#356eff"));
		Bg.add(Pass);

		Submit = new JButton("Submit");
		Submit.setBounds(175,510,150,40);
		Submit.setFont(new Font("sans serif",Font.BOLD,28));
		Submit.setForeground(Color.decode("#ffffff"));
		Submit.setBackground(Color.decode("#356eff"));
		Submit.addActionListener(this);
		Bg.add(Submit);

		Reset = new JButton("Reset");
		Reset.setBounds(400,510,150,40);
		Reset.setFont(new Font("sans serif",Font.BOLD,28));
		Reset.setForeground(Color.decode("#ffffff"));
		Reset.setBackground(Color.decode("#356eff"));
		Reset.addActionListener(this);
		Bg.add(Reset);
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource()==Submit)
		{
			String user,password;
			user = t1.getText();
			password = String.valueOf(Pass.getPassword());

			if(user.equals("Shivam")&&password.equals("1234")){
				new Home();
				fr.dispose();
			}
			else{
				new Error();
				t1.setText("");
				Pass.setText("");   
			}

		}
		else if(e.getSource()==Reset)
		{
			t1.setText("");
			Pass.setText("");
		}
	}
	public static void main(String []z){
		new Login();
	}
}