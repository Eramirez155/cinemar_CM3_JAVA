package constructoresClaseCinemar;
import java.util.Date;

public class CrearCuenta {
	private int id_crearCuenta;
	private String nombre;
	private String apellido;
	private String dni;
	private Date fechaNacimiento;
	private String nombreUsuarioFicticio;
	private String contrasenia;
	private String confirmarContrasenia;
	private String email;
	private String genero;
	private String complejoHabitual;
	private int id_usuario;
	
	public CrearCuenta() {
		
	}
	
	public CrearCuenta(int id_crearCuenta, String nombre, String apellido, String dni, Date fechaNacimiento,
			String nombreUsuarioFicticio, String contrasenia, String confirmarContrasenia, String email, String genero,
			String complejoHabitual, int id_usuario) {
		super();
		this.id_crearCuenta = id_crearCuenta;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.nombreUsuarioFicticio = nombreUsuarioFicticio;
		this.contrasenia = contrasenia;
		this.confirmarContrasenia = confirmarContrasenia;
		this.email = email;
		this.genero = genero;
		this.complejoHabitual = complejoHabitual;
		this.id_usuario = id_usuario;
	}

	public int getId_crearCuenta() {
		return id_crearCuenta;
	}

	public void setId_crearCuenta(int id_crearCuenta) {
		this.id_crearCuenta = id_crearCuenta;
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

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombreUsuarioFicticio() {
		return nombreUsuarioFicticio;
	}

	public void setNombreUsuarioFicticio(String nombreUsuarioFicticio) {
		this.nombreUsuarioFicticio = nombreUsuarioFicticio;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getConfirmarContrasenia() {
		return confirmarContrasenia;
	}

	public void setConfirmarContrasenia(String confirmarContrasenia) {
		this.confirmarContrasenia = confirmarContrasenia;
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

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	@Override
	public String toString() {
		return "CrearCuenta [id_crearCuenta=" + id_crearCuenta + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento + ", nombreUsuarioFicticio="
				+ nombreUsuarioFicticio + ", contrasenia=" + contrasenia + ", confirmarContrasenia="
				+ confirmarContrasenia + ", email=" + email + ", genero=" + genero + ", complejoHabitual="
				+ complejoHabitual + ", id_usuario=" + id_usuario + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
