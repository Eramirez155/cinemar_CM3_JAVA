package usuario;

public class Usuario {
	private int id;
	private String nombre;
	private String apellido;
	private String dni;
	
	public Usuario(int id, String nombre, String apellido, String dni) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "]";
	}

	public static void main(String[] args) {
		Usuario  persona1 = new Usuario (1, "Jose", "Perez", "45652235" ); 
		System.out.println(persona1.toString());
		

	}

}


