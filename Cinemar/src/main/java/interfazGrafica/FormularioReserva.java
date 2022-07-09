package interfazGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clasesMetodos.Reserva;
import clasesMetodos.TipoPelicula;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class FormularioReserva extends JFrame implements ActionListener {

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
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioReserva frame = new FormularioReserva();
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
	public FormularioReserva() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 324);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("cantidadDeEntradas");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel.setBounds(10, 38, 179, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("id_sesion");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(10, 63, 118, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("id_butaca");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(10, 100, 118, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("id_descuento");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(10, 133, 118, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("id_tarjetaCredito");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(10, 161, 111, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("id_inicioSesion");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_5.setBounds(10, 189, 118, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("id_reserva");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_6.setBounds(302, 38, 85, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("cantidadDeEntradas");
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_7.setBounds(299, 75, 138, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("id_sesion");
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_8.setBounds(302, 100, 114, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("id_butaca");
		lblNewLabel_9.setForeground(new Color(255, 255, 255));
		lblNewLabel_9.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_9.setBounds(302, 133, 138, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("id_descuento");
		lblNewLabel_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_10.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_10.setBounds(302, 161, 138, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("id_tarjetaCredito");
		lblNewLabel_11.setForeground(new Color(255, 255, 255));
		lblNewLabel_11.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_11.setBounds(299, 189, 141, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("id_inicioSesion");
		lblNewLabel_12.setForeground(new Color(255, 255, 255));
		lblNewLabel_12.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_12.setBounds(302, 220, 147, 14);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("id_reserva");
		lblNewLabel_13.setForeground(new Color(255, 255, 255));
		lblNewLabel_13.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_13.setBounds(564, 38, 114, 14);
		contentPane.add(lblNewLabel_13);
		
		textField = new JTextField();
		textField.setBounds(170, 38, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(167, 63, 96, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(170, 100, 96, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(170, 133, 96, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(170, 161, 96, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(167, 189, 96, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(458, 38, 96, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(458, 70, 96, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(458, 95, 96, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(458, 128, 96, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(458, 156, 96, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(458, 184, 96, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(458, 215, 96, 20);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(654, 33, 96, 20);
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		btnNewButton = new JButton("Insertar");
		btnNewButton.setForeground(new Color(65, 105, 225));
		btnNewButton.setFont(new Font("Cooper Black", Font.PLAIN, 11));
		btnNewButton.setBounds(68, 214, 96, 23);
		btnNewButton.addActionListener(this);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Actualizar");
		btnNewButton_1.setForeground(new Color(65, 105, 225));
		btnNewButton_1.setFont(new Font("Cooper Black", Font.PLAIN, 11));
		btnNewButton_1.setBounds(364, 245, 115, 23);
		btnNewButton_1.addActionListener(this);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Eliminar");
		btnNewButton_2.setForeground(new Color(65, 105, 225));
		btnNewButton_2.setFont(new Font("Cooper Black", Font.PLAIN, 11));
		btnNewButton_2.setBounds(596, 69, 136, 23);
		btnNewButton_2.addActionListener(this);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_14 = new JLabel("RESERVA");
		lblNewLabel_14.setForeground(new Color(255, 255, 0));
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_14.setBounds(209, 11, 149, 14);
		contentPane.add(lblNewLabel_14);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnNewButton)
		{int cantidadDeEntrada = Integer.parseInt(textField.getText()); 
		int id_sesion = Integer.parseInt(textField_1.getText()); 
		int id_butaca = Integer.parseInt(textField_2.getText()); 
		int id_descuento = Integer.parseInt(textField_3.getText()); 
		int id_tarjetaCredito = Integer.parseInt(textField_4.getText());
		int id_inicioSesion = Integer.parseInt(textField_5.getText()); 
		Reserva.inserta_reserva(cantidadDeEntrada,id_sesion, id_butaca, id_descuento, id_tarjetaCredito, id_inicioSesion);}
		//System.out.println("cantidadDeEntrada es " + cantidadDeEntrada + " El id_sesion es " + id_sesion + " El id_butaca es " + id_butaca + " El id_descuento es " + id_descuento + " id_tarjetaCredito " + id_tarjetaCredito + " id_inicioSesion " + id_inicioSesion);}
		
		if (e.getSource()==btnNewButton_1)
		{int id_reserva = Integer.parseInt(textField_6.getText());
		int cantidadDeEntrada = Integer.parseInt(textField_7.getText()); 
		int id_sesion = Integer.parseInt(textField_8.getText()); 
		int id_butaca = Integer.parseInt(textField_9.getText()); 
		int id_descuento = Integer.parseInt(textField_10.getText()); 
		int id_tarjetaCredito = Integer.parseInt(textField_11.getText());
		int id_inicioSesion = Integer.parseInt(textField_12.getText());

		
		Reserva.actualizar_reserva(id_reserva,cantidadDeEntrada, id_sesion, id_butaca, id_descuento,id_tarjetaCredito,id_inicioSesion );
		//System.out.println(" Id reserva es " + id_reserva + "cantidadDeEntrada es " + cantidadDeEntrada + " El id_sesion es " + id_sesion + " El id_butaca es " + id_butaca + " El id_descuento es " + id_descuento + " id_tarjetaCredito " + id_tarjetaCredito + " id_inicioSesion " + id_inicioSesion);
		}
		
		if (e.getSource()==btnNewButton_2)
		{
		 int id_reserva = Integer.parseInt(textField_13.getText()); 
		 Reserva.elimina_reserva(id_reserva);
			//System.out.println("El id es " + id_reserva);
		}
	
	}}