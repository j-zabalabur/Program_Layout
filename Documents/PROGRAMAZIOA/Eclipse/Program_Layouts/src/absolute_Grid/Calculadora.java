package absolute_Grid;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.DropMode;

public class Calculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel frame_absolute;
	private JPanel buttons;
	private JTextField display;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 500);
		frame_absolute = new JPanel();
		frame_absolute.setBackground(new Color(192, 192, 192));
		frame_absolute.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(frame_absolute);
		frame_absolute.setLayout(null);
		
		display = new JTextField();
		display.setDropMode(DropMode.INSERT);
		display.setEditable(false);
		display.setBounds(10, 11, 314, 80);
		frame_absolute.add(display);
		display.setColumns(10);
		
		JPanel buttons_grid = new JPanel();
		buttons_grid.setBounds(10, 102, 314, 348);
		frame_absolute.add(buttons_grid);
		buttons_grid.setLayout(new GridLayout(0, 4, 0, 0));
		
		JButton btnNewButton = new JButton("C");
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttons_grid.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 25));
		buttons_grid.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setFont(new Font("Dialog", Font.PLAIN, 25));
		buttons_grid.add(btnNewButton_2);
		
		JButton btn_mas = new JButton("+");
		btn_mas.setFont(new Font("Dialog", Font.PLAIN, 25));
		buttons_grid.add(btn_mas);
		
		JButton btn_7 = new JButton("7");
		btn_7.setBackground(new Color(0, 0, 0));
		btn_7.setFont(new Font("Dialog", Font.PLAIN, 25));
		buttons_grid.add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.setBackground(new Color(0, 0, 0));
		btn_8.setFont(new Font("Dialog", Font.PLAIN, 25));
		buttons_grid.add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.setBackground(new Color(0, 0, 0));
		btn_9.setFont(new Font("Dialog", Font.PLAIN, 25));
		buttons_grid.add(btn_9);
		
		JButton btn_menos = new JButton("-");
		btn_menos.setFont(new Font("Dialog", Font.PLAIN, 25));
		buttons_grid.add(btn_menos);
		
		JButton btn_4 = new JButton("4");
		btn_4.setBackground(new Color(0, 0, 0));
		btn_4.setFont(new Font("Dialog", Font.PLAIN, 25));
		buttons_grid.add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.setBackground(new Color(0, 0, 0));
		btn_5.setFont(new Font("Dialog", Font.PLAIN, 25));
		buttons_grid.add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.setBackground(new Color(0, 0, 0));
		btn_6.setFont(new Font("Dialog", Font.PLAIN, 25));
		buttons_grid.add(btn_6);
		
		JButton btn_division = new JButton("/");
		btn_division.setFont(new Font("Dialog", Font.PLAIN, 25));
		buttons_grid.add(btn_division);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numero=display.getText()+btn_1.getText();
				display.setText(numero);
			}
		});
		btn_1.setBackground(new Color(0, 0, 0));
		btn_1.setFont(new Font("Dialog", Font.PLAIN, 25));
		buttons_grid.add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.setBackground(new Color(0, 0, 0));
		btn_2.setFont(new Font("Dialog", Font.PLAIN, 25));
		buttons_grid.add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.setBackground(new Color(0, 0, 0));
		btn_3.setFont(new Font("Dialog", Font.PLAIN, 25));
		buttons_grid.add(btn_3);
		
		JButton btn_multiplicacion = new JButton("*");
		btn_multiplicacion.setFont(new Font("Dialog", Font.PLAIN, 25));
		buttons_grid.add(btn_multiplicacion);
		
		JButton btn_coma = new JButton(".");
		btn_coma.setFont(new Font("Dialog", Font.PLAIN, 25));
		buttons_grid.add(btn_coma);
		
		JButton btn_0 = new JButton("0");
		btn_0.setBackground(new Color(0, 0, 0));
		btn_0.setFont(new Font("Dialog", Font.PLAIN, 25));
		buttons_grid.add(btn_0);
		
		JButton btn_igual = new JButton("=");
		btn_igual.setFont(new Font("Dialog", Font.PLAIN, 25));
		buttons_grid.add(btn_igual);
		
		JButton btn_suma = new JButton("+");
		btn_suma.setFont(new Font("Dialog", Font.PLAIN, 25));
		buttons_grid.add(btn_suma);
		setContentPane(buttons);
	}
}
