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

public class logout2  {

	private JPanel contentPane;
	
	public static void main(String [] args)
	{
		new logout2();
		
	}
		
	logout2()
	{
		JFrame f = new JFrame();
		f.getContentPane().setEnabled(false);
		f.setAlwaysOnTop(true);
		f.getContentPane().setForeground(Color.WHITE);
		f.getContentPane().setBackground(new Color(245, 245, 220));
		f.setTitle("medicine booking System");
		
		f.setBounds(100, 100, 790, 414);
		
		f.setBounds(100, 100, 828, 469);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(null);
		
		JTextPane txtpnThanksForBooking = new JTextPane();
		txtpnThanksForBooking.setBounds(223, 120, 367, 217);
		txtpnThanksForBooking.setEditable(false);
		txtpnThanksForBooking.setBackground(SystemColor.inactiveCaption);
		txtpnThanksForBooking.setForeground(new Color(0, 0, 0));
		txtpnThanksForBooking.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtpnThanksForBooking.setText("\r\n\r\nThanks for Booking!!!!!.\r\n\r\nYour order will be delivered within 2 days, if any updation has to be done please update it  in 24 hours.");
		f.getContentPane().add(txtpnThanksForBooking);
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.setBounds(322, 372, 154, 39);
		btnNewButton.setBackground(UIManager.getColor("Button.background"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				f.setVisible(false);
				new loginpage();
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setForeground(new Color(0, 0, 0));
		f.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 814, 432);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ASUS\\OneDrive\\Pictures\\backg2.png"));
		f.getContentPane().add(lblNewLabel);
		
		f.setVisible(true);
	}
}

	


		

