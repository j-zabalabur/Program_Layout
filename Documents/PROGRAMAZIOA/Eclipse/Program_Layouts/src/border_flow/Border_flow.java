package border_flow;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Color;

public class Border_flow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField pregunta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Border_flow frame = new Border_flow();
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
	public Border_flow() {
		setResizable(false);
		setTitle("Border_Flow");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(173, 216, 230));
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton btnNewButton_2 = new JButton("Gente");
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Animales");
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Cosas");
		panel.add(btnNewButton_4);
		
		JButton btn_anterior = new JButton("<");
		btn_anterior.setBackground(new Color(255, 255, 255));
		contentPane.add(btn_anterior, BorderLayout.WEST);
		
		JButton btn_siguiente = new JButton(">");
		btn_siguiente.setBackground(new Color(255, 255, 255));
		contentPane.add(btn_siguiente, BorderLayout.EAST);
		
		Image img = new ImageIcon("C:\\Users\\1AW3-25\\Pictures\\foto.jpg").getImage();
		ImageIcon img2=new ImageIcon(img.getScaledInstance(400, 400, Image.SCALE_SMOOTH));
		JLabel label = new JLabel(img2);
		contentPane.add(label);
		
		pregunta = new JTextField();
		pregunta.setBackground(new Color(173, 216, 230));
		pregunta.setEditable(false);
		pregunta.setHorizontalAlignment(SwingConstants.CENTER);
		pregunta.setFont(new Font("Tahoma", Font.BOLD, 20));
		pregunta.setText("¿Que ves en esta imagen?");
		contentPane.add(pregunta, BorderLayout.NORTH);
		pregunta.setColumns(10);
		

	}

}
