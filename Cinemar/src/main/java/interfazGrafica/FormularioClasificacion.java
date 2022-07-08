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

public class FormularioClasificacion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioClasificacion frame = new FormularioClasificacion();
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
	public FormularioClasificacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 872, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Clasificacion");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.BOLD, 22));
		lblNewLabel.setBounds(313, 11, 233, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Identificador:");
		lblNewLabel_1.setBounds(37, 101, 99, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Descripcion:");
		lblNewLabel_2.setBounds(37, 147, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(146, 98, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(146, 144, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Id_clasificacion:");
		lblNewLabel_3.setBounds(313, 101, 123, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(446, 98, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(446, 144, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(735, 98, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("INSERTAR");
		btnNewButton.setBounds(91, 227, 112, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("Identificador:");
		lblNewLabel_1_1.setBounds(313, 147, 99, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Descripcion:");
		lblNewLabel_2_1.setBounds(313, 193, 86, 14);
		contentPane.add(lblNewLabel_2_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(446, 190, 86, 20);
		contentPane.add(textField_5);
		
		JButton btnActualizar = new JButton("ACTUALIZAR");
		btnActualizar.setBounds(358, 255, 112, 23);
		contentPane.add(btnActualizar);
		
		JLabel lblNewLabel_3_1 = new JLabel("Id_clasifiacion:");
		lblNewLabel_3_1.setBounds(602, 101, 123, 14);
		contentPane.add(lblNewLabel_3_1);
		
		JButton btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setBounds(651, 157, 112, 23);
		contentPane.add(btnEliminar);
	}

}
