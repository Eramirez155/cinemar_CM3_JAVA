

import static spark.Spark.*;



import org.apache.log4j.PropertyConfigurator;
import com.google.gson.Gson;

public class App {
	 public static void main(String[]args){
		   String log4jConfPath = "C:/Users/enzzo/eclipse-workspace/Curso_Java/cinemar/to/log4j.properties";
		   PropertyConfigurator.configure(log4jConfPath);
	       Gson mapper= new Gson();
	       // port(8080);
	       Date fechaDeNacimiento= new Date(122, 6,23, 2, 30, 30);
	       get("/saludo", (req,res) -> new Usuario(1,"Jose", "Perez", false, "joseperez@gmail.com", fechaDeNacimiento, "30222380" ), mapper::toJson);
	   }

}
