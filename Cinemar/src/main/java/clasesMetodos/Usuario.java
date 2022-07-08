package clasesMetodos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.Date;

import credencialesGlobales.Credenciales;
import java.util.Date;

public class Usuario {
	private int id_usuario;
	private String nombre;
	private String apellido;
	private boolean esAdministrador;
	private String email;
	private Date fecha_nacimiento;
	private String dni;
	
	public Usuario() {
		
	}
	
	public Usuario(int id_usuario, String nombre, String apellido, boolean esAdministrador, String email,
			Date fecha_nacimiento, String dni) {
		super();
		this.id_usuario = id_usuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.esAdministrador = esAdministrador;
		this.email = email;
		this.fecha_nacimiento = fecha_nacimiento;
		this.dni = dni;
	}
	
	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public boolean isEsAdministrador() {
		return esAdministrador;
	}

	public void setEsAdministrador(boolean esAdministrador) {
		this.esAdministrador = esAdministrador;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Usuario [id_usuario=" + id_usuario + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", esAdministrador=" + esAdministrador + ", email=" + email + ", fecha_nacimiento=" + fecha_nacimiento
				+ ", dni=" + dni + "]";
	}
	public static void inserta_usuario(String nombre, String apellido, boolean esAdministrador, String email, String fecha_nacimiento, String dni){
		 //  Registrar JDBC Driver
		// JDBC nombre del driver y URL de la BDD
			Credenciales mi_credi = new Credenciales();
			String JDBC_DRIVER = mi_credi.JDBC_DRIVER; 
			String DB_URL = mi_credi.DB_URL;
		 // Credenciales de la BDD
			String USER = mi_credi.USER;
			String PASS = mi_credi.PASS;
			
			 Connection conn = null;
			 Statement stmt = null;
			 
			 try{
			 //PASO 2: Registrar JDBC driver
			 Class.forName(JDBC_DRIVER);
			 
			 //PASO3: Abrir una Conexion
			 System.out.println("Connecting to database...");
			 conn = DriverManager.getConnection(DB_URL,USER,PASS);
			 
			 //PASO 4: Ejecutar una consulta SQL
			 System.out.println("Creating statement...");
			 stmt = conn.createStatement();
			 String sql =  MessageFormat.format("INSERT INTO Usuario (nombre, apellido, esAdministrador, email, fecha_nacimiento, dni) VALUES ({0}, {1}, {2}, {3}, {4}, {5});", nombre, apellido, esAdministrador, email, fecha_nacimiento, dni);
			 System.out.println(sql);
			 stmt.executeUpdate(sql);
			 
			 System.out.println("Valores INSERTADOS con exito :) !");
			 
			 
			 
			 //PASO6: Entorno de Limpieza
			 stmt.close();
			 conn.close();
			 }catch(SQLException se){
				 // Resolver errores para JDBC
				 se.printStackTrace();
			 }catch(Exception e){
				 // Resolver errores para Class.forName
				 e.printStackTrace();
			 }finally{
			 // Bloque finalmente utilizado para cerrar recursos
			 try{
				 if(stmt!=null)
					 stmt.close();
			 }catch(SQLException se2){
			 }// Nada que podamos hacer
			 try{
				 if(conn!=null)
					 conn.close();
			 }catch(SQLException se){
			 se.printStackTrace();
			 	} //cierra finally try
			 } //cierra try
			 System.out.println("Goodbye!");
		
	}
	public static void actualizar_usuario (int id_usuario,String nombre, String apellido, boolean esAdministrador, String email, String fecha_nacimiento, String dni) {
	//  Registrar JDBC Driver
				// JDBC nombre del driver y URL de la BDD
					Credenciales mi_credi = new Credenciales();
					String JDBC_DRIVER = mi_credi.JDBC_DRIVER; 
					String DB_URL = mi_credi.DB_URL;
				 // Credenciales de la BDD
					String USER = mi_credi.USER;
					String PASS = mi_credi.PASS;
					
					Connection conn = null;
					 Statement stmt = null;
					 
					 try{
					 //PASO 2: Registrar JDBC driver
					 Class.forName(JDBC_DRIVER);
					 
					 //PASO3: Abrir una Conexion
					 System.out.println("Connecting to database...");
					 conn = DriverManager.getConnection(DB_URL,USER,PASS);
					 
					 //PASO 4: Ejecutar una consulta SQL
					 System.out.println("Creating statement...");
					 stmt = conn.createStatement();
					 String sql;
//					 String porcentaje_STR = String.valueOf(porcentaje).replace(",", ".");
					 sql = MessageFormat.format("UPDATE usuario SET nombre = {0}, apellido = {1}, esAdministrador = {2}, email = {3}, fecha_nacimiento = {4}, dni = {5} WHERE id_usuario = {6}",nombre, apellido, esAdministrador, email, fecha_nacimiento, dni, id_usuario );
					 System.out.println(sql);
					 stmt.executeUpdate(sql);
					 
					 System.out.println("Valores ACTUALIZADOS con exito :) !");
					 
					 //PASO6: Entorno de Limpieza
					 stmt.close();
					 conn.close();
					 }catch(SQLException se){
						 // Resolver errores para JDBC
						 se.printStackTrace();
					 }catch(Exception e){
						 // Resolver errores para Class.forName
						 e.printStackTrace();
					 }finally{
					 // Bloque finalmente utilizado para cerrar recursos
					 try{
						 if(stmt!=null)
							 stmt.close();
					 }catch(SQLException se2){
					 }// Nada que podamos hacer
					 try{
						 if(conn!=null)
							 conn.close();
					 }catch(SQLException se){
					 se.printStackTrace();
					 	} //cierra finally try
					 } //cierra try
					 System.out.println("Goodbye!");
	}

	public static void elimina_usuario(int id_usuario){
		 //  Registrar JDBC Driver
		// JDBC nombre del driver y URL de la BDD
			Credenciales mi_credi = new Credenciales();
			String JDBC_DRIVER = mi_credi.JDBC_DRIVER; 
			String DB_URL = mi_credi.DB_URL;
		 // Credenciales de la BDD
			String USER = mi_credi.USER;
			String PASS = mi_credi.PASS;
			
			 Connection conn = null;
			 Statement stmt = null;
			 
			 try{
			 //PASO 2: Registrar JDBC driver
			 Class.forName(JDBC_DRIVER);
			 
			 //PASO3: Abrir una Conexion
			 System.out.println("Connecting to database...");
			 conn = DriverManager.getConnection(DB_URL,USER,PASS);
			 
			 //PASO 4: Ejecutar una consulta SQL
			 System.out.println("Creating statement...");
			 stmt = conn.createStatement();
			 String sql;
			 sql = MessageFormat.format("DELETE FROM usuario where id_usuario = {0}", id_usuario);
			 stmt.executeUpdate(sql);
			 
			 System.out.println("Valores ELIMINADOS con exito :) !");
			 
			 //PASO6: Entorno de Limpieza
			 stmt.close();
			 conn.close();
			 }catch(SQLException se){
				 // Resolver errores para JDBC
				 se.printStackTrace();
			 }catch(Exception e){
				 // Resolver errores para Class.forName
				 e.printStackTrace();
			 }finally{
			 // Bloque finalmente utilizado para cerrar recursos
			 try{
				 if(stmt!=null)
					 stmt.close();
			 }catch(SQLException se2){
			 }// Nada que podamos hacer
			 try{
				 if(conn!=null)
					 conn.close();
			 }catch(SQLException se){
			 se.printStackTrace();
			 	} //cierra finally try
			 } //cierra try
			 System.out.println("Goodbye!");
		
	}
	public static void main(String[] args) {
		Date fechaDeNacimiento= new Date(122, 6,23, 2, 30, 30);
		Usuario persona1 = new Usuario(01, "Mario", "Gutierrez",false, "mariogutierrez@gmail.com", fechaDeNacimiento, "30222380");
		System.out.println(persona1.toString());
	}
	
}