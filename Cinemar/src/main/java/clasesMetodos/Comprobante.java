package clasesMetodos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.Date;

import credencialesGlobales.Credenciales;

public class Comprobante {
	private int id_comprobate;
	private Date fechaDeCompra;
	private Reserva id_reserva;
	private Sesion id_sesion;
	
	public Comprobante()
	{
		
	}
	
	public Comprobante(int id_comprobate, Date fechaDeCompra, Reserva id_reserva, Sesion id_sesion) {
		super();
		this.id_comprobate = id_comprobate;
		this.fechaDeCompra = fechaDeCompra;
		this.id_reserva = id_reserva;
		this.id_sesion = id_sesion;
	}

	public int getId_comprobate() {
		return id_comprobate;
	}

	public void setId_comprobate(int id_comprobate) {
		this.id_comprobate = id_comprobate;
	}

	public Date getFechaDeCompra() {
		return fechaDeCompra;
	}

	public void setFechaDeCompra(Date fechaDeCompra) {
		this.fechaDeCompra = fechaDeCompra;
	}

	public Reserva getId_reserva() {
		return id_reserva;
	}

	public void setId_reserva(Reserva id_reserva) {
		this.id_reserva = id_reserva;
	}

	public Sesion getId_sesion() {
		return id_sesion;
	}

	public void setId_sesion(Sesion id_sesion) {
		this.id_sesion = id_sesion;
	}

	@Override
	public String toString() {
		return "Comprobante [id_comprobate=" + id_comprobate + ", fechaDeCompra=" + fechaDeCompra + ", id_reserva="
				+ id_reserva + ", id_sesion=" + id_sesion + "]";
	}
	public static void inserta_comprobante(String fechaDeCompra, int id_reserva, int id_sesion){
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
			 String sql =  MessageFormat.format("INSERT INTO Comprobante (fechaDeCompra, id_reserva, id_sesion) VALUES ({0}, {1}, {2});", fechaDeCompra, id_reserva, id_sesion);
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
	public static void actualizar_comprobante (int id_comprobante,String fechaDeCompra, int id_reserva, int id_sesion) {
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
					 sql = MessageFormat.format("UPDATE comprobante SET fechaDeCompra = {0}, id_reserva = {1}, id_sesion = {2} WHERE id_comprobante = {3}",fechaDeCompra,id_reserva,id_sesion, id_comprobante );
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

	public static void elimina_comprobante(int id_comprobante){
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
			 sql = MessageFormat.format("DELETE FROM comprobante where id_comprobante = {0}", id_comprobante);
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