package clasesMetodos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;

import credencialesGlobales.Credenciales;

public class Pelicula {
	private int id_pelicula;
	private String titulo_Pelicula;
	private String Sinopsis;
	private String genero;
	private String duracion;
	private String actores;
	private String director;
	private TipoPelicula id_tipo_pelicula;
	private Clasificacion id_clasificacion;
	
	public Pelicula() {
		
	}
	
	public Pelicula(int id_pelicula, String titulo_Pelicula, String sinopsis, String genero, String duracion,
			String actores, String director, TipoPelicula id_tipo_pelicula, Clasificacion id_clasificacion) {
		super();
		this.id_pelicula = id_pelicula;
		this.titulo_Pelicula = titulo_Pelicula;
		Sinopsis = sinopsis;
		this.genero = genero;
		this.duracion = duracion;
		this.actores = actores;
		this.director = director;
		this.id_tipo_pelicula = id_tipo_pelicula;
		this.id_clasificacion = id_clasificacion;
	}

	public int getId_pelicula() {
		return id_pelicula;
	}

	public void setId_pelicula(int id_pelicula) {
		this.id_pelicula = id_pelicula;
	}

	public String getTitulo_Pelicula() {
		return titulo_Pelicula;
	}

	public void setTitulo_Pelicula(String titulo_Pelicula) {
		this.titulo_Pelicula = titulo_Pelicula;
	}

	public String getSinopsis() {
		return Sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		Sinopsis = sinopsis;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public String getActores() {
		return actores;
	}

	public void setActores(String actores) {
		this.actores = actores;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public TipoPelicula getId_tipo_pelicula() {
		return id_tipo_pelicula;
	}

	public void setId_tipo_pelicula(TipoPelicula id_tipo_pelicula) {
		this.id_tipo_pelicula = id_tipo_pelicula;
	}

	public Clasificacion getId_clasificacion() {
		return id_clasificacion;
	}

	public void setId_clasificacion(Clasificacion id_clasificacion) {
		this.id_clasificacion = id_clasificacion;
	}

	@Override
	public String toString() {
		return "Pelicula [id_pelicula=" + id_pelicula + ", titulo_Pelicula=" + titulo_Pelicula + ", Sinopsis="
				+ Sinopsis + ", genero=" + genero + ", duracion=" + duracion + ", actores=" + actores + ", director="
				+ director + ", id_tipo_pelicula=" + id_tipo_pelicula + ", id_clasificacion=" + id_clasificacion + "]";
	}
	public static void inserta_pelicula(String titulo_Pelicula,String Sinopsis,String genero,String duracion,String actores,String director,int id_tipo_pelicula,int id_clasificacion){
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
	   		 String sql =  MessageFormat.format("INSERT INTO Pelicula (titulo_Pelicula,Sinopsis,genero,duracion,actores,director,id_tipo_pelicula,id_clasificacion) VALUES ({0}, {1},{2}, {3},{4}, {5},{6}, {7});", titulo_Pelicula,Sinopsis,genero,duracion,actores,director,id_tipo_pelicula,id_clasificacion);
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
	   public static void actualizar_pelicula (int id_pelicula, String titulo_Pelicula,String Sinopsis,String genero,String duracion,String actores,String director,int id_tipo_pelicula,int id_clasificacion) {
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
	   				 sql = MessageFormat.format("UPDATE pelicula SET  titulo_Pelicula= {0}, sinopsis = {1},genero = {2},duracion = {3},actores = {4},director = {5},id_tipo_pelicula = {6},id_clasificacion = {7}  WHERE id_pelicula = {8}",titulo_Pelicula,Sinopsis,genero,duracion,actores,director,id_tipo_pelicula,id_clasificacion,id_pelicula);
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

	   public static void elimina_pelicula(int id_pelicula){
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
	   		 sql = MessageFormat.format("DELETE FROM pelicula where id_pelicula = {0}", id_pelicula);
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