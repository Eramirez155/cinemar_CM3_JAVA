
public class InicioSesion {
	private int id_inicioSesion;
	private String nombreUsuarioFicticio;
	private String contrasenia;
	private String confirmarContrasenia;
	private String email;
	private CrearCuenta id_crearCuenta;
	private Usuario id_usuario;
	private TarjetaCredito id_tarjetaCredito;
	
	
	public InicioSesion() {
	}
	
	public InicioSesion(int id_inicioSesion, String nombreUsuarioFicticio, String contrasenia,
			String confirmarContrasenia, String email, CrearCuenta id_crearCuenta, Usuario id_usuario,
			TarjetaCredito id_tarjetaCredito) {
		super();
		this.id_inicioSesion = id_inicioSesion;
		this.nombreUsuarioFicticio = nombreUsuarioFicticio;
		this.contrasenia = contrasenia;
		this.confirmarContrasenia = confirmarContrasenia;
		this.email = email;
		this.id_crearCuenta = id_crearCuenta;
		this.id_usuario = id_usuario;
		this.id_tarjetaCredito = id_tarjetaCredito;
	}












	public int getId_inicioSesion() {
		return id_inicioSesion;
	}












	public void setId_inicioSesion(int id_inicioSesion) {
		this.id_inicioSesion = id_inicioSesion;
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












	public CrearCuenta getId_crearCuenta() {
		return id_crearCuenta;
	}












	public void setId_crearCuenta(CrearCuenta id_crearCuenta) {
		this.id_crearCuenta = id_crearCuenta;
	}












	public Usuario getId_usuario() {
		return id_usuario;
	}












	public void setId_usuario(Usuario id_usuario) {
		this.id_usuario = id_usuario;
	}












	public TarjetaCredito getId_tarjetaCredito() {
		return id_tarjetaCredito;
	}












	public void setId_tarjetaCredito(TarjetaCredito id_tarjetaCredito) {
		this.id_tarjetaCredito = id_tarjetaCredito;
	}












	@Override
	public String toString() {
		return "InicioSesion [id_inicioSesion=" + id_inicioSesion + ", nombreUsuarioFicticio=" + nombreUsuarioFicticio
				+ ", contrasenia=" + contrasenia + ", confirmarContrasenia=" + confirmarContrasenia + ", email=" + email
				+ ", id_crearCuenta=" + id_crearCuenta + ", id_usuario=" + id_usuario + ", id_tarjetaCredito="
				+ id_tarjetaCredito + "]";
	}












	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
