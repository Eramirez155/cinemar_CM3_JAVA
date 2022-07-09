package interfazGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clasesMetodos.Clasificacion;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class FormularioClasificacion extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnEliminar;

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
		contentPane.setBackground(new Color(0, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CLASIFICACION");
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(313, 11, 233, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Identificador:");
		lblNewLabel_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(37, 101, 99, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Descripcion:");
		lblNewLabel_2.setFont(new Font("Showcard Gothic", Font.PLAIN, 12));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
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
		lblNewLabel_3.setFont(new Font("Showcard Gothic", Font.PLAIN, 12));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
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
		
		btnNewButton = new JButton("INSERTAR");
		btnNewButton.setFont(new Font("Cooper Black", Font.PLAIN, 11));
		btnNewButton.setForeground(new Color(65, 105, 225));
		btnNewButton.setBounds(91, 227, 112, 23);
		btnNewButton.addActionListener(this);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("Identificador:");
		lblNewLabel_1_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 12));
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setBounds(313, 147, 99, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Descripcion:");
		lblNewLabel_2_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 12));
		lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1.setBounds(313, 193, 86, 14);
		contentPane.add(lblNewLabel_2_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(446, 190, 86, 20);
		contentPane.add(textField_5);
		
		btnNewButton_1 = new JButton("ACTUALIZAR");
		btnNewButton_1.setFont(new Font("Cooper Black", Font.PLAIN, 11));
		btnNewButton_1.setForeground(new Color(65, 105, 225));
		btnNewButton_1.setBounds(358, 255, 141, 23);
		btnNewButton_1.addActionListener(this);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Id_clasifiacion:");
		lblNewLabel_3_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 12));
		lblNewLabel_3_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_1.setBounds(602, 101, 123, 14);
		contentPane.add(lblNewLabel_3_1);
		
	    btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setFont(new Font("Cooper Black", Font.PLAIN, 11));
		btnEliminar.setForeground(new Color(65, 105, 225));
		btnEliminar.setBounds(651, 157, 112, 23);
		btnEliminar.addActionListener(this);
		contentPane.add(btnEliminar);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnNewButton) {
			InsertarClasificacion();
		} else if(e.getSource()==btnNewButton_1) {
			ActualizarClasificacion();
		} else if (e.getSource()==btnEliminar) {
			EliminarClasificacion();
		}
		
	}

	private void EliminarClasificacion() {
		int id_clasificacion = Integer.parseInt(textField_4.getText());
		Clasificacion.elimina_clasificacion(id_clasificacion);
		
	}

	private void ActualizarClasificacion() {
		int id_clasificacion = Integer.parseInt(textField_2.getText());
		String identificador =  textField_3.getText();
		String  descripcion = textField_5.getText();
		Clasificacion.actualizar_clasificacion(id_clasificacion, "'"+identificador+"'", "'"+ descripcion +"'");
		
	}

	private void InsertarClasificacion() {
		String identificador =  textField.getText();
		String  descripcion = textField_1.getText();
		Clasificacion.inserta_clasificacion("'" + identificador + "'","'" + descripcion + "'");
	}

}
