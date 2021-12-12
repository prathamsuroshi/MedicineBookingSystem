package minproject1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class signuppage {
	private JTextField nametextsield;
	private JTextField phonetextsield;
	private JTextField emailtextsield;
	private JTextField idtextfield;
	private JTextField usernametextfield;
	private JTextField passwordtextfield;
	private JTextField txtaddress;
	signuppage()
	{
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 218, 185));
		f.setBackground(new Color(220, 220, 220));
		f.setBounds(100, 100, 1035, 717);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setTitle("Medicine booking system");
		f.setBounds(100, 100, 1116, 765);
		f.setLocationRelativeTo(null);
		f.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setBounds(406, 121, 69, 38);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Garamond", Font.BOLD, 20));
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("PHONE NO");
		lblNewLabel_1_1.setBounds(406, 187, 117, 30);
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Garamond", Font.BOLD, 20));
		f.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("EMAIL");
		lblNewLabel_1_2.setBounds(406, 242, 82, 38);
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setBackground(UIManager.getColor("CheckBox.darkShadow"));
		lblNewLabel_1_2.setFont(new Font("Garamond", Font.BOLD, 20));
		f.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("ID");
		lblNewLabel_1_3.setBounds(406, 311, 63, 30);
		lblNewLabel_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_3.setFont(new Font("Garamond", Font.BOLD, 20));
		f.getContentPane().add(lblNewLabel_1_3);
		
		nametextsield = new JTextField();
		nametextsield.setBounds(583, 123, 238, 35);
		nametextsield.setBackground(new Color(255, 218, 185));
		nametextsield.setForeground(Color.BLACK);
		nametextsield.setFont(new Font("Garamond", Font.BOLD, 20));
		f.getContentPane().add(nametextsield);
		nametextsield.setColumns(10);
		
		phonetextsield = new JTextField();
		phonetextsield.setBounds(583, 185, 238, 34);
		phonetextsield.setForeground(Color.BLACK);
		phonetextsield.setBackground(new Color(255, 218, 185));
		phonetextsield.setFont(new Font("Garamond", Font.BOLD, 20));
		phonetextsield.setColumns(10);
		f.getContentPane().add(phonetextsield);
		
		emailtextsield = new JTextField();
		emailtextsield.setBounds(583, 245, 238, 33);
		emailtextsield.setForeground(Color.BLACK);
		emailtextsield.setBackground(new Color(255, 218, 185));
		emailtextsield.setFont(new Font("Garamond", Font.BOLD, 20));
		emailtextsield.setColumns(10);
		f.getContentPane().add(emailtextsield);
		
		idtextfield = new JTextField();
		idtextfield.setBounds(583, 311, 238, 30);
		idtextfield.setForeground(Color.BLACK);
		idtextfield.setBackground(new Color(255, 218, 185));
		idtextfield.setFont(new Font("Garamond", Font.BOLD, 20));
		idtextfield.setColumns(10);
		f.getContentPane().add(idtextfield);
		
		JLabel lblNewLabel = new JLabel("Register!");
		lblNewLabel.setBounds(491, 37, 212, 49);
		f.getContentPane().add(lblNewLabel);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Garamond", Font.BOLD, 42));
		
		
		
		JLabel lblNewLabel_1_5_2 = new JLabel("USERNAME");
		lblNewLabel_1_5_2.setBounds(406, 433, 124, 30);
		lblNewLabel_1_5_2.setForeground(Color.BLACK);
		lblNewLabel_1_5_2.setFont(new Font("Garamond", Font.BOLD, 20));
		f.getContentPane().add(lblNewLabel_1_5_2);
		
		usernametextfield = new JTextField();
		usernametextfield.setBounds(583, 433, 238, 30);
		usernametextfield.setForeground(Color.BLACK);
		usernametextfield.setFont(new Font("Garamond", Font.BOLD, 20));
		usernametextfield.setColumns(10);
		usernametextfield.setBackground(new Color(255, 218, 185));
		f.getContentPane().add(usernametextfield);
		
		JLabel lblNewLabel_1_5_2_1 = new JLabel("PASSWORD");
		lblNewLabel_1_5_2_1.setBounds(406, 500, 117, 30);
		lblNewLabel_1_5_2_1.setForeground(Color.BLACK);
		lblNewLabel_1_5_2_1.setFont(new Font("Garamond", Font.BOLD, 20));
		f.getContentPane().add(lblNewLabel_1_5_2_1);
		
		passwordtextfield = new JPasswordField();
		passwordtextfield.setBounds(583, 500, 238, 30);
		passwordtextfield.setForeground(Color.BLACK);
		passwordtextfield.setFont(new Font("Garamond", Font.BOLD, 20));
		passwordtextfield.setColumns(10);
		passwordtextfield.setBackground(new Color(255, 218, 185));
		f.getContentPane().add(passwordtextfield);
		
		JLabel lblNewLabel_1_4 = new JLabel("ADDRESS");
		lblNewLabel_1_4.setBounds(406, 363, 181, 38);
		lblNewLabel_1_4.setForeground(Color.BLACK);
		lblNewLabel_1_4.setFont(new Font("Garamond", Font.BOLD, 20));
		f.getContentPane().add(lblNewLabel_1_4);
		
		txtaddress = new JTextField();
		txtaddress.setBounds(583, 365, 238, 34);
		txtaddress.setForeground(Color.BLACK);
		txtaddress.setFont(new Font("Garamond", Font.BOLD, 20));
		txtaddress.setColumns(10);
		txtaddress.setBackground(new Color(255, 218, 185));
		f.getContentPane().add(txtaddress);
		
		JButton btnNewButton_1_2_3_1_1 = new JButton("SUBMIT!");
		btnNewButton_1_2_3_1_1.setBounds(679, 584, 152, 57);
		btnNewButton_1_2_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try { 
					int flag=1;
				
					int id = Integer.parseInt(idtextfield.getText());
					String phone = phonetextsield.getText();
					String name = nametextsield.getText();
					String email = emailtextsield.getText();
					String username = usernametextfield.getText();
					String password = passwordtextfield.getText();
					String addr=txtaddress.getText();
				
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinemedicinebooking","root","prathamsuroshi");
				java.sql.Statement stmt = con.createStatement();
				String sql = "SELECT * FROM login where username ='" +usernametextfield.getText()+"'and password='"+passwordtextfield.getText()+"'";
				ResultSet rs =stmt.executeQuery(sql);
				while(rs.next())
				{
					String Username = rs.getString("username");
					String Password = rs.getString("password");
					 int Id = rs.getInt("id");
					if(Username.equals(username) && Password.equals(password)&& (Id==id))
					{	
						JOptionPane.showMessageDialog(null,"Same USERNAME,ID, and PASSWORD is already Exist in database");
						flag = 0 ;
						break;
					}
					else if(Password.equals(password))
					{	flag = 0 ;
						JOptionPane.showMessageDialog(null,"Same PASSWORD  Is already Exist in database");
						break;
					}
					else if(Username.equals(username))
					{	flag = 0 ;
						JOptionPane.showMessageDialog(null,"Same USERNAME Is already Exist in database");
						break;
					}
					else if(Id==id)
					{	flag = 0 ;
						JOptionPane.showMessageDialog(null,"Same ID Is already Exist in database");
						break;
					}
					else {
						flag=1;
					}
				}
				if(flag==1)
				{

					String query = "INSERT INTO login (id,username , password ,name,phone ,address,email )"+"VALUES (?,?,?,?,?,?,?)";
					Class.forName("com.mysql.cj.jdbc.Driver");

					PreparedStatement  st = con.prepareStatement(query);
					st.setInt(1, id);
					st.setString(2,username);
					st.setString(3,password);
					st.setString(5, phone);
					st.setString(4, name);
					st.setString(6,addr);
					st.setString(7,email);
					
					st.executeUpdate();
				
					JOptionPane.showMessageDialog(null,"Data Entred Succesfully");
					con.close();
					st.close();
				}
			}
			
			catch(Exception e1)
			{
				System.err.println("Got an Exeception...!!");
				System.err.println(e1.getMessage());
			}
				
				
			}
		});
		btnNewButton_1_2_3_1_1.setForeground(Color.BLACK);
		btnNewButton_1_2_3_1_1.setFont(new Font("Garamond", Font.BOLD, 25));
		btnNewButton_1_2_3_1_1.setBackground(new Color(255, 218, 185));
		f.getContentPane().add(btnNewButton_1_2_3_1_1);
		
		JButton btnNewButton_1_2_3_1_1_1 = new JButton("LOGIN");
		btnNewButton_1_2_3_1_1_1.setBounds(406, 584, 152, 57);
		btnNewButton_1_2_3_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setVisible(false);
				new loginpage();
			}
		});
		btnNewButton_1_2_3_1_1_1.setForeground(Color.BLACK);
		btnNewButton_1_2_3_1_1_1.setFont(new Font("Garamond", Font.BOLD, 25));
		btnNewButton_1_2_3_1_1_1.setBackground(new Color(255, 218, 185));
		f.getContentPane().add(btnNewButton_1_2_3_1_1_1);
		f.setVisible(true);
		f.setVisible(true);
	}
	public static void main(String [] args)
	{
		new signuppage();
	}
}
