package prueba;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class calcu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calcu frame = new calcu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public calcu() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 200, 185);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		contentPane.add(textField);
		textField.setColumns(15);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 4, 0, 0));
		
		JButton btnNewButton = new JButton("7");
		panel.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("8");
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("9");
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("/");
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("4");
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_4 = new JButton("5");
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_1 = new JButton("6");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_7 = new JButton("*");
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("1");
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("2");
		panel.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("3");
		panel.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("-");
		panel.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton(".");
		panel.add(btnNewButton_12);
		
		JButton btnNewButton_14 = new JButton("0");
		panel.add(btnNewButton_14);
		
		JButton btnNewButton_13 = new JButton("=");
		panel.add(btnNewButton_13);
		
		JButton btnNewButton_15 = new JButton("+");
		panel.add(btnNewButton_15);
	}

}
