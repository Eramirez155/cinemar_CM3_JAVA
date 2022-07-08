package clasesMetodos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;

import credencialesGlobales.Credenciales;

public class TarjetaCredito {
	private int id_tarjetaCredito;
	private String numero;
	private double balance;
	private double limite;
	private String banco;
	
	public TarjetaCredito() {
	
	}
	
	public TarjetaCredito(int id_tarjetaCredito, String numero, double balance, double limite, String banco) {
		super();
		this.id_tarjetaCredito = id_tarjetaCredito;
		this.numero = numero;
		this.balance = balance;
		this.limite = limite;
		this.banco = banco;
	}

	public int getId_tarjetaCredito() {
		return id_tarjetaCredito;
	}

	public void setId_tarjetaCredito(int id_tarjetaCredito) {
		this.id_tarjetaCredito = id_tarjetaCredito;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}
	public static void inserta_TarjetaCredito(String numero, double balance, double limite, String banco){
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
	   		 String balance_STR = String.valueOf(balance).replace(",", ".");
	   		 String limite_STR = String.valueOf(limite).replace(",", ".");
	   		 String sql =  MessageFormat.format("INSERT INTO TarjetaCredito (numero, balance, limite, banco) VALUES ({0}, {1},{2},{3});", numero, balance_STR, limite_STR, banco);
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
	   public static void actualizar_TarjetaCredito (int id_TarjetaCredito,  String numero, double balance, double limite, String banco) {
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
   				// String porcentaje_STR = String.valueOf(porcentaje).replace(",", ".");
	   		  	   	String balance_STR = String.valueOf(balance).replace(",", ".");
	   	   	     	 String limite_STR = String.valueOf(limite).replace(",", ".");
	   				 sql = MessageFormat.format("UPDATE TarjetaCredito SET numero = {0}, balance = {1}, limite = {2}, banco = {3}  WHERE id_TarjetaCredito = {4}",numero, balance_STR, limite_STR, banco, id_TarjetaCredito );
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

	   public static void elimina_TarjetaCredito(int id_TarjetaCredito){
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
	   		 sql = MessageFormat.format("DELETE FROM TarjetaCredito where id_TarjetaCredito = {0}", id_TarjetaCredito);
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