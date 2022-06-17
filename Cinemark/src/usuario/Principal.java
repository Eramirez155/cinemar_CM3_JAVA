package usuario;

public class Principal {

	public static void main(String[] args) {
		FechaDeNacimiento nacimiento= new FechaDeNacimiento(6,11,2005);
		System.out.println(nacimiento.toString());
		Usuario  persona1 = new Usuario (2,"matias","ramirez","30000057",nacimiento,"matias@gmail.com","masculino","Hoyts");
		System.out.println(persona1.toString());
	}

}
