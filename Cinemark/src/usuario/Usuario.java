package usuario;

public class Usuario {
	private Integer id;
	private String nombre;
	private String apellido;
	private  String dni;
	private FechaDeNacimiento fechaDeNacimiento;
	private String email;
	private String genero;
	private String complejoHabitual;
	
	
	public Usuario(Integer id, String nombre, String apellido, String dni, FechaDeNacimiento fechaDeNacimiento,
			String email, String genero, String complejoHabitual) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.email = email;
		this.genero = genero;
		this.complejoHabitual = complejoHabitual;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
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

	public FechaDeNacimiento getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(FechaDeNacimiento fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getComplejoHabitual() {
		return complejoHabitual;
	}

	public void setComplejoHabitual(String complejoHabitual) {
		this.complejoHabitual = complejoHabitual;
	}
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
				+ ", fechaDeNacimiento=" + fechaDeNacimiento + ", email=" + email + ", genero=" + genero
				+ ", complejoHabitual=" + complejoHabitual + "]";
	}

	
	public static void main(String[] args) {
		FechaDeNacimiento nacimiento= new FechaDeNacimiento(6,11,2005);
		System.out.println(nacimiento.toString());
		Usuario  persona1 = new Usuario (2,"matias","ramirez","30000057",nacimiento,"matias@gmail.com","masculino","Hoyts");
		System.out.println(persona1.toString());
	}		
}
