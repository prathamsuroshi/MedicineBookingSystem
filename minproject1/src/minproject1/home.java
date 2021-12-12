package minproject1;

import java.awt.EventQueue;

import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.SystemColor;
import java.awt.Window;
import javax.swing.UIManager;
import javax.swing.ImageIcon;

public class home {

	private JFrame frmMedicineBookingSystem;
	private JTextField txtmname;
	private JTextField txtcompany;
	private JTextField txtquantity;
	private JTable table;
	private JTextField txtmid;
	
		public home() {
			initialize();
			Connect();
		    table_load();
			}
		
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		
		public void Connect()
		    {
		        try {
		            Class.forName("com.mysql.cj.jdbc.Driver");
		            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinemedicinebooking","root","prathamsuroshi");
		        }
		        catch (ClassNotFoundException ex)
		        {
		        	ex.printStackTrace();
		        }
		        catch (SQLException ex)
		        {
		        	ex.printStackTrace();
		        }
		 
		    }
		
  public void table_load()
    {
     try
     {
    pst = con.prepareStatement("select * from medicine");
    rs = pst.executeQuery();
    table.setModel(DbUtils.resultSetToTableModel(rs));
    }
     catch (SQLException e)
     {
     e.printStackTrace();
     }
    }
			
		private void initialize() {
		frmMedicineBookingSystem = new JFrame();
		frmMedicineBookingSystem.setTitle("Medicine Booking System");
		frmMedicineBookingSystem.setBackground(SystemColor.activeCaptionBorder);
		frmMedicineBookingSystem.getContentPane().setBackground(SystemColor.inactiveCaption);
		frmMedicineBookingSystem.getContentPane().setForeground(new Color(102, 205, 170));
		frmMedicineBookingSystem.setBounds(100, 100, 907, 592);
		frmMedicineBookingSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMedicineBookingSystem.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Medicine Booking System");
		lblNewLabel.setBackground(new Color(153, 102, 102));
		lblNewLabel.setForeground(new Color(0, 128, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setBounds(283, 10, 454, 67);
		frmMedicineBookingSystem.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.info);
		panel.setBounds(49, 103, 370, 262);
		frmMedicineBookingSystem.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Medicine name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 48, 162, 37);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("company name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(11, 113, 162, 37);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Quantity");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(10, 183, 162, 37);
		panel.add(lblNewLabel_1_2);
		
		txtmname = new JTextField();
		txtmname.setBackground(UIManager.getColor("FormattedTextField.inactiveForeground"));
		txtmname.setBounds(164, 56, 167, 26);
		panel.add(txtmname);
		txtmname.setColumns(10);
		
		txtcompany = new JTextField();
		txtcompany.setBackground(UIManager.getColor("FormattedTextField.inactiveForeground"));
		txtcompany.setColumns(10);
		txtcompany.setBounds(164, 121, 167, 26);
		panel.add(txtcompany);
		
		
		txtquantity = new JTextField();
		txtquantity.setBackground(UIManager.getColor("FormattedTextField.inactiveForeground"));
		txtquantity.setColumns(10);
		txtquantity.setBounds(164, 183, 167, 26);
		panel.add(txtquantity);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBackground(UIManager.getColor("Button.background"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mname,cname,quantity;
				
				mname = txtmname.getText();
			    cname = txtcompany.getText();
				quantity = txtquantity.getText();
				
				try {
					pst = con.prepareStatement("insert into medicine (name,company,quantity) values(?,?,?)");
					pst.setString(1, mname);
					pst.setString(2, cname);
					pst.setString(3, quantity);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Record Addedddd!!!!!");
					table_load();
					          
					txtmname.setText("");
					txtcompany.setText("");
					txtquantity.setText("");
					txtmname.requestFocus();
					   }
					 
					catch (SQLException e1)
					        {
					e1.printStackTrace();
			                }
				}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(104, 400, 96, 38);
		frmMedicineBookingSystem.getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("Book");
		btnExit.setBackground(UIManager.getColor("Button.background"));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMedicineBookingSystem.setVisible(false);
				new logout2();
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnExit.setBounds(750, 466, 96, 38);
		frmMedicineBookingSystem.getContentPane().add(btnExit);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBackground(UIManager.getColor("Button.background"));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtmname.setText("");
				txtcompany.setText("");
				txtquantity.setText("");
				txtmname.requestFocus();
				
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnClear.setBounds(240, 400, 96, 38);
		frmMedicineBookingSystem.getContentPane().add(btnClear);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBounds(454, 103, 392, 296);
		frmMedicineBookingSystem.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.control);
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(49, 466, 361, 67);
		frmMedicineBookingSystem.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Medicine id");
		lblNewLabel_1_1_1.setBounds(52, 24, 87, 19);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(lblNewLabel_1_1_1);
		
		txtmid = new JTextField();
		txtmid.setBackground(UIManager.getColor("FormattedTextField.inactiveForeground"));
		txtmid.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try {
			          
		            String id = txtmid.getText();
		 
		                pst = con.prepareStatement("select name,company,quantity from medicine where id = ?");
		                pst.setString(1, id);
		                ResultSet rs = pst.executeQuery();
		 
		            if(rs.next()==true)
		            {
		              
		                String name = rs.getString(1);
		                String company = rs.getString(2);
		                String quantity = rs.getString(3);
		                
		                txtmname.setText(name);
		                txtcompany.setText(company);
		                txtquantity.setText(quantity);
		                
		                
		            }  
		            else
		            {
		             txtmname.setText("");
		             txtcompany.setText("");
		             txtquantity.setText("");
		                
		            }
		 
		        }
		catch (SQLException ex) {
		          
		        }
				
			}
		});
		txtmid.setColumns(10);
		txtmid.setBounds(168, 23, 167, 26);
		panel_1.add(txtmid);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\ASUS\\OneDrive\\Pictures\\search1.jpg"));
		lblNewLabel_3.setBounds(10, 19, 33, 32);
		panel_1.add(lblNewLabel_3);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBackground(UIManager.getColor("Button.background"));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mname,company,quantity,mid;
				mname = txtmname.getText();
				company = txtcompany.getText();
				quantity = txtquantity.getText();
				mid  = txtmid.getText();
				try {
				pst = con.prepareStatement("update medicine set name= ?,company=?,quantity=? where id =?");
				pst.setString(1, mname);
				            pst.setString(2, company);
				            pst.setString(3, quantity);
				            pst.setString(4, mid);
				            pst.executeUpdate();
				            JOptionPane.showMessageDialog(null, "Record Update!!!!!");
				            table_load();
				          
				            txtmname.setText("");
				            txtcompany.setText("");
				            txtquantity.setText("");
				            txtmname.requestFocus();
				}
				 
				            catch (SQLException e1) {
				e1.printStackTrace();
				}
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnUpdate.setBounds(454, 466, 115, 38);
		frmMedicineBookingSystem.getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setForeground(new Color(0, 0, 0));
		btnDelete.setBackground(UIManager.getColor("Button.background"));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 String mid;
				 mid  = txtmid.getText();
				 try {
				 pst = con.prepareStatement("delete from medicine where id =?");
				             pst.setString(1, mid);
				             pst.executeUpdate();
				             JOptionPane.showMessageDialog(null, "Record Delete!!!!!");
				             table_load();
				           
				             txtmname.setText("");
				             txtcompany.setText("");
				             txtquantity.setText("");
				             txtmname.requestFocus();
				 }
				  
				             catch (SQLException e1) {
				 e1.printStackTrace();
				 }
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDelete.setBounds(607, 466, 115, 38);
		frmMedicineBookingSystem.getContentPane().add(btnDelete);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\ASUS\\OneDrive\\Pictures\\medicine3.jpg"));
		lblNewLabel_2.setBounds(211, 10, 62, 67);
		frmMedicineBookingSystem.getContentPane().add(lblNewLabel_2);
		frmMedicineBookingSystem.setVisible(true);
	}
		public static void main(String[] args) {
			new home();
		}
}
