import static spark.Spark.*;
import com.google.gson.Gson;
import org.apache.log4j.PropertyConfigurator;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String log4jConfPath = "D:\\Familia\\Documentos\\Emanuel\\Proyecto1000Programadores\\cinemar_CM3_JAVA\\Supermark\\to\\log4j.properties";
		   PropertyConfigurator.configure(log4jConfPath);
		port(8080);
		
		Gson mapper = new Gson();
		
		get ("/saludar",(request, response)-> "Hola mundo, magdalena"); 
		
		get ("/persona",(request, response)-> new Persona("Magdalena", "Galvan"), mapper::toJson);
	}

}
