package constructoresClaseCinemar;
import java.util.Date;

public class Comprobante {
	private int id_comprobate;
	private Date fechaDeCompra;
	private int id_reserva;
	private int id_sesion;
	
	public Comprobante()
	{
		
	}
	
	public Comprobante(int id_comprobate, Date fechaDeCompra, int id_reserva, int id_sesion) {
		super();
		this.id_comprobate = id_comprobate;
		this.fechaDeCompra = fechaDeCompra;
		this.id_reserva = id_reserva;
		this.id_sesion = id_sesion;
	}

	public int getId_comprobate() {
		return id_comprobate;
	}

	public void setId_comprobate(int id_comprobate) {
		this.id_comprobate = id_comprobate;
	}

	public Date getFechaDeCompra() {
		return fechaDeCompra;
	}

	public void setFechaDeCompra(Date fechaDeCompra) {
		this.fechaDeCompra = fechaDeCompra;
	}

	public int getId_reserva() {
		return id_reserva;
	}

	public void setId_reserva(int id_reserva) {
		this.id_reserva = id_reserva;
	}

	public int getId_sesion() {
		return id_sesion;
	}

	public void setId_sesion(int id_sesion) {
		this.id_sesion = id_sesion;
	}

	@Override
	public String toString() {
		return "Comprobante [id_comprobate=" + id_comprobate + ", fechaDeCompra=" + fechaDeCompra + ", id_reserva="
				+ id_reserva + ", id_sesion=" + id_sesion + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
