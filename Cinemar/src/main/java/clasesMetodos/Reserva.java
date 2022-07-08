package clasesMetodos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;

import credencialesGlobales.Credenciales;
public class Reserva {
private int id_reserva;
private int cantidadDeEntradas;
private Sesion id_sesion;
private Butaca id_butacas;
private Descuento id_descuento;
private TarjetaCredito id_tarjetaCredito;
private InicioSesion id_inicioSesion;

public Reserva() {
	
}
	
	public Reserva(int id_reserva, int cantidadDeEntradas, Sesion id_sesion, Butaca id_butacas, Descuento id_descuento,
		TarjetaCredito id_tarjetaCredito, InicioSesion id_inicioSesion) {
	super();
	this.id_reserva = id_reserva;
	this.cantidadDeEntradas = cantidadDeEntradas;
	this.id_sesion = id_sesion;
	this.id_butacas = id_butacas;
	this.id_descuento = id_descuento;
	this.id_tarjetaCredito = id_tarjetaCredito;
	this.id_inicioSesion = id_inicioSesion;
}

	public int getId_reserva() {
		return id_reserva;
	}

	public void setId_reserva(int id_reserva) {
		this.id_reserva = id_reserva;
	}

	public int getCantidadDeEntradas() {
		return cantidadDeEntradas;
	}

	public void setCantidadDeEntradas(int cantidadDeEntradas) {
		this.cantidadDeEntradas = cantidadDeEntradas;
	}

	public Sesion getId_sesion() {
		return id_sesion;
	}

	public void setId_sesion(Sesion id_sesion) {
		this.id_sesion = id_sesion;
	}

	public Butaca getId_butacas() {
		return id_butacas;
	}

	public void setId_butacas(Butaca id_butacas) {
		this.id_butacas = id_butacas;
	}

	public Descuento getId_descuento() {
		return id_descuento;
	}

	public void setId_descuento(Descuento id_descuento) {
		this.id_descuento = id_descuento;
	}

	public TarjetaCredito getId_tarjetaCredito() {
		return id_tarjetaCredito;
	}

	public void setId_tarjetaCredito(TarjetaCredito id_tarjetaCredito) {
		this.id_tarjetaCredito = id_tarjetaCredito;
	}

	public InicioSesion getId_inicioSesion() {
		return id_inicioSesion;
	}

	public void setId_inicioSesion(InicioSesion id_inicioSesion) {
		this.id_inicioSesion = id_inicioSesion;
	}

	@Override
	public String toString() {
		return "Reserva [id_reserva=" + id_reserva + ", cantidadDeEntradas=" + cantidadDeEntradas + ", id_sesion="
				+ id_sesion + ", id_butacas=" + id_butacas + ", id_descuento=" + id_descuento + ", id_tarjetaCredito="
				+ id_tarjetaCredito + ", id_inicioSesion=" + id_inicioSesion + "]";
	}
	public static void inserta_reserva(int cantidadDeEntradas,int id_sesion,int id_butaca,int id_descuento, int id_tarjetaCredito, int id_inicioSesion){
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
			String sql =  MessageFormat.format("INSERT INTO reserva (cantidadDeEntradas, id_sesion ,id_butaca,id_descuento,id_tarjetaCredito,id_inicioSesion) VALUES ({0}, {1},{2}, {3},{4}, {5});", cantidadDeEntradas, id_sesion ,id_butaca,id_descuento,id_tarjetaCredito,id_inicioSesion);
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
   public static void actualizar_reserva (int id_reserva, int cantidadDeEntradas,int id_sesion,int id_butaca,int id_descuento,int id_tarjetaCredito,int id_inicioSesion) {
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
					sql = MessageFormat.format("UPDATE reserva SET  cantidadDeEntradas= {0}, id_sesion = {1},id_butaca = {2},id_descuento = {3},id_tarjetaCredito = {4},id_inicioSesion = {5} WHERE id_reserva = {6}",cantidadDeEntradas, id_sesion,id_butaca,id_descuento,id_tarjetaCredito,id_inicioSesion, id_reserva);
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

   public static void elimina_reserva(int id_reserva){
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
			sql = MessageFormat.format("DELETE FROM reserva where id_reserva = {0}", id_reserva);
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