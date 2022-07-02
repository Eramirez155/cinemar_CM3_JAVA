package ingresarValoresBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class IngresarValoresALaBBDDesdeJava {
	
	//  Registrar JDBC Driver
	// JDBC nombre del driver y URL de la BDD
		 static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; 
		 static final String DB_URL = "jdbc:mysql://localhost:3306/cinemark2";
	 // Credenciales de la BDD
		 static final String USER = "root";
		 static final String PASS = "lasonrriza";

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
				+ "('1', 'Castellano', '2D', '0'), \r\n"
				+ "('2', 'Castellano','3D', '0'), \r\n"
				+ "('3', 'Ingles', '2D', '1'),  \r\n"
				+ "('4', 'Ingles', '3D', '1'),  \r\n"
				+ "('5', 'Portuges', '3D', '1'),  \r\n"
				+ "('6', 'Portugues', '2D', '1') \r\n"
				+ ";    " ;	
		 stmt.executeUpdate(sql);
		System.out.println("Valores Insertados con Exito");
		
		sql = "INSERT INTO Clasificacion\r\n"
				+ "VALUES\r\n"
				+ "('1','ATP','Apta para todo publico'),\r\n"
				+ "('2','+16','Para mayores de 16'),\r\n"
				+ "('3','+13','Para mayores de 13'),\r\n"
				+ "('4','+18','Para mayores de 18')\r\n"
				+ ";";	
		 stmt.executeUpdate(sql);
		System.out.println("Valores Insertados con Exito");
		
		sql = "INSERT INTO Pelicula\r\n"
				+ "VALUES\r\n"
				+ "('1', 'Spiderman','Tras descubrirse la identidad secreta de Peter Parker como Spider-Man, la vida del joven se vuelve una locura', 'Aventura','2h 28m','Tom Holland, Tobey Maguire, Andrew Garfield','Jon Watts', '1', '1'),\r\n"
				+ "('2', 'Lightyear', 'Buzz Lightyear se embarca en una aventura intergaláctica con un grupo de reclutas ambiciosos y su compañero robot.', 'Accion','1h 45m','Reparto: Chris Evans, Keke Palmer, Efren Ramirez', 'Angus MacLane','2','1'),\r\n"
				+ "('3', 'El telefono negro', 'Un homicida sádico y enmascarado mantiene a Finney, un niño de 13 años, secuestrado en un sótano incomunicado', 'Terror', '1h 42m','Mason Thames,Finney Shaw, Madeleine McGraw','Scott Derrickson', '3', '2'),\r\n"
				+ "('4', 'Thor Amor y duelo', 'Secuela de Thor: Ragnarok en la que el Dios del Trueno contará con Lady Thor como acompañante', 'Ciencia ficción', '2hs','Chris Hemsworth, Christian Bale, Natalie Portman','Taika Kaw', '4', '3'),\r\n"
				+ "('5', 'minions' ,'En los años 70, Gru crece siendo un gran admirador de \"Los salvajes seis\", un supergrupo de villanos.', 'Animación', '1h 30m','Steve Carell, Jean-Claude Van Damme, Taraji P. Henson','Kyle Balda', '5', '1'),\r\n"
				+ "('6', 'Dog un salvaje viaje', 'Un miembro del Ejército, junto a una perra llamada Lulu, recorre la costa del Pacífico para llegar al funeral de un soldado.', 'Drama', '1h 41m','Channing Tatum, Jane Adams, Qorianka Kilcher','Reid Carolin', '6', '4')\r\n"
				+ ";";	
		 stmt.executeUpdate(sql);
		System.out.println("Valores Insertados con Exito");
		
		sql = "INSERT INTO Sala\r\n"
				+ "VALUES\r\n"
				+ "('1', '1', '2D', '150'),\r\n"
				+ "('2', '2', '3D', '400'),\r\n"
				+ "('3', '3', '2D', '200'),\r\n"
				+ "('4', '4', '3D', '250'),\r\n"
				+ "('5', '5', '3D', '150'),\r\n"
				+ "('6', '6', '2D', '50')\r\n"
				+ "; ";	
		 stmt.executeUpdate(sql);
		System.out.println("Valores Insertados con Exito");
		
		sql = "INSERT INTO descuento \r\n"
				+ "VALUES    \r\n"
				+ "('1', 'Lunes', '20.0','800'),\r\n"
				+ "('2', 'Martes','15.0','850'),\r\n"
				+ "('3', 'Miercoles', '20.0','800'),\r\n"
				+ "('4', 'Jueves','15.0','850'),\r\n"
				+ "('5', 'Viernes', '10.0','900'),\r\n"
				+ "('6', 'Sabado','10.0','900'),\r\n"
				+ "('7', 'Domingo', '10.0','900')\r\n"
				+ ";";	
		 stmt.executeUpdate(sql);
		System.out.println("Valores Insertados con Exito");
		
		sql = "INSERT INTO Butaca \r\n"
				+ "VALUES \r\n"
				+ "('1', 'A', '6','1','1'),\r\n"
				+ "('2', 'B','9','1','2'),\r\n"
				+ "('3', 'C', '15','1','3'),\r\n"
				+ "('4', 'D','18','1','4'),\r\n"
				+ "('5', 'E', '9','1','5'),\r\n"
				+ "('6', 'F','12','1','6'),\r\n"
				+ "('7', 'G', '5','0','1'),\r\n"
				+ "('8', 'H', '13','0','2'),\r\n"
				+ "('9', 'I','10','1','3'),\r\n"
				+ "('10', 'J', '5','0','4')\r\n"
				+ ";";	
		 stmt.executeUpdate(sql);
		System.out.println("Valores Insertados con Exito");
		
		sql = "INSERT INTO TarjetaCredito\r\n"
				+ "VALUES\r\n"
				+ "('1', '1526152615264859', '50000', '2000', 'Santander'),\r\n"
				+ "('2', '1526152615264859', '25000', '1500', 'Visa'),\r\n"
				+ "('3', '1526152615264859', '80000', '4000', 'MasterCard'),\r\n"
				+ "('4', '1526152615264859', '100000', '6000', 'Cabal'),\r\n"
				+ "('5', '1526152615264859', '10000', '1000', 'Naranja'),\r\n"
				+ "('6', '1526152615264859', '9000', '900', 'SuCredito')\r\n"
				+ ";";	
		 stmt.executeUpdate(sql);
		System.out.println("Valores Insertados con Exito");
		
		sql = "INSERT INTO Usuario \r\n"
				+ "VALUES\r\n"
				+ "('1', 'Mario', 'Ponce','0','mario5@gmail.com','2001-03-18','41327605'), \r\n"
				+ "('2', 'Leandro', 'Alani','1','Alani23@yahoo.com.ar','1975-04-03','20910483'),\r\n"
				+ "('3', 'Matias', 'Martines','0','Mat88@gmail.com','1980-02-25','33266388'),\r\n"
				+ "('4', 'Valeria', 'Espindola','0','ValEspindola@gmail.com','1975-05-10','27701408'),\r\n"
				+ "('5', 'Viviana', 'Ramires','0','Vivi9@yahoo.com.ar','1997-09-30','40202346'),\r\n"
				+ "('6', 'Tamara', 'Delgado','1','TamaraDel@gmail.com','1991-11-19','35796500')\r\n"
				+ ";";	
		 stmt.executeUpdate(sql);
		System.out.println("Valores Insertados con Exito");
		
		sql = "INSERT INTO CrearCuenta \r\n"
				+ "VALUES\r\n"
				+ "('1', 'Mario', 'Ponce','41327605','2001-03-18','Cuervo88','gon480','gon480','mario5@gmail.com','masculino','Hoyts Salta','1'),\r\n"
				+ "('2', 'Leandro', 'Alani','20910483','1975-04-03','German','qwerty','qwerty','Alani23@yahoo.com.ar','masculino','Cinemark Salta','2'),\r\n"
				+ "('3', 'Matias', 'Martines','33266388','1980-02-25','IceWelder','123456','123456','Mat88@gmail.com','otro','Hoyts Salta','3'),\r\n"
				+ "('4', 'Valeria', 'Espindola','27701408','1975-05-10','Valeria303','abc123','abc123','ValEspindola@gmail.com','prefiero no indicar','Hoyts Salta','4'),\r\n"
				+ "('5', 'Viviana', 'Ramires','40202346','1997-09-30','Vivian','password','password','Vivi9@yahoo.com.ar','femenino','Cinemark Salta','5'),\r\n"
				+ "('6', 'Tamara', 'Delgado','35796500','1991-11-19','Palmerita25','Tamara190','Tamara190','TamaraDel@gmail.com','femenino','Cinemark Salta','6')\r\n"
				+ ";";	
		 stmt.executeUpdate(sql);
		System.out.println("Valores Insertados con Exito");
		
		sql = "INSERT INTO InicioSesion \r\n"
				+ "VALUES\r\n"
				+ "('1','Cuervo88','gon480','gon480','mario5@gmail.com','1','1','1'),\r\n"
				+ "('2','German','qwerty','qwerty','Alani23@yahoo.com.ar','2','2','2'),\r\n"
				+ "('3','IceWelder','123456','123456','Mat88@gmail.com','3','3','3'),\r\n"
				+ "('4','Valeria303','abc123','abc123','ValEspindola@gmail.com','4','4','4'),\r\n"
				+ "('5','Vivian','password','password','Vivi9@yahoo.com.ar','5','5','5'),\r\n"
				+ "('6','Palmerita25','Tamara190','Tamara190','TamaraDel@gmail.com','6','6','6')\r\n"
				+ ";";	
		 stmt.executeUpdate(sql);
		System.out.println("Valores Insertados con Exito");
		
		sql = "INSERT INTO Sesion\r\n"
				+ "VALUES -- Agregar horario de la sesion\r\n"
				+ "('1', '2022-07-20', '1','1'),\r\n"
				+ "('2', '2022-07-21', '2','2'),\r\n"
				+ "('3', '2022-07-20', '3', '3'),\r\n"
				+ "('4', '2022-08-03', '4', '4'),\r\n"
				+ "('5', '2022-07-28', '5', '5'),\r\n"
				+ "('6', '2022-07-28', '6', '6')\r\n"
				+ ";";	
		 stmt.executeUpdate(sql);
		System.out.println("Valores Insertados con Exito");
		
		sql = "INSERT INTO Reserva \r\n"
				+ "VALUES\r\n"
				+ "('1', '6', '1','1','3','1','1'),\r\n"
				+ "('2', '5', '2','2','4','2','2'),\r\n"
				+ "('3', '3', '3','3','3','3','3'),\r\n"
				+ "('4', '1', '4', '4','3','4','4'),\r\n"
				+ "('5', '4', '5', '5','4','5','5'),\r\n"
				+ "('6', '2', '6', '6','4','6','6')\r\n"
				+ ";";	
		 stmt.executeUpdate(sql);
		System.out.println("Valores Insertados con Exito");
		
		sql = "INSERT INTO Comprobante\r\n"
				+ "VALUES\r\n"
				+ "('1', '2022-07-15', '1','1'),\r\n"
				+ "('2', '2022-07-16', '2','2'),\r\n"
				+ "('3', '2022-07-15', '3', '3'),\r\n"
				+ "('4', '2022-07-29', '4', '4'),\r\n"
				+ "('5', '2022-07-23', '5', '5'),\r\n"
				+ "('6', '2022-07-23', '6', '6')\r\n"
				+ ";";	
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

