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
import javax.swing.AbstractAction;
import javax.swing.Action;

public class mainhome  {

	private JPanel contentPane;
	
	
	public static void main(String [] args)
	{
		new mainhome();
		
	}
		
	mainhome()
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
		txtpnThanksForBooking.setBounds(243, 25, 242, 32);
		txtpnThanksForBooking.setBackground(UIManager.getColor("Button.background"));
		txtpnThanksForBooking.setForeground(new Color(0, 0, 0));
		txtpnThanksForBooking.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtpnThanksForBooking.setText("Medicine Booking System");
		f.getContentPane().add(txtpnThanksForBooking);
		
		JButton btnNewButton = new JButton("Booking");
		btnNewButton.setBounds(291, 116, 154, 39);
		btnNewButton.setBackground(new Color(240, 240, 240));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				f.setVisible(false);
				new home();
				
	
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setForeground(new Color(0, 0, 0));
		f.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 814, 432);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ASUS\\OneDrive\\Pictures\\mainbackground1.png"));
		f.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Contact us");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setVisible(false);
				new aboutus();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1.setBackground(new Color(240, 240, 240));
		btnNewButton_1.setBounds(291, 196, 154, 39);
		f.getContentPane().add(btnNewButton_1);
		
		
		f.setVisible(true);
	
	}

	
}