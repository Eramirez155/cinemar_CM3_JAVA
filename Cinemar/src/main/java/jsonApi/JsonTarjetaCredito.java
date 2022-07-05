package jsonApi;

import static spark.Spark.get;

import java.sql.*;
import java.util.ArrayList;

import org.json.JSONObject;

import com.google.gson.Gson;

import constructoresClaseCinemar.TarjetaCredito;
import constructoresClaseCinemar.Usuario;
import credencialesGlobales.Credenciales;

import org.apache.log4j.PropertyConfigurator;
import org.json.JSONException;

public class JsonTarjetaCredito {
	
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
		 ArrayList<TarjetaCredito> mis_tarjetas = new ArrayList();
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
		 sql = "SELECT id_tarjetacredito,numero,balance,limite,banco FROM tarjetaCredito;";
		 ResultSet rs = stmt.executeQuery(sql);
		 
		 //STEP 5: Extraer datos del ResultSet
		 while(rs.next()){
		 //Recibir por tipo de columna
			 int id_tarjetaCredito = rs.getInt("id_tarjetaCredito");
			 String numero = rs.getString("numero");
			 double balance = rs.getDouble("balance");
			 double limite = rs.getDouble("limite");
			 String banco = rs.getString("banco");
			 System.out.println("id_tarjetaCredito: "+ id_tarjetaCredito + " numero: " + numero + " balance: " + balance +" limite: " + limite + " banco: " + banco);
			 
			 TarjetaCredito tarjetacredito = new TarjetaCredito(id_tarjetaCredito,numero,balance,limite,banco);
			 mis_tarjetas.add(tarjetacredito);
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
		  String json = new Gson().toJson(mis_tarjetas);
	      get("/tarjetacredito", (req,res) -> json);
		 System.out.println("Goodbye!");
		 
	} // cierra metodo principal (main)

} // cierra clase