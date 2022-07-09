package interfazGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clasesMetodos.CrearCuenta;
import clasesMetodos.TipoPelicula;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class FormularioTipoDePelicula extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JButton btnNewButton;
	private JButton btnActualizar;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioTipoDePelicula frame = new FormularioTipoDePelicula();
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
	public FormularioTipoDePelicula() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 597, 357);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TIPODEPELICULA");
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(206, 0, 241, 65);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Idioma:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(28, 68, 72, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Formato:");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(28, 108, 72, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Subtitulada:");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(28, 145, 72, 14);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(92, 76, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(92, 108, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(92, 142, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(296, 178, 86, 20);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Subtitulada:");
		lblNewLabel_3_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_3_1.setBounds(206, 177, 84, 14);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Formato:");
		lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_2_1.setBounds(206, 140, 84, 14);
		contentPane.add(lblNewLabel_2_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(296, 144, 86, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(296, 112, 86, 20);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_1_1 = new JLabel("Idioma:");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_1_1.setBounds(206, 100, 84, 29);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("Id_tipo_pelicula:");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(206, 76, 84, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_6 = new JTextField();
		textField_6.setBounds(296, 76, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(486, 76, 86, 20);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel_4_1 = new JLabel("Id_tipo_pelicula:");
		lblNewLabel_4_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_4_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_4_1.setBounds(396, 76, 84, 14);
		contentPane.add(lblNewLabel_4_1);
		
		btnNewButton = new JButton("Insertar");
		btnNewButton.setForeground(new Color(65, 105, 225));
		btnNewButton.setFont(new Font("Cooper Black", Font.PLAIN, 11));
		btnNewButton.setBounds(59, 189, 95, 29);
		btnNewButton.addActionListener(this);
		contentPane.add(btnNewButton);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setForeground(new Color(65, 105, 225));
		btnActualizar.setFont(new Font("Cooper Black", Font.PLAIN, 11));
		btnActualizar.addActionListener(this);
		btnActualizar.setBounds(254, 209, 95, 29);
		contentPane.add(btnActualizar);
		
		btnNewButton_1 = new JButton("Eliminar");
		btnNewButton_1.setForeground(new Color(65, 105, 225));
		btnNewButton_1.setFont(new Font("Cooper Black", Font.PLAIN, 11));
		btnNewButton_1.setBounds(452, 111, 89, 23);
		btnNewButton_1.addActionListener(this);
		contentPane.add(btnNewButton_1);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnNewButton) {
			insertarTipoDePelicula();
			}else if(e.getSource()==btnActualizar){
				actualizarTipoDePelicula();
			}else if(e.getSource()==btnNewButton_1) {
				eliminarTipoDePelicula();
			}
	}

	private void eliminarTipoDePelicula() {
		int Id_tipo_pelicula= Integer.parseInt(textField_7.getText());
		TipoPelicula.elimina_tipoPelicula(Id_tipo_pelicula);
	}

	private void actualizarTipoDePelicula() {
		int Id_tipo_pelicula= Integer.parseInt(textField_6.getText());
		String Idioma=textField_5.getText();
		String Formato=textField_4.getText();
		boolean Subtitulada=Boolean.parseBoolean(textField_3.getText());
		TipoPelicula.actualizar_tipoPelicula(Id_tipo_pelicula,"'" + Idioma+ "'","'" + Formato+ "'",Subtitulada);
	}

	private void insertarTipoDePelicula() {
		String Idioma=textField.getText();
		String Formato=textField_1.getText();
		boolean Subtitulada=Boolean.parseBoolean(textField_2.getText());
		TipoPelicula.inserta_tipoPelicula("'" + Idioma+ "'","'" + Formato+ "'",Subtitulada);
//		TipoPelicula.inserta_tipoPelicula("'castellano'", "'2D'", true);
	}
}