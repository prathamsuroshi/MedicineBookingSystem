package minproject1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Label;

public class aboutus  {

	private JPanel contentPane;
	
	public static void main(String [] args)
	{
		new aboutus();
		
	}
		
	aboutus()
	{
		JFrame f = new JFrame();
		f.setAlwaysOnTop(true);
		f.getContentPane().setForeground(Color.WHITE);
		f.getContentPane().setBackground(new Color(245, 245, 220));
		f.setTitle("medicine booking System");
		
		f.setBounds(100, 100, 814, 457);
		
		f.setBounds(100, 100, 828, 469);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(null);
		
		JTextPane txtpnThanksForBooking = new JTextPane();
		txtpnThanksForBooking.setEditable(false);
		txtpnThanksForBooking.setBackground(UIManager.getColor("Button.background"));
		txtpnThanksForBooking.setForeground(new Color(0, 0, 0));
		txtpnThanksForBooking.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtpnThanksForBooking.setText("\r\n\r\n   Contact :              5216337387\r\n                               6581731127\r\n\r\n\r\n\r\n   Email :        medicinsys@gmail.com\r\n                                ");
		txtpnThanksForBooking.setBounds(128, 38, 422, 282);
		f.getContentPane().add(txtpnThanksForBooking);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setBackground(UIManager.getColor("Button.background"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				f.setVisible(false);
				new mainhome();
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(270, 345, 154, 39);
		f.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ASUS\\OneDrive\\Pictures\\aboutus1.jpg"));
		lblNewLabel.setBounds(0, 0, 814, 432);
		f.getContentPane().add(lblNewLabel);
		
		f.setVisible(true);
	}
}

	


		

