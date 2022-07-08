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

public class FormularioPelicula extends JFrame {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioPelicula frame = new FormularioPelicula();
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
	public FormularioPelicula() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 973, 598);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pelicula");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.BOLD, 22));
		lblNewLabel.setBounds(374, 11, 174, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Titulo pelicula:");
		lblNewLabel_1.setBounds(33, 89, 101, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Sipnosis:");
		lblNewLabel_2.setBounds(33, 126, 101, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Genero:");
		lblNewLabel_3.setBounds(33, 169, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Duracion:");
		lblNewLabel_4.setBounds(33, 214, 101, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Actores:");
		lblNewLabel_5.setBounds(33, 257, 101, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Director:");
		lblNewLabel_6.setBounds(33, 298, 101, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Id_tipo_pelicular:");
		lblNewLabel_7.setBounds(33, 341, 101, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Id_clasificacion:");
		lblNewLabel_8.setBounds(33, 383, 101, 14);
		contentPane.add(lblNewLabel_8);
		
		textField = new JTextField();
		textField.setBounds(164, 86, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(164, 123, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(164, 166, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(164, 211, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(164, 254, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(164, 295, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(164, 338, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton = new JButton("INSERTAR");
		btnNewButton.setBounds(76, 438, 124, 23);
		contentPane.add(btnNewButton);
		
		textField_7 = new JTextField();
		textField_7.setBounds(164, 380, 86, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Id_pelicula:");
		lblNewLabel_9.setBounds(351, 89, 86, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_1_1 = new JLabel("Titulo pelicula:");
		lblNewLabel_1_1.setBounds(351, 126, 101, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Sipnosis:");
		lblNewLabel_2_1.setBounds(351, 169, 101, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Genero:");
		lblNewLabel_3_1.setBounds(351, 214, 46, 14);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Duracion:");
		lblNewLabel_4_1.setBounds(351, 257, 101, 14);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("Actores:");
		lblNewLabel_5_1.setBounds(351, 298, 101, 14);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("Director:");
		lblNewLabel_6_1.setBounds(351, 341, 101, 14);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("Id_tipo_pelicula:");
		lblNewLabel_7_1.setBounds(351, 383, 101, 14);
		contentPane.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("Id_clasificacion:");
		lblNewLabel_8_1.setBounds(351, 425, 101, 14);
		contentPane.add(lblNewLabel_8_1);
		
		JButton btnNewButton_1 = new JButton("ACTUALIZAR");
		btnNewButton_1.setBounds(424, 479, 124, 23);
		contentPane.add(btnNewButton_1);
		
		textField_8 = new JTextField();
		textField_8.setBounds(499, 86, 86, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(499, 123, 86, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(499, 166, 86, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(499, 211, 86, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(499, 254, 86, 20);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(499, 295, 86, 20);
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(499, 338, 86, 20);
		contentPane.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(499, 380, 86, 20);
		contentPane.add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(499, 422, 86, 20);
		contentPane.add(textField_16);
		textField_16.setColumns(10);
		
		JLabel lblNewLabel_9_1 = new JLabel("Id_pelicula:");
		lblNewLabel_9_1.setBounds(703, 89, 86, 14);
		contentPane.add(lblNewLabel_9_1);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(811, 86, 86, 20);
		contentPane.add(textField_17);
		
		JButton btnNewButton_2 = new JButton("ELIMINAR");
		btnNewButton_2.setBounds(757, 136, 89, 23);
		contentPane.add(btnNewButton_2);
	}
}
