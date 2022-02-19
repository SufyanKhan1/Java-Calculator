package gui;

import java.awt.EventQueue;

import java.lang.Math;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Color;

public class calculator {

	private JFrame frame;
	private JTextField textFieldnum1;
	private JTextField textFieldnum2;
	private JTextField textFieldAns;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JLabel lblEnterTwoNumbers;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JLabel lblForTrinometryEnter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 864, 509);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("addition");
		btnNewButton.setForeground(new Color(153, 0, 51));
		btnNewButton.setBounds(150, 208, 103, 33);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1,num2,ans;
				try {
					num1 = Integer.parseInt(textFieldnum1.getText());
					num2 = Integer.parseInt(textFieldnum2.getText());
					ans = num1 + num2;
					textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, "enter valid number");
				}
			}
			
		});
		frame.getContentPane().setLayout(null);
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("multiple");
		btnNewButton_1.setForeground(new Color(153, 0, 51));
		btnNewButton_1.setBounds(364, 208, 113, 33);
		btnNewButton_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1 = Integer.parseInt(textFieldnum1.getText());
					num2 = Integer.parseInt(textFieldnum2.getText());
					ans = num1 * num2;
					textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e1) {
					
				}
			}
		});
		frame.getContentPane().add(btnNewButton_1);
		
		textFieldnum1 = new JTextField();
		textFieldnum1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		textFieldnum1.setForeground(new Color(153, 0, 102));
		textFieldnum1.setBounds(78, 93, 240, 55);
		frame.getContentPane().add(textFieldnum1);
		textFieldnum1.setColumns(10);
		
		textFieldnum2 = new JTextField();
		textFieldnum2.setForeground(new Color(153, 0, 102));
		textFieldnum2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		textFieldnum2.setBounds(468, 93, 231, 55);
		frame.getContentPane().add(textFieldnum2);
		textFieldnum2.setColumns(10);
		
		textFieldAns = new JTextField();
		textFieldAns.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		textFieldAns.setForeground(new Color(153, 51, 153));
		textFieldAns.setBounds(471, 348, 228, 55);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("THE ANSWER IS");
		lblNewLabel.setForeground(new Color(0, 102, 153));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(184, 341, 189, 71);
		frame.getContentPane().add(lblNewLabel);
		
		btnNewButton_2 = new JButton("subtract");
		btnNewButton_2.setForeground(new Color(153, 0, 51));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1 = Integer.parseInt(textFieldnum1.getText());
					num2 = Integer.parseInt(textFieldnum2.getText());
					ans = num1 - num2;
					textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e1) {
					
				}
			}
		});
		btnNewButton_2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		btnNewButton_2.setBounds(150, 275, 103, 33);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("divide");
		btnNewButton_3.setForeground(new Color(153, 0, 51));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1 = Integer.parseInt(textFieldnum1.getText());
					num2 = Integer.parseInt(textFieldnum2.getText());
					ans = num1 / num2;
					
					textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e1) {
					
				}
			}
			
		});
		btnNewButton_3.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		btnNewButton_3.setBounds(364, 273, 113, 33);
		frame.getContentPane().add(btnNewButton_3);
		
		lblEnterTwoNumbers = new JLabel("Enter two numbers and select one option to check your answer");
		lblEnterTwoNumbers.setForeground(new Color(0, 153, 153));
		lblEnterTwoNumbers.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		lblEnterTwoNumbers.setBounds(78, 13, 573, 42);
		frame.getContentPane().add(lblEnterTwoNumbers);
		
		btnNewButton_4 = new JButton("sin");
		btnNewButton_4.setForeground(new Color(0, 102, 102));
		btnNewButton_4.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,radian,sinvalue;
				try {
					num1 = Double.parseDouble(textFieldnum1.getText());
	
					 radian = Math.toRadians(num1);
					sinvalue = Math.sin(radian);
					
					textFieldAns.setText(Double.toString(sinvalue));
				}catch(Exception e2) {
					
				}
			}
		});
		btnNewButton_4.setBounds(568, 211, 103, 26);
		frame.getContentPane().add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("cos");
		btnNewButton_5.setForeground(new Color(0, 102, 153));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,radian,cosvalue;
				try {
					num1 = Double.parseDouble(textFieldnum1.getText());
	
					 radian = Math.toRadians(num1);
					cosvalue = Math.cos(radian);
					
					textFieldAns.setText(Double.toString(cosvalue));
				}catch(Exception e2) {
					
				}
			}
		});
		btnNewButton_5.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		btnNewButton_5.setBounds(568, 278, 103, 26);
		frame.getContentPane().add(btnNewButton_5);
		
		lblForTrinometryEnter = new JLabel("For trinometry enter only one input ");
		lblForTrinometryEnter.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		lblForTrinometryEnter.setForeground(new Color(0, 153, 153));
		lblForTrinometryEnter.setBounds(78, 45, 327, 30);
		frame.getContentPane().add(lblForTrinometryEnter);
	}
}
