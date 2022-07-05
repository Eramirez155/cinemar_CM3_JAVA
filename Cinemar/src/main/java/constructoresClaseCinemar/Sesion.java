package constructoresClaseCinemar;
import java.util.Date;

public class Sesion {
	private int id_sesion;
	private Date fecha;
	private int id_pelicula;
	private int id_sala;
	
	public Sesion() {
		
	}
	
	public Sesion(int id_sesion, Date fecha, int id_pelicula, int id_sala) {
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

	public int getId_pelicula() {
		return id_pelicula;
	}

	public void setId_pelicula(int id_pelicula) {
		this.id_pelicula = id_pelicula;
	}

	public int getId_sala() {
		return id_sala;
	}

	public void setId_sala(int id_sala) {
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
