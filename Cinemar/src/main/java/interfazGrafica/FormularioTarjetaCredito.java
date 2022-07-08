package interfazGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormularioTarjetaCredito extends JFrame {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioTarjetaCredito frame = new FormularioTarjetaCredito();
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
	public FormularioTarjetaCredito() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 358);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTarjetaCredito = new JLabel("Tarjeta credito");
		lblTarjetaCredito.setFont(new Font("Century Schoolbook", Font.BOLD, 21));
		lblTarjetaCredito.setBounds(211, 11, 185, 36);
		contentPane.add(lblTarjetaCredito);
		
		JLabel lblNewLabel = new JLabel("Numero:");
		lblNewLabel.setBounds(35, 69, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Balance:");
		lblNewLabel_1.setBounds(35, 104, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Limite:");
		lblNewLabel_2.setBounds(35, 140, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Banco:");
		lblNewLabel_3.setBounds(35, 180, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(91, 66, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(91, 101, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(91, 137, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(91, 177, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Numero:");
		lblNewLabel_4.setBounds(201, 106, 102, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_1 = new JLabel("Balance:");
		lblNewLabel_1_1.setBounds(201, 141, 102, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Limite:");
		lblNewLabel_2_1.setBounds(201, 177, 102, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Banco:");
		lblNewLabel_3_1.setBounds(201, 211, 102, 14);
		contentPane.add(lblNewLabel_3_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(300, 209, 86, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(300, 175, 86, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(300, 139, 86, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(300, 104, 86, 20);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel_5 = new JLabel("Id_tarjetaCredito:");
		lblNewLabel_5.setBounds(201, 71, 102, 14);
		contentPane.add(lblNewLabel_5);
		
		textField_8 = new JTextField();
		textField_8.setBounds(300, 69, 86, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(509, 66, 86, 20);
		contentPane.add(textField_9);
		
		JLabel lblNewLabel_5_1 = new JLabel("Id_tarjetaCredito:");
		lblNewLabel_5_1.setBounds(407, 69, 102, 14);
		contentPane.add(lblNewLabel_5_1);
		
		JButton btnNewButton = new JButton("INSERTAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(66, 224, 102, 30);
		contentPane.add(btnNewButton);
		
		JButton btnActualizar = new JButton("ACTUALIZAR");
		btnActualizar.setBounds(241, 244, 102, 30);
		contentPane.add(btnActualizar);
		
		JButton btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setBounds(456, 100, 102, 30);
		contentPane.add(btnEliminar);
	}
}
