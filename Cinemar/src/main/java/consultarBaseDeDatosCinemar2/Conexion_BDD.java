package consultarBaseDeDatosCinemar2;

import java.sql.*;

public class Conexion_BDD {
	
	//  Registrar JDBC Driver
	// JDBC nombre del driver y URL de la BDD
		 static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; 
		 static final String DB_URL = "jdbc:mysql://localhost:3306/cinemark2";
	 // Credenciales de la BDD
		 static final String USER = "root";
		 static final String PASS = "Heracles159753";

	public static void main(String args[]) {
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
		 sql = "SELECT id_descuento,dia,porcentaje,precioFinal FROM descuento;";
		 ResultSet rs = stmt.executeQuery(sql);
		 
		 //STEP 5: Extraer datos del ResultSet
		 while(rs.next()){
		 //Recibir por tipo de columna
			 int id_descuento = rs.getInt("id_descuento");
			 String dia = rs.getString("dia");
			 float porcentaje = rs.getFloat("porcentaje");
			 int precioFinal = rs.getInt("precioFinal");
			 System.out.println("id_descuento: "+ id_descuento + " dia: " + dia + " porcentaje: " + porcentaje + "%"+" precioFinal: " + "$"+precioFinal);
//		 int population = rs.getInt("Population");
//		 String Name = rs.getString("Name");
//		 String CountryCode = rs.getString("Code");
//		 //Mostrar Valores
//		 System.out.println(CountryCode + ": " + Name +" "+population + " habitantes");
		 }
		 
		 //PASO6: Entorno de Limpieza
		 rs.close();
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