import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldAns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(46, 35, 135, 30);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(218, 35, 135, 30);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		textFieldAns = new JTextField();
		textFieldAns.setBounds(218, 166, 114, 44);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		JLabel lblAns = new JLabel("ANS:");
		lblAns.setBounds(184, 180, 70, 15);
		frame.getContentPane().add(lblAns);
		
		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, answ;
				try{
					num1= Integer.parseInt(textFieldNum1.getText());
					num2= Integer.parseInt(textFieldNum2.getText());
					answ= num1+num2;
					textFieldAns.setText(Integer.toString(answ));
					
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, "enter something valid");
				}
			}
		});
		button.setBounds(137, 102, 44, 30);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("-");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, answ;
				try{
					num1= Integer.parseInt(textFieldNum1.getText());
					num2= Integer.parseInt(textFieldNum2.getText());
					answ= num1-num2;
					textFieldAns.setText(Integer.toString(answ));
					
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, "enter something valid");
				}
			}
		});
		button_1.setBounds(193, 102, 44, 30);
		frame.getContentPane().add(button_1);
	}
}
