import java.util.Date;

public class Sesion {
	private int id_sesion;
	private Date fecha;
	private Pelicula id_pelicula;
	private Sala id_sala;
	
	public Sesion() {
		
	}
	
	public Sesion(int id_sesion, Date fecha, Pelicula id_pelicula, Sala id_sala) {
		super();
		this.id_sesion = id_sesion;
		this.fecha = fecha;
		this.id_pelicula = id_pelicula;
		this.id_sala = id_sala;
	}

	public int getId_sesion() {
		return id_sesion;
	}

	public void setId_sesion(int id_sesion) {
		this.id_sesion = id_sesion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Pelicula getId_pelicula() {
		return id_pelicula;
	}

	public void setId_pelicula(Pelicula id_pelicula) {
		this.id_pelicula = id_pelicula;
	}

	public Sala getId_sala() {
		return id_sala;
	}

	public void setId_sala(Sala id_sala) {
		this.id_sala = id_sala;
	}

	@Override
	public String toString() {
		return "Sesion [id_sesion=" + id_sesion + ", fecha=" + fecha + ", id_pelicula=" + id_pelicula + ", id_sala="
				+ id_sala + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
