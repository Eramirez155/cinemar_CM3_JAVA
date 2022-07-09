package interfazGrafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class FormularioUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_7;
	/**
	 * @wbp.nonvisual location=571,-21
	 */
	private final JPanel contentPane_1 = new JPanel();
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
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioUsuario frame = new FormularioUsuario();
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
	public FormularioUsuario() {
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(new Color(0, 0, 139));
		
		JLabel lblNewLabel_5 = new JLabel("USUARIO");
		lblNewLabel_5.setForeground(Color.YELLOW);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_5.setBounds(280, 11, 131, 19);
		contentPane_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_1_2 = new JLabel("fecha:");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_1_2.setBounds(10, 43, 104, 14);
		contentPane_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("id_pelicula:");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_2_2.setBounds(10, 79, 104, 14);
		contentPane_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("id_sala:");
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_3_2.setBounds(10, 116, 104, 14);
		contentPane_1.add(lblNewLabel_3_2);
		
		JButton btnNewButton_3 = new JButton("Insertar");
		btnNewButton_3.setForeground(new Color(65, 105, 225));
		btnNewButton_3.setFont(new Font("Cooper Black", Font.PLAIN, 11));
		btnNewButton_3.setBounds(56, 175, 89, 23);
		contentPane_1.add(btnNewButton_3);
		
		JButton btnNewButton_1_1 = new JButton("Actualizar");
		btnNewButton_1_1.setForeground(new Color(65, 105, 225));
		btnNewButton_1_1.setFont(new Font("Cooper Black", Font.PLAIN, 11));
		btnNewButton_1_1.setBounds(238, 202, 113, 23);
		contentPane_1.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("Eliminar");
		btnNewButton_2_1.setForeground(new Color(65, 105, 225));
		btnNewButton_2_1.setFont(new Font("Cooper Black", Font.PLAIN, 11));
		btnNewButton_2_1.setBounds(449, 75, 89, 23);
		contentPane_1.add(btnNewButton_2_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(86, 40, 96, 20);
		contentPane_1.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(86, 76, 96, 20);
		contentPane_1.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(86, 113, 96, 20);
		contentPane_1.add(textField_10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("fecha:");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_1_1_1.setBounds(192, 77, 104, 14);
		contentPane_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("id_pelicula:");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_2_1_1.setBounds(192, 113, 104, 14);
		contentPane_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("id_sala:");
		lblNewLabel_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_3_1_1.setBounds(192, 150, 104, 14);
		contentPane_1.add(lblNewLabel_3_1_1);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(282, 152, 96, 20);
		contentPane_1.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(282, 115, 96, 20);
		contentPane_1.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(282, 79, 96, 20);
		contentPane_1.add(textField_13);
		
		JLabel lblNewLabel_4_2 = new JLabel("id_sesion:");
		lblNewLabel_4_2.setForeground(Color.WHITE);
		lblNewLabel_4_2.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_4_2.setBounds(192, 43, 83, 14);
		contentPane_1.add(lblNewLabel_4_2);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(282, 40, 96, 20);
		contentPane_1.add(textField_14);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("id_sesion:");
		lblNewLabel_4_1_1.setForeground(Color.WHITE);
		lblNewLabel_4_1_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_4_1_1.setBounds(413, 43, 83, 14);
		contentPane_1.add(lblNewLabel_4_1_1);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(503, 40, 96, 20);
		contentPane_1.add(textField_15);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 754, 381);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USUARIO");
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(318, 11, 131, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NOMBRE:");
		lblNewLabel_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(10, 43, 104, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("APELLIDO:");
		lblNewLabel_2.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(10, 79, 104, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ES ADMINISTRADOR:");
		lblNewLabel_3.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(10, 116, 131, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Insertar");
		btnNewButton.setFont(new Font("Cooper Black", Font.PLAIN, 11));
		btnNewButton.setForeground(new Color(65, 105, 225));
		btnNewButton.setBounds(65, 271, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Actualizar");
		btnNewButton_1.setFont(new Font("Cooper Black", Font.PLAIN, 11));
		btnNewButton_1.setForeground(new Color(65, 105, 225));
		btnNewButton_1.setBounds(310, 293, 113, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Eliminar");
		btnNewButton_2.setFont(new Font("Cooper Black", Font.PLAIN, 11));
		btnNewButton_2.setForeground(new Color(65, 105, 225));
		btnNewButton_2.setBounds(565, 79, 89, 23);
		contentPane.add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setBounds(131, 43, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(131, 79, 96, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(131, 116, 96, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4_1 = new JLabel("ID_USUARIO:");
		lblNewLabel_4_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_4_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_4_1.setBounds(517, 46, 83, 14);
		contentPane.add(lblNewLabel_4_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(607, 43, 96, 20);
		contentPane.add(textField_7);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(131, 153, 96, 20);
		contentPane.add(textField_16);
		
		JLabel lblNewLabel_1_3 = new JLabel("EMAIL:");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_1_3.setBounds(10, 153, 104, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_2_3 = new JLabel("FECHA_NACIMIENTO:");
		lblNewLabel_2_3.setForeground(Color.WHITE);
		lblNewLabel_2_3.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_2_3.setBounds(10, 189, 131, 14);
		contentPane.add(lblNewLabel_2_3);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(131, 189, 96, 20);
		contentPane.add(textField_17);
		
		JLabel lblNewLabel_3_3 = new JLabel("id_sala:");
		lblNewLabel_3_3.setForeground(Color.WHITE);
		lblNewLabel_3_3.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_3_3.setBounds(10, 226, 104, 14);
		contentPane.add(lblNewLabel_3_3);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(131, 226, 96, 20);
		contentPane.add(textField_18);
		
		JLabel lblNewLabel_1_1 = new JLabel("NOMBRE:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_1_1.setBounds(263, 82, 104, 14);
		contentPane.add(lblNewLabel_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(388, 79, 96, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(388, 115, 96, 20);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_2_1 = new JLabel("APELLIDO:");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_2_1.setBounds(263, 118, 104, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("ES ADMINISTRADOR:");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_3_1.setBounds(263, 155, 131, 14);
		contentPane.add(lblNewLabel_3_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(388, 152, 96, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(388, 189, 96, 20);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("fecha:");
		lblNewLabel_1_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_3_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_1_3_1.setBounds(263, 192, 104, 14);
		contentPane.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("id_pelicula:");
		lblNewLabel_2_3_1.setForeground(Color.WHITE);
		lblNewLabel_2_3_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_2_3_1.setBounds(263, 228, 104, 14);
		contentPane.add(lblNewLabel_2_3_1);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(388, 225, 96, 20);
		contentPane.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(388, 262, 96, 20);
		contentPane.add(textField_20);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("id_sala:");
		lblNewLabel_3_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_3_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_3_3_1.setBounds(263, 265, 104, 14);
		contentPane.add(lblNewLabel_3_3_1);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("ID_USUARIO:");
		lblNewLabel_4_1_2.setForeground(Color.WHITE);
		lblNewLabel_4_1_2.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_4_1_2.setBounds(263, 44, 83, 14);
		contentPane.add(lblNewLabel_4_1_2);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(388, 43, 96, 20);
		contentPane.add(textField_21);
	}
}