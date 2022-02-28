import javax.swing.*;
// import java.lang.*;
import java.awt.*;
import java.awt.event.*;

public class t implements ActionListener {
	JFrame fr;
	JButton b1,b2;
	JLabel l1;
	JTextField t1;
	JPasswordField pass;
	
	public t() {
		fr = new JFrame("Login Page");
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		fr.setSize(screenSize.width, screenSize.height);
		fr.setLayout(null);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		l1=new JLabel(new ImageIcon("Img\\Login Page.jpg"));
		l1.setSize(screenSize.width,screenSize.height);
		


		  
		t1 = new JTextField();    
    	t1.setBounds(65,300,450,40); 
		t1.setFont(new Font("sans serif",Font.BOLD,25));   
		l1.add(t1);        


		pass = new JPasswordField();   
		pass.setBounds(65,402,450,40);    
		pass.setFont(new Font("times new roman",Font.BOLD,25));
		l1.add(pass);

		b1=new JButton("Submit");
		b1.setBounds(70,480,185,40);
		b1.setBackground(Color.decode("#356EFF"));
		b1.setForeground(Color.decode("#ffffff"));
		b1.setFont(new Font("sans serif",Font.BOLD,28));
		b1.addActionListener(this);
		
		b2=new JButton("Reset");
		b2.setBounds(315,480,185,40);
		b2.setBackground(Color.decode("#356EFF"));
		b2.setForeground(Color.decode("#ffffff"));
		b2.setFont(new Font("sans serif",Font.BOLD,28));
		b2.addActionListener(this);
		
		
		l1.add(b1);
		l1.add(b2);  

		fr.add(l1);
		
	}

		public void  actionPerformed(ActionEvent ae)
	{

		if(ae.getSource()==b1)
		{
			String user,password;
			user = t1.getText();
			password=String.valueOf(pass.getPassword());
			if(user.equals("Shivam")&&password.equals("1234")){
				new Home();
				fr.dispose();
			}
			else{
				new Error();
				t1.setText("");
				pass.setText("");   
			}

		}
		else if(ae.getSource()==b2)
		{
			t1.setText("");
			pass.setText("");
		}

	}

	public static void main(String[] z){
		new t();
	}
}
