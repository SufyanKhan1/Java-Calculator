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
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
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
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 864, 509);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setBackground(UIManager.getColor("Button.background"));
		btnNewButton.setForeground(new Color(153, 0, 51));
		btnNewButton.setBounds(150, 185, 103, 33);
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
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.BOLD, 22));
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("*");
		btnNewButton_1.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_1.setForeground(new Color(153, 0, 51));
		btnNewButton_1.setBounds(150, 268, 113, 33);
		btnNewButton_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 22));
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
		textFieldnum1.setBackground(Color.PINK);
		textFieldnum1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldnum1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		textFieldnum1.setForeground(Color.BLUE);
		textFieldnum1.setBounds(139, 93, 113, 55);
		frame.getContentPane().add(textFieldnum1);
		textFieldnum1.setColumns(10);
		
		textFieldnum2 = new JTextField();
		textFieldnum2.setBackground(Color.PINK);
		textFieldnum2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldnum2.setForeground(Color.BLUE);
		textFieldnum2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		textFieldnum2.setBounds(494, 93, 103, 55);
		frame.getContentPane().add(textFieldnum2);
		textFieldnum2.setColumns(10);
		
		textFieldAns = new JTextField();
		textFieldAns.setBackground(Color.PINK);
		textFieldAns.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldAns.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		textFieldAns.setForeground(Color.BLUE);
		textFieldAns.setBounds(400, 345, 228, 55);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		JLabel lblNewLabel = new JLabel(" ANSWER IS ==>>");
		lblNewLabel.setBackground(Color.PINK);
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Sitka Display", Font.BOLD, 22));
		lblNewLabel.setBounds(184, 341, 189, 71);
		frame.getContentPane().add(lblNewLabel);
		
		btnNewButton_2 = new JButton("-");
		btnNewButton_2.setBackground(UIManager.getColor("Button.background"));
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
		btnNewButton_2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 22));
		btnNewButton_2.setBounds(577, 268, 94, 33);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("/");
		btnNewButton_3.setBackground(UIManager.getColor("Button.background"));
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
		btnNewButton_3.setFont(new Font("Segoe UI Semibold", Font.BOLD, 22));
		btnNewButton_3.setBounds(568, 185, 94, 33);
		frame.getContentPane().add(btnNewButton_3);
		
		lblEnterTwoNumbers = new JLabel("Enter two numbers to operate following calculator");
		lblEnterTwoNumbers.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterTwoNumbers.setForeground(Color.DARK_GRAY);
		lblEnterTwoNumbers.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		lblEnterTwoNumbers.setBounds(78, 13, 573, 42);
		frame.getContentPane().add(lblEnterTwoNumbers);
		
		btnNewButton_4 = new JButton("sine");
		btnNewButton_4.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_4.setForeground(new Color(0, 102, 102));
		btnNewButton_4.setFont(new Font("Segoe UI Semibold", Font.BOLD, 22));
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
		btnNewButton_4.setBounds(374, 185, 103, 29);
		frame.getContentPane().add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("cosine");
		btnNewButton_5.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_5.setForeground(new Color(0, 102, 153));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,radian,cos;
				try {
					num1 = Double.parseDouble(textFieldnum1.getText());
	
					 radian = Math.toRadians(num1);
					 cos = Math.cos(radian);
					
					textFieldAns.setText(Double.toString(cos));
				}catch(Exception e2) {
					
				}
			}
		});
		btnNewButton_5.setFont(new Font("Segoe UI Semibold", Font.BOLD, 22));
		btnNewButton_5.setBounds(374, 271, 103, 30);
		frame.getContentPane().add(btnNewButton_5);
		
		JLabel lblInput = new JLabel("INPUT 1");
		lblInput.setFont(new Font("Rockwell", Font.BOLD, 14));
		lblInput.setHorizontalAlignment(SwingConstants.CENTER);
		lblInput.setBounds(150, 51, 94, 31);
		frame.getContentPane().add(lblInput);
		
		JLabel lblInput_1 = new JLabel("INPUT 2");
		lblInput_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblInput_1.setFont(new Font("Rockwell", Font.BOLD, 14));
		lblInput_1.setBounds(499, 51, 94, 31);
		frame.getContentPane().add(lblInput_1);
	}
}
