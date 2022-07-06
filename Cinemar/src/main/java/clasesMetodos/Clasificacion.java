package clasesMetodos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;

import credencialesGlobales.Credenciales;

public class Clasificacion {

	 private int id_clasificacion;
	    private String identificador;
	    private String descripcion;

	    public Clasificacion () 
	    {}

	    public Clasificacion(int id_clasificacion, String identificador, String descripcion) {
	        super();
	        this.id_clasificacion = id_clasificacion;
	        this.identificador = identificador;
	        this.descripcion = descripcion;
	    }

	    public int getId_clasificacion() {
	        return id_clasificacion;
	    }

	    public void setId_clasificacion(int id_clasificacion) {
	        this.id_clasificacion = id_clasificacion;
	    }

	    public String getIdentificador() {
	        return identificador;
	    }

	    public void setIdentificador(String identificador) {
	        this.identificador = identificador;
	    }

	    public String getDescripcion() {
	        return descripcion;
	    }

	    public void setDescripcion(String descripcion) {
	        this.descripcion = descripcion;
	    }

	    @Override
	    public String toString() {
	        return "Clasificacion [id_clasificacion=" + id_clasificacion + ", identificador=" + identificador
	                + ", descripcion=" + descripcion + "]";
	    }
	
	    public static void inserta_clasificacion(String identificador, String descripcion){
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
		   		 String sql =  MessageFormat.format("INSERT INTO Clasificacion (identificador, descripcion) VALUES ({0}, {1});", identificador, descripcion);
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
		   public static void actualizar_clasificacion (int id_clasificacion, String identificador,String descripcion) {
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
//		   				 String porcentaje_STR = String.valueOf(porcentaje).replace(",", ".");
		   				 sql = MessageFormat.format("UPDATE clasificacion SET identificador = {0}, descripcion = {1}  WHERE id_clasificacion = {2}",identificador,descripcion,id_clasificacion );
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

		   public static void elimina_clasificacion(int id_clasificacion){
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
		   		 sql = MessageFormat.format("DELETE FROM clasificacion where id_clasificacion = {0}", id_clasificacion);
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