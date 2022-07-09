package interfazGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class FormularioCrearCuenta extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioCrearCuenta frame = new FormularioCrearCuenta();
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
	public FormularioCrearCuenta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 807, 431);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CREAR CUENTA");
		lblNewLabel.setForeground(Color.YELLOW);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century", Font.BOLD, 22));
		lblNewLabel.setBounds(193, 0, 264, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 40, 100, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Apellido:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setBounds(10, 65, 100, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("dni:");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setBounds(10, 90, 100, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("FechaDeNacimento:");
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setBounds(10, 115, 152, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("NombreUsuarioFicticio:");
		lblNewLabel_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1.setBounds(10, 140, 170, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Contrase\u00F1a:");
		lblNewLabel_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1_1.setBounds(10, 164, 152, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("ConfirmarContrase\u00F1a:");
		lblNewLabel_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1_1_1.setBounds(10, 189, 170, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("email:");
		lblNewLabel_1_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1_1_1_1.setBounds(10, 214, 152, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1 = new JLabel("Genero:");
		lblNewLabel_1_1_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1_1_1_1_1.setBounds(10, 238, 152, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_1 = new JLabel("ComplejoHabitual:");
		lblNewLabel_1_1_1_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1_1_1_1_1_1.setBounds(10, 263, 152, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("id_usuario:");
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_1.setBounds(10, 288, 152, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1_1_1_1);
		
		textField = new JTextField();
		textField.setBounds(174, 38, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(174, 63, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(174, 88, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(174, 113, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(174, 138, 86, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(174, 162, 86, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(174, 212, 86, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(174, 187, 86, 20);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(174, 236, 86, 20);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(174, 261, 86, 20);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(174, 286, 86, 20);
		contentPane.add(textField_10);
		
		JLabel lblNewLabel_1_2 = new JLabel("Nombre:");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setBounds(284, 66, 100, 14);
		contentPane.add(lblNewLabel_1_2);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(462, 63, 86, 20);
		contentPane.add(textField_11);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Apellido:");
		lblNewLabel_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2.setBounds(284, 91, 100, 14);
		contentPane.add(lblNewLabel_1_1_2);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(462, 88, 86, 20);
		contentPane.add(textField_12);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("dni:");
		lblNewLabel_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2.setBounds(284, 116, 100, 14);
		contentPane.add(lblNewLabel_1_1_1_2);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(462, 113, 86, 20);
		contentPane.add(textField_13);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("FechaDeNacimiento:");
		lblNewLabel_1_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_2.setBounds(284, 141, 173, 14);
		contentPane.add(lblNewLabel_1_1_1_1_2);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(462, 138, 86, 20);
		contentPane.add(textField_14);
		
		JLabel lblNewLabel_1_1_1_1_1_2 = new JLabel("NombreUsuarioFicticio:");
		lblNewLabel_1_1_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1_2.setBounds(284, 165, 173, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_2);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(462, 162, 86, 20);
		contentPane.add(textField_15);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2 = new JLabel("Contrase\u00F1a:");
		lblNewLabel_1_1_1_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1_1_2.setBounds(284, 190, 152, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_2);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(462, 187, 86, 20);
		contentPane.add(textField_16);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_2 = new JLabel("ComfirmarContrase\u00F1a:");
		lblNewLabel_1_1_1_1_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1_1_1_2.setBounds(284, 215, 173, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_2);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(462, 212, 86, 20);
		contentPane.add(textField_17);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_2 = new JLabel("email:");
		lblNewLabel_1_1_1_1_1_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1_1_1_1_2.setBounds(284, 239, 152, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1_2);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(462, 236, 86, 20);
		contentPane.add(textField_18);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_2 = new JLabel("Genero:");
		lblNewLabel_1_1_1_1_1_1_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1_1_1_1_1_2.setBounds(284, 264, 152, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1_1_2);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(462, 261, 86, 20);
		contentPane.add(textField_19);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_1_2 = new JLabel("ComplejoHabitual:");
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_2.setBounds(284, 289, 152, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1_1_1_2);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(462, 286, 86, 20);
		contentPane.add(textField_20);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("id_usuario:");
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(284, 314, 152, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(462, 311, 86, 20);
		contentPane.add(textField_21);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("id_CrearCuenta:");
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setBounds(284, 41, 145, 14);
		contentPane.add(lblNewLabel_1_2_1);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(462, 38, 86, 20);
		contentPane.add(textField_22);
		
		JButton btnNewButton = new JButton("INSERTAR");
		btnNewButton.setBounds(71, 328, 109, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ACTUALIZAR");
		btnNewButton_1.setBounds(358, 347, 109, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("id_CrearCuenta:");
		lblNewLabel_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1_1.setBounds(574, 40, 148, 14);
		contentPane.add(lblNewLabel_1_2_1_1);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(684, 37, 86, 20);
		contentPane.add(textField_23);
		
		JButton btnNewButton_2 = new JButton("ELIMINAR");
		btnNewButton_2.setBounds(617, 65, 89, 23);
		contentPane.add(btnNewButton_2);
	}
}
