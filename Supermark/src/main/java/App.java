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
		
		get ("/formulario",(request, response)-> "<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>Document</title>\r\n"
				+ "    <link rel=\"stylesheet\" href=\"https://cdn.simplecss.org/simple.min.css\">\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<form action=\"\" method=\"get\">\r\n"
				+ "    <input type=\"text\" name=\"\" id=\"\" placeholder=\"ingresa tu nombre:\">\r\n"
				+ "    <input type=\"text\" name=\"\" id=\"\" placeholder=\"ingresa tu apellido:\">\r\n"
				+ "    <input type=\"text\" name=\"\" id=\"\" placeholder=\"ingresa tu dni:\">\r\n"
				+ "    <input type=\"text\" name=\"\" id=\"\" placeholder=\"ingresa tu email:\">\r\n"
				+ "    <input type=\"text\" name=\"\" id=\"\" placeholder=\"ingresa tu password:\">\r\n"
				+ "    <input type=\"submit\" value=\"Enviar\">\r\n"
				+ "</form>\r\n"
				+ "</body>\r\n"
				+ "</html>"); 
		
		get ("/persona",(request, response)-> new Persona("Magdalena", "Galvan"), mapper::toJson);
	}

}
