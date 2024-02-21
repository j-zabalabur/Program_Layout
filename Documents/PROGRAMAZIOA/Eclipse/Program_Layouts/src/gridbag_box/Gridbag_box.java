package gridbag_box;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.Box;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class Gridbag_box extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtEmail;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPanel panel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private Component horizontalGlue;
	private Component horizontalGlue_1;
	private Component horizontalGlue_2;
	private JTextField txtFormularioDeInscripcin;
	private Component horizontalStrut;
	private Component horizontalStrut_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gridbag_box frame = new Gridbag_box();
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
	public Gridbag_box() {
		setResizable(false);
		setTitle("Gridbag_Box");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 200);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{86, 128, 209, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 20, 20, 20, 36, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		txtFormularioDeInscripcin = new JTextField();
		txtFormularioDeInscripcin.setBackground(new Color(173, 216, 230));
		txtFormularioDeInscripcin.setForeground(Color.BLACK);
		txtFormularioDeInscripcin.setEditable(false);
		txtFormularioDeInscripcin.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtFormularioDeInscripcin.setHorizontalAlignment(SwingConstants.CENTER);
		txtFormularioDeInscripcin.setText("Formulario de inscripción");
		GridBagConstraints gbc_txtFormularioDeInscripcin = new GridBagConstraints();
		gbc_txtFormularioDeInscripcin.gridwidth = 3;
		gbc_txtFormularioDeInscripcin.insets = new Insets(0, 0, 5, 0);
		gbc_txtFormularioDeInscripcin.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFormularioDeInscripcin.gridx = 0;
		gbc_txtFormularioDeInscripcin.gridy = 2;
		contentPane.add(txtFormularioDeInscripcin, gbc_txtFormularioDeInscripcin);
		txtFormularioDeInscripcin.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNombre.setEditable(false);
		txtNombre.setText("Nombre");
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.gridx = 0;
		gbc_txtNombre.gridy = 3;
		contentPane.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 3;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setHorizontalAlignment(SwingConstants.RIGHT);
		txtApellido.setEditable(false);
		txtApellido.setText("Apellido");
		GridBagConstraints gbc_txtApellido = new GridBagConstraints();
		gbc_txtApellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellido.insets = new Insets(0, 0, 5, 5);
		gbc_txtApellido.gridx = 0;
		gbc_txtApellido.gridy = 4;
		contentPane.add(txtApellido, gbc_txtApellido);
		txtApellido.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 2;
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 4;
		contentPane.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		txtEmail.setEditable(false);
		txtEmail.setText("Email");
		txtEmail.setToolTipText("");
		GridBagConstraints gbc_txtEmail = new GridBagConstraints();
		gbc_txtEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEmail.insets = new Insets(0, 0, 5, 5);
		gbc_txtEmail.gridx = 0;
		gbc_txtEmail.gridy = 5;
		contentPane.add(txtEmail, gbc_txtEmail);
		txtEmail.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.gridwidth = 2;
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 5;
		contentPane.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		panel = new JPanel();
		panel.setBackground(new Color(173, 216, 230));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 3;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 6;
		contentPane.add(panel, gbc_panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		horizontalStrut = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut);
		
		btnNewButton = new JButton("Ayuda");
		panel.add(btnNewButton);
		
		horizontalGlue_1 = Box.createHorizontalGlue();
		panel.add(horizontalGlue_1);
		
		btnNewButton_1 = new JButton("Eliminar");
		btnNewButton_1.setBackground(Color.RED);
		panel.add(btnNewButton_1);
		
		horizontalGlue_2 = Box.createHorizontalGlue();
		panel.add(horizontalGlue_2);
		
		btnNewButton_2 = new JButton("Actualizar");
		panel.add(btnNewButton_2);
		
		horizontalGlue = Box.createHorizontalGlue();
		panel.add(horizontalGlue);
		
		btnNewButton_3 = new JButton("Enviar");
		btnNewButton_3.setBackground(Color.GREEN);
		panel.add(btnNewButton_3);
		
		horizontalStrut_1 = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut_1);
	}

}
