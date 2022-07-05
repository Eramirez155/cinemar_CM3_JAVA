package jsonApi;

import static spark.Spark.get;

import java.sql.*;
import java.util.ArrayList;

import org.json.JSONObject;

import com.google.gson.Gson;

import constructoresClaseCinemar.InicioSesion;
import constructoresClaseCinemar.Usuario;
import credencialesGlobales.Credenciales;

import org.apache.log4j.PropertyConfigurator;
import org.json.JSONException;

public class JsonInicioSesion {
	
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
		 ArrayList<InicioSesion> mis_iniciossesion = new ArrayList();
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
		 sql = "SELECT id_inicioSesion,nombreUsuarioFicticio,contrasenia,confirmarContrasenia,email,id_crearCuenta,id_usuario,id_tarjetaCredito  FROM inicioSesion;";
		 ResultSet rs = stmt.executeQuery(sql);
		 
		 //STEP 5: Extraer datos del ResultSet
		 while(rs.next()){
		 //Recibir por tipo de columna
			 int id_inicioSesion = rs.getInt("id_inicioSesion");
			 String nombreUsuarioFicticio = rs.getString("nombreUsuarioFicticio");
			 String contrasenia = rs.getString("contrasenia");
			 String confirmarContrasenia = rs.getString("confirmarContrasenia");
			 String email = rs.getString("email");
			 int id_crearCuenta = rs.getInt("id_crearCuenta");
			 int id_usuario = rs.getInt("id_usuario");
			 int id_tarjetaCredito = rs.getInt("id_tarjetaCredito");
			 System.out.println("id_inicioSesion: "+ id_inicioSesion + " nombreUsuarioFicticio: " + nombreUsuarioFicticio + " contrasenia: " + contrasenia +" confirmarContrasenia: " + confirmarContrasenia +  " email: " + email + " id_crearCuenta: " + id_crearCuenta +  " id_usuario: " + id_usuario +  " id_tarjetaCredito: " + id_tarjetaCredito );
			 

			 InicioSesion iniciosesion = new InicioSesion(id_inicioSesion,nombreUsuarioFicticio,contrasenia,confirmarContrasenia,email,id_crearCuenta,id_usuario,id_tarjetaCredito);
			 mis_iniciossesion.add(iniciosesion);
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
		  String json = new Gson().toJson(mis_iniciossesion);
	      get("/iniciosesion", (req,res) -> json);
		 System.out.println("Goodbye!");
		 
	} // cierra metodo principal (main)

} // cierra clase