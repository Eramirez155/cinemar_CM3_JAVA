package clasesMetodos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;

import credencialesGlobales.Credenciales;

public class Sala {
	private int id_sala;
    private int numero;
    private String formato;
    private int capacidad;

    public Sala () {}

    public Sala(int id_sala, int numero, String formato, int capacidad) {
        super();
        this.id_sala = id_sala;
        this.numero = numero;
        this.formato = formato;
        this.capacidad = capacidad;
    }

    public int getId_sala() {
        return id_sala;
    }

    public void setId_sala(int id_sala) {
        this.id_sala = id_sala;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
        
    }

    
    public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	
    

    @Override
	public String toString() {
		return "Sala [id_sala=" + id_sala + ", numero=" + numero + ", formato=" + formato + ", capacidad=" + capacidad
				+ "]";
	}

	public static void inserta_sala(int numero, String formato, int capacidad){
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
	   		 String sql =  MessageFormat.format("INSERT INTO sala (numero, formato, capacidad) VALUES ({0}, {1}, {2});", numero, formato, capacidad);
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
	   public static void actualizar_sala (int id_sala, int numero,String formato, int capacidad) {
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
	   				 sql = MessageFormat.format("UPDATE sala SET numero = {0}, formato = {1}, capacidad = {2}  WHERE id_sala = {3}",numero,formato, capacidad, id_sala );
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

	   public static void elimina_sala(int id_sala){
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
	   		 sql = MessageFormat.format("DELETE FROM sala where id_sala = {0}", id_sala);
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