package jsonApi;

import static spark.Spark.get;

import java.util.ArrayList;
import java.util.Date;
import java.sql.*;
import org.json.JSONObject;

import com.google.gson.Gson;

import constructoresClaseCinemar.Comprobante;
import constructoresClaseCinemar.Usuario;
import credencialesGlobales.Credenciales;

import org.apache.log4j.PropertyConfigurator;
import org.json.JSONException;

public class JsonComprobante {
	
	static //  Registrar JDBC Driver
	// JDBC nombre del driver y URL de la BDD
		Credenciales mi_credi = new Credenciales();
		 static final String JDBC_DRIVER = mi_credi.JDBC_DRIVER; 
		 static final String DB_URL = mi_credi.DB_URL;
	 // Credenciales de la BDD
		 static final String USER = mi_credi.USER;
		 static final String PASS = mi_credi.PASS;

	public static void main(String args[]) {
		 Connection conn = null;
		 Statement stmt = null;
		 JSONObject jo = new JSONObject();
		 ArrayList<Comprobante> mis_comprobantes = new ArrayList();
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
		 sql = "SELECT id_comprobante,fechaDeCompra,id_reserva,id_sesion FROM comprobante;";
		 ResultSet rs = stmt.executeQuery(sql);
		 
		 //STEP 5: Extraer datos del ResultSet
		 while(rs.next()){
		 //Recibir por tipo de columna
			 int id_comprobante = rs.getInt("id_comprobante");
			 Date fechaDeCompra = rs.getDate("fechaDeCompra");
			 int id_reserva = rs.getInt("id_reserva");
			 int id_sesion = rs.getInt("id_sesion");
			 System.out.println("id_comprobante: "+ id_comprobante + " fechaDeCompra: " + fechaDeCompra + " id_reserva: " + id_reserva +" id_sesion: " +id_sesion);
			 
			 Comprobante comprobante = new Comprobante(id_comprobante,fechaDeCompra,id_reserva,id_sesion);
			 mis_comprobantes.add(comprobante); 
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
		 String log4jConfPath = mi_credi.PATH; //cambiar el path
		   PropertyConfigurator.configure(log4jConfPath);
		  String json = new Gson().toJson(mis_comprobantes);
	      get("/comprobante", (req,res) -> json);
		 System.out.println("Goodbye!");
		 
	} // cierra metodo principal (main)

} // cierra clase