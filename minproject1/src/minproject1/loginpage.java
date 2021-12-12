package minproject1;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
    public class loginpage {
	private JTextField username;
	private JTextField password;
	private JButton btnLoginHere;
	private JTextField textField;
	private JTextField textField_1;
	loginpage()
	{
		JFrame f = new JFrame();
		f.setAlwaysOnTop(true);
		f.setBackground(SystemColor.activeCaptionBorder);
		f.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		f.setTitle("medicine booking System");
		
		//f.setBounds(100, 100, 787, 688);
		
		f.setBounds(100, 100, 841, 506);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.PINK);
		panel.setFont(new Font("Copperplate Gothic Light", Font.BOLD, 20));
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBounds(393, 48, 424, 359);
		f.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel111 = new JLabel("USERNAME");
		lblNewLabel111.setBounds(82, 90, 131, 36);
		lblNewLabel111.setForeground(Color.BLACK);
		lblNewLabel111.setFont(new Font("Garamond", Font.BOLD, 20));
		panel.add(lblNewLabel111);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(82, 172, 131, 36);
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setFont(new Font("Garamond", Font.BOLD, 20));
		panel.add(lblPassword);
		
		username = new JTextField();
		username.setBounds(215, 90, 183, 36);
		username.setForeground(Color.BLACK);
		username.setFont(new Font("Garamond", Font.BOLD, 20));
		panel.add(username);
		username.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(215, 172, 183, 36);
		password.setForeground(Color.BLACK);
		password.setFont(new Font("Copperplate Gothic Light", Font.BOLD, 20));
		password.setColumns(10);
		panel.add(password);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(125, -31, 131, 36);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(null);
		panel.add(lblNewLabel_1);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.setBounds(226, 273, 172, 47);
		panel.add(btnRegister);
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				f.setVisible(false);
				new signuppage();
			}
		});
		btnRegister.setForeground(Color.BLACK);
		btnRegister.setFont(new Font("Garamond", Font.BOLD, 25));
		btnRegister.setBackground(SystemColor.menu);
		
				
				btnLoginHere = new JButton("LOGIN");
				btnLoginHere.setBounds(40, 273, 147, 47);
				panel.add(btnLoginHere);
				btnLoginHere.setForeground(Color.BLACK);
				btnLoginHere.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{			
						try {
							
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinemedicinebooking","root","prathamsuroshi");
							java.sql.Statement stmt = con.createStatement();
							String sql = "Select * from login where username='"+username.getText()+"'and password='"+password.getText()+"'";
							ResultSet rs =stmt.executeQuery(sql);
							if(rs.next())
							{   
								f.setVisible(false);
								
							    new mainhome();
								
							}
							else
							{
								JOptionPane.showMessageDialog(null,"Please Enter Correct Username And Password");
							}
						  }
						catch(Exception e1)
						{
							e1.printStackTrace();
						}
					}
				});
				btnLoginHere.setBackground(SystemColor.menu);
				btnLoginHere.setFont(new Font("Garamond", Font.BOLD, 25));
				
				JLabel lblNewLabel_2 = new JLabel("");
				lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\ASUS\\OneDrive\\Pictures\\username1.png"));
				lblNewLabel_2.setBounds(27, 90, 45, 45);
				panel.add(lblNewLabel_2);
				
				JLabel lblNewLabel_2_1 = new JLabel("");
				lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\OneDrive\\Pictures\\Password-icon3.png"));
				lblNewLabel_2_1.setBounds(40, 172, 47, 36);
				panel.add(lblNewLabel_2_1);
				
				JLabel lblNewLabel = new JLabel("Login Page");
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
				lblNewLabel.setBounds(125, 15, 154, 36);
				panel.add(lblNewLabel);
						
						JLabel lblNewLabel_3 = new JLabel("\r\n");
						lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\ASUS\\OneDrive\\Pictures\\login1.png"));
						lblNewLabel_3.setBounds(0, 0, 834, 469);
						f.getContentPane().add(lblNewLabel_3);
		
		
		f.setVisible(true);
		f.setLocationRelativeTo(null);
	}
	public static void main(String [] args)
	{
		new loginpage();
		
	}
	public JTextField getUsername() {
		return username;
	}
	public JTextField getPassword() {
		return password;
	}
	public JButton getBtnLoginHere() {
		return btnLoginHere;
	}
}

