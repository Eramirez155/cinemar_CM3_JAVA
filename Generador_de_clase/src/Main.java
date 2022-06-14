
public class Main {

	public static void main(String[] args) {
	
		Usuario cliente1 = new Usuario(1," juan ", "perez");
		System.out.println(cliente1.getNombre());
		System.out.println(cliente1.getApellido());
		System.out.println(cliente1.getId());
		System.out.println(cliente1.toString());
	}

	
}
