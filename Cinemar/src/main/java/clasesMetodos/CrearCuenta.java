package clasesMetodos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.Date;

import credencialesGlobales.Credenciales;

public class CrearCuenta {
	private int id_crearCuenta;
	private String nombre;
	private String apellido;
	private String dni;
	private Date fechaNacimiento;
	private String nombreUsuarioFicticio;
	private String contrasenia;
	private String confirmarContrasenia;
	private String email;
	private String genero;
	private String complejoHabitual;
	private InicioSesion id_usuario;
	
	public CrearCuenta() {
		
	}
	
	public CrearCuenta(int id_crearCuenta, String nombre, String apellido, String dni, Date fechaNacimiento,
			String nombreUsuarioFicticio, String contrasenia, String confirmarContrasenia, String email, String genero,
			String complejoHabitual, InicioSesion id_usuario) {
		super();
		this.id_crearCuenta = id_crearCuenta;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.nombreUsuarioFicticio = nombreUsuarioFicticio;
		this.contrasenia = contrasenia;
		this.confirmarContrasenia = confirmarContrasenia;
		this.email = email;
		this.genero = genero;
		this.complejoHabitual = complejoHabitual;
		this.id_usuario = id_usuario;
	}

	public int getId_crearCuenta() {
		return id_crearCuenta;
	}

	public void setId_crearCuenta(int id_crearCuenta) {
		this.id_crearCuenta = id_crearCuenta;
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombreUsuarioFicticio() {
		return nombreUsuarioFicticio;
	}

	public void setNombreUsuarioFicticio(String nombreUsuarioFicticio) {
		this.nombreUsuarioFicticio = nombreUsuarioFicticio;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getConfirmarContrasenia() {
		return confirmarContrasenia;
	}

	public void setConfirmarContrasenia(String confirmarContrasenia) {
		this.confirmarContrasenia = confirmarContrasenia;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getComplejoHabitual() {
		return complejoHabitual;
	}

	public void setComplejoHabitual(String complejoHabitual) {
		this.complejoHabitual = complejoHabitual;
	}

	public InicioSesion getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(InicioSesion id_usuario) {
		this.id_usuario = id_usuario;
	}

	@Override
	public String toString() {
		return "CrearCuenta [id_crearCuenta=" + id_crearCuenta + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento + ", nombreUsuarioFicticio="
				+ nombreUsuarioFicticio + ", contrasenia=" + contrasenia + ", confirmarContrasenia="
				+ confirmarContrasenia + ", email=" + email + ", genero=" + genero + ", complejoHabitual="
				+ complejoHabitual + ", id_usuario=" + id_usuario + "]";
	}
	public static void inserta_crearCuenta(String nombre, String apellido, String dni, String fechaNacimiento,String nombreUsuarioFicticio,String contrasenia,String confirmarContrasenia,String email,String genero,String complejoHabitual,int id_usuario){
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
			 String sql =  MessageFormat.format("INSERT INTO CrearCuenta (nombre,apellido,dni,fechaNacimiento,nombreUsuarioFicticio,contrasenia,confirmarContrasenia,email,genero,complejoHabitual,id_usuario) VALUES ({0}, {1}, {2}, {3}, {4}, {5}, {6}, {7}, {8}, {9}, {10});", nombre,apellido,dni,fechaNacimiento,nombreUsuarioFicticio,contrasenia,confirmarContrasenia,email,genero,complejoHabitual,id_usuario);
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
	public static void actualizar_crearCuenta (int id_crearCuenta,String nombre, String apellido, String dni, String fechaNacimiento,String nombreUsuarioFicticio,String contrasenia,String confirmarContrasenia,String email,String genero,String complejoHabitual,int id_usuario) {
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
					 sql = MessageFormat.format("UPDATE CrearCuenta SET nombre = {0}, apellido = {1}, dni = {2} , fechaNacimiento = {3}, nombreUsuarioFicticio = {4}, contrasenia = {5}, confirmarContrasenia = {6}, email = {7},genero = {8},complejoHabitual = {9},id_Usuario = {10} WHERE id_crearCuenta = {11}",nombre,apellido,dni,fechaNacimiento,nombreUsuarioFicticio,contrasenia,confirmarContrasenia,email,genero,complejoHabitual,id_usuario,id_crearCuenta);
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

	public static void elimina_crearCuenta(int id_crearCuenta){
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
			 sql = MessageFormat.format("DELETE FROM CrearCuenta where id_crearCuenta = {0}", id_crearCuenta);
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
		// TODO Auto-generated method stub

	}

}