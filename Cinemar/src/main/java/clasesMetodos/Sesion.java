package clasesMetodos;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.Date;

import credencialesGlobales.Credenciales;

public class Sesion {
	private int id_sesion;
	private Date fecha;
	private Pelicula id_pelicula;
	private Sala id_sala;
	
	public Sesion() {
		
	}
	
	public Sesion(int id_sesion, Date fecha, Pelicula id_pelicula, Sala id_sala) {
		super();
		this.id_sesion = id_sesion;
		this.fecha = fecha;
		this.id_pelicula = id_pelicula;
		this.id_sala = id_sala;
	}

	public int getId_sesion() {
		return id_sesion;
	}

	public void setId_sesion(int id_sesion) {
		this.id_sesion = id_sesion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Pelicula getId_pelicula() {
		return id_pelicula;
	}

	public void setId_pelicula(Pelicula id_pelicula) {
		this.id_pelicula = id_pelicula;
	}

	public Sala getId_sala() {
		return id_sala;
	}

	public void setId_sala(Sala id_sala) {
		this.id_sala = id_sala;
	}

	@Override
	public String toString() {
		return "Sesion [id_sesion=" + id_sesion + ", fecha=" + fecha + ", id_pelicula=" + id_pelicula + ", id_sala="
				+ id_sala + "]";
	}
	public static void inserta_sesion(String fecha, int id_pelicula, int id_sala){
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
			 String sql =  MessageFormat.format("INSERT INTO Sesion (fecha, id_pelicula, id_sala) VALUES ({0}, {1}, {2});", fecha, id_pelicula, id_sala);
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
	public static void actualizar_sesion (int id_sesion,String fecha, int id_pelicula, int id_sala) {
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
					 sql = MessageFormat.format("UPDATE sesion SET fecha = {0}, id_pelicula = {1}, id_sala = {2} WHERE id_sesion = {3}",fecha,id_pelicula,id_sala, id_sesion );
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

	public static void elimina_sesion(int id_sesion){
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
			 sql = MessageFormat.format("DELETE FROM sesion where id_sesion = {0}", id_sesion);
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