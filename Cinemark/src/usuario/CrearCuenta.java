package usuario;

import java.util.Date;

public class CrearCuenta extends Usuario{

	private int id_crearCuenta;
	private String contrasenia;
	private String confirmacionContrasenia;
	private String email;
	private String complejoHabitual;

	public CrearCuenta(Integer id, String nombre, String apellido, String dni, Date fechaDeNacimiento, String genero,
			int id_crearCuenta, String contrasenia, String confirmacionContrasenia, String email,
			String complejoHabitual) {
		super(id, nombre, apellido, dni, fechaDeNacimiento, genero);
		this.id_crearCuenta = id_crearCuenta;
		this.contrasenia = contrasenia;
		this.confirmacionContrasenia = confirmacionContrasenia;
		this.email = email;
		this.complejoHabitual = complejoHabitual;
	}

	public int getId_crearCuenta() {
		return id_crearCuenta;
	}

	public void setId_crearCuenta(int id_crearCuenta) {
		this.id_crearCuenta = id_crearCuenta;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getConfirmacionContrasenia() {
		return confirmacionContrasenia;
	}

	public void setConfirmacionContrasenia(String confirmacionContrasenia) {
		this.confirmacionContrasenia = confirmacionContrasenia;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getComplejoHabitual() {
		return complejoHabitual;
	}

	public void setComplejoHabitual(String complejoHabitual) {
		this.complejoHabitual = complejoHabitual;
	}

	@Override
	public String toString() {
		return "CrearCuenta [id_crearCuenta=" + id_crearCuenta + ", contrasenia=" + contrasenia
				+ ", confirmacionContrasenia=" + confirmacionContrasenia + ", email=" + email + ", complejoHabitual="
				+ complejoHabitual + "]";
	}

	public static void main(String[] args) {
		
	}

}
