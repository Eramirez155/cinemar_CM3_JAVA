package jsonApi;
import constructoresClaseCinemar.*;
import static spark.Spark.get;
import java.util.Date;
import java.sql.*;
import org.json.JSONObject;

import com.google.gson.Gson;

import credencialesGlobales.Credenciales;

import java.util.ArrayList;

import org.apache.log4j.PropertyConfigurator;
import org.json.JSONException;
public class JsonButaca {
	
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
		 ArrayList<Butaca> mis_butacas = new ArrayList();
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
		 sql = "SELECT id_butacas,fila,numero,reservada,id_sala FROM butaca;";
		 ResultSet rs = stmt.executeQuery(sql);
		 
		 //STEP 5: Extraer datos del ResultSet
		 while(rs.next()){
		 //Recibir por tipo de columna
			 int id_butacas = rs.getInt("id_butacas");
			 String fila = rs.getString("fila");
			 int numero = rs.getInt("numero");
			 boolean reservada = rs.getBoolean("reservada");
			 int id_sala = rs.getInt("id_sala");
			 System.out.println("id_butacas: "+ id_butacas + " fila: " + fila + " numero: " + numero + " reservada: " + reservada + " id_sala: " + id_sala);
			 
			Butaca butaca = new Butaca(id_butacas, fila, numero, reservada,id_sala);
			mis_butacas.add(butaca);
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
		   String json = new Gson().toJson(mis_butacas);
	      get("/butaca", (req,res) -> json);
		 System.out.println("Goodbye!");
		 
	} // cierra metodo principal (main)

} // cierra clase