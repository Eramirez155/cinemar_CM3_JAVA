package clasesMetodos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;

import credencialesGlobales.Credenciales;

public class InicioSesion {
	private int id_inicioSesion;
	private String nombreUsuarioFicticio;
	private String contrasenia;
	private String confirmarContrasenia;
	private String email;
	private CrearCuenta id_crearCuenta;
	private Usuario id_usuario;
	private TarjetaCredito id_tarjetaCredito;

	public InicioSesion() {
	}
	
	public InicioSesion(int id_inicioSesion, String nombreUsuarioFicticio, String contrasenia,
			String confirmarContrasenia, String email, CrearCuenta id_crearCuenta, Usuario id_usuario,
			TarjetaCredito id_tarjetaCredito) {
		super();
		this.id_inicioSesion = id_inicioSesion;
		this.nombreUsuarioFicticio = nombreUsuarioFicticio;
		this.contrasenia = contrasenia;
		this.confirmarContrasenia = confirmarContrasenia;
		this.email = email;
		this.id_crearCuenta = id_crearCuenta;
		this.id_usuario = id_usuario;
		this.id_tarjetaCredito = id_tarjetaCredito;
	}

	public int getId_inicioSesion() {
		return id_inicioSesion;
	}

	public void setId_inicioSesion(int id_inicioSesion) {
		this.id_inicioSesion = id_inicioSesion;
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

	public CrearCuenta getId_crearCuenta() {
		return id_crearCuenta;
	}

	public void setId_crearCuenta(CrearCuenta id_crearCuenta) {
		this.id_crearCuenta = id_crearCuenta;
	}

	public Usuario getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Usuario id_usuario) {
		this.id_usuario = id_usuario;
	}

	public TarjetaCredito getId_tarjetaCredito() {
		return id_tarjetaCredito;
	}

	public void setId_tarjetaCredito(TarjetaCredito id_tarjetaCredito) {
		this.id_tarjetaCredito = id_tarjetaCredito;
	}

	@Override
	public String toString() {
		return "InicioSesion [id_inicioSesion=" + id_inicioSesion + ", nombreUsuarioFicticio=" + nombreUsuarioFicticio
				+ ", contrasenia=" + contrasenia + ", confirmarContrasenia=" + confirmarContrasenia + ", email=" + email
				+ ", id_crearCuenta=" + id_crearCuenta + ", id_usuario=" + id_usuario + ", id_tarjetaCredito="
				+ id_tarjetaCredito + "]";
	}
	public static void inserta_inicioSesion(String nombreUsuarioFicticio,String contrasenia,String confirmarContrasenia,String email,int id_crearCuenta,int id_usuario,int id_tarjetaCredito){
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
	   		 String sql =  MessageFormat.format("INSERT INTO InicioSesion (nombreUsuarioFicticio,contrasenia,confirmarContrasenia,email,id_crearCuenta,id_usuario,id_tarjetaCredito) VALUES ({0}, {1},{2}, {3},{4}, {5},{6});", nombreUsuarioFicticio,contrasenia,confirmarContrasenia,email,id_crearCuenta,id_usuario,id_tarjetaCredito);
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
	   public static void actualizar_InicioSesion (int id_inicioSesion,String nombreUsuarioFicticio,String contrasenia,String confirmarContrasenia,String email,int id_crearCuenta,int id_usuario,int id_tarjetaCredito) {
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
//	   				 String porcentaje_STR = String.valueOf(porcentaje).replace(",", ".");
	   				 sql = MessageFormat.format("UPDATE InicioSesion SET nombreUsuarioFicticio = {0}, contrasenia = {1}, confirmarContrasenia = {2}, email = {3}, id_crearCuenta = {4}, id_usuario = {5}, id_tarjetaCredito = {6}  WHERE id_inicioSesion = {7}",nombreUsuarioFicticio,contrasenia,confirmarContrasenia,email,id_crearCuenta,id_usuario,id_tarjetaCredito,id_inicioSesion);
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

	   public static void elimina_inicioSesion(int id_inicioSesion){
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
	   		 sql = MessageFormat.format("DELETE FROM InicioSesion where id_inicioSesion = {0}", id_inicioSesion);
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