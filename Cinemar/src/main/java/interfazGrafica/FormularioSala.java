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

public class FormularioSala extends JFrame {

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
					FormularioSala frame = new FormularioSala();
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
	public FormularioSala() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 846, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sala");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.BOLD, 22));
		lblNewLabel.setBounds(341, 11, 160, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Formato:");
		lblNewLabel_1.setBounds(46, 108, 80, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Capacidad:");
		lblNewLabel_2.setBounds(46, 158, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(142, 56, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(142, 105, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(142, 155, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Numero:");
		lblNewLabel_3.setBounds(46, 59, 80, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("INSERTAR");
		btnNewButton.setBounds(85, 209, 115, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3_1 = new JLabel("Numero:");
		lblNewLabel_3_1.setBounds(298, 111, 80, 14);
		contentPane.add(lblNewLabel_3_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(394, 108, 86, 20);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("Formato:");
		lblNewLabel_1_1.setBounds(298, 160, 80, 14);
		contentPane.add(lblNewLabel_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(394, 157, 86, 20);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_2_1 = new JLabel("Capacidad:");
		lblNewLabel_2_1.setBounds(298, 210, 86, 14);
		contentPane.add(lblNewLabel_2_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(394, 207, 86, 20);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_4 = new JLabel("Id_sala:");
		lblNewLabel_4.setBounds(298, 59, 66, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_6 = new JTextField();
		textField_6.setBounds(394, 56, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("ACTUALIZAR");
		btnNewButton_1.setBounds(341, 260, 115, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Id_sala:");
		lblNewLabel_4_1.setBounds(561, 59, 66, 14);
		contentPane.add(lblNewLabel_4_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(657, 56, 86, 20);
		contentPane.add(textField_7);
		
		JButton btnNewButton_2 = new JButton("ELIMINAR");
		btnNewButton_2.setBounds(606, 107, 89, 23);
		contentPane.add(btnNewButton_2);
	}

}
