package ingresarValoresBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Tipo_Pelicula {
	
	//  Registrar JDBC Driver
	// JDBC nombre del driver y URL de la BDD
		 static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; 
		 static final String DB_URL = "jdbc:mysql://localhost:3306/cinemark2";
	 // Credenciales de la BDD
		 static final String USER = "root";
		 static final String PASS = "Jmatias155";

	public static void main(String args[]) {
		 Connection conn = null;
		 Statement stmt = null;
		 
		 try{
		 //PASO 2: Registrar JDBC driver
		 Class.forName(JDBC_DRIVER);
		 
		 //PASO3: Abrir una Conexion
		 System.out.println("Connecting to database...");
		 conn = DriverManager.getConnection(DB_URL,USER,PASS);
		 
		 //PASO 4: Ejecutar una sentencia SQL
		 System.out.println("Creating statement...");
		 stmt = conn.createStatement();
		 String sql;
		 
		sql = "INSERT INTO Tipo_Pelicula\r\n"
				+ "VALUES\r\n"
				+ "('1', 'CAstellano', '2D', '1'),\r\n"
				+ "('2', 'ingles', '3D', '1'),\r\n"
				+ "('3', 'Castellano', '2D', '0')\r\n"
				+ "; " ;	
		 stmt.executeUpdate(sql);
		System.out.println("Valores Insertados con Exito");
		 
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
		
	} // cierra metodo principal (main)

} // cierra clase

