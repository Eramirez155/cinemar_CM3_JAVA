package credencialesGlobales;

public class Credenciales {
	
	//Atributos
	 public String JDBC_DRIVER; 
	 public String DB_URL;
	// Credenciales de la BDD
	 public String USER;
	 public String PASS;
	 public String PATH;
	 
	 public Credenciales(){
		 this.JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
		 this.DB_URL = "jdbc:mysql://localhost:3306/cinemark2";
		 this.USER = "root";
		 this.PASS = "lasonrriza";
		 this.PATH = "C:\\Users\\milag\\OneDrive\\Escritorio\\cinemar_CM3_JAVA\\Cinemar\\to\\log4j.properties";
	 }

}