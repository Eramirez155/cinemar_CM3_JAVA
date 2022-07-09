package interfazGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;

public class FormularioSesion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioSesion frame = new FormularioSesion();
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
	public FormularioSesion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SESION");
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(280, 11, 98, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("fecha:");
		lblNewLabel_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(10, 43, 104, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("id_pelicula:");
		lblNewLabel_2.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(10, 79, 104, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("id_sala:");
		lblNewLabel_3.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(10, 116, 104, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Insertar");
		btnNewButton.setFont(new Font("Cooper Black", Font.PLAIN, 11));
		btnNewButton.setForeground(new Color(65, 105, 225));
		btnNewButton.setBounds(25, 149, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Actualizar");
		btnNewButton_1.setFont(new Font("Cooper Black", Font.PLAIN, 11));
		btnNewButton_1.setForeground(new Color(65, 105, 225));
		btnNewButton_1.setBounds(213, 175, 113, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Eliminar");
		btnNewButton_2.setFont(new Font("Cooper Black", Font.PLAIN, 11));
		btnNewButton_2.setForeground(new Color(65, 105, 225));
		btnNewButton_2.setBounds(449, 75, 89, 23);
		contentPane.add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setBounds(86, 40, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(86, 76, 96, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(86, 113, 96, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("fecha:");
		lblNewLabel_1_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setBounds(192, 77, 104, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("id_pelicula:");
		lblNewLabel_2_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1.setBounds(192, 113, 104, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("id_sala:");
		lblNewLabel_3_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_3_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_1.setBounds(192, 150, 104, 14);
		contentPane.add(lblNewLabel_3_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(282, 152, 96, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(282, 115, 96, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(282, 79, 96, 20);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_4 = new JLabel("id_sesion:");
		lblNewLabel_4.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(192, 43, 83, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_6 = new JTextField();
		textField_6.setBounds(282, 40, 96, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_4_1 = new JLabel("id_sesion:");
		lblNewLabel_4_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_4_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_4_1.setBounds(413, 43, 83, 14);
		contentPane.add(lblNewLabel_4_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(503, 40, 96, 20);
		contentPane.add(textField_7);
	}

}