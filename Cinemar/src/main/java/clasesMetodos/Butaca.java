package clasesMetodos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;

import credencialesGlobales.Credenciales;

public class Butaca {
	private int id_butacas;
	private String fila;
	private int numero;
	private boolean reservada;
	private Sala id_sala;
	
	public Butaca() {
		
	}
	
	public Butaca(int id_butacas, String fila, int numero, boolean reservada, Sala id_sala) {
		super();
		this.id_butacas = id_butacas;
		this.fila = fila;
		this.numero = numero;
		this.reservada = reservada;
		this.id_sala = id_sala;
	}

	public int getId_butacas() {
		return id_butacas;
	}

	public void setId_butacas(int id_butacas) {
		this.id_butacas = id_butacas;
	}

	public String getFila() {
		return fila;
	}

	public void setFila(String fila) {
		this.fila = fila;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isReservada() {
		return reservada;
	}

	public void setReservada(boolean reservada) {
		this.reservada = reservada;
	}

	public Sala getId_sala() {
		return id_sala;
	}

	public void setId_sala(Sala id_sala) {
		this.id_sala = id_sala;
	}

	@Override
	public String toString() {
		return "Butaca [id_butacas=" + id_butacas + ", fila=" + fila + ", numero=" + numero + ", reservada=" + reservada
				+ ", id_sala=" + id_sala + "]";
	}

	public static void inserta_butaca(String fila, int numero, boolean reservada){
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
			 String sql =  MessageFormat.format("INSERT INTO Butaca (fila, numero, reservada) VALUES ({0}, {1}, {2});", fila, numero, reservada);
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
	public static void actualizar_butaca (int id_butaca,String fila, int numero, boolean reservada) {
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
					 sql = MessageFormat.format("UPDATE butaca SET fila = {0}, numero = {1}, reservada = {2}  WHERE id_butaca = {3}",fila,numero,reservada,id_butaca );
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

	public static void elimina_butaca(int id_butaca){
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
			 sql = MessageFormat.format("DELETE FROM butaca where id_butaca = {0}", id_butaca);
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