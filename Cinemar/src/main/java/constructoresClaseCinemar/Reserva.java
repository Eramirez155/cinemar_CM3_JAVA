package constructoresClaseCinemar;

public class Reserva {
private int id_reserva;
private int cantidadDeEntradas;
private int id_sesion;
private int id_butacas;
private int id_descuento;
private int id_tarjetaCredito;
private int id_inicioSesion;

public Reserva() {
	
}
	
	public Reserva(int id_reserva, int cantidadDeEntradas, int id_sesion, int id_butacas, int id_descuento,
		int id_tarjetaCredito, int id_inicioSesion) {
	super();
	this.id_reserva = id_reserva;
	this.cantidadDeEntradas = cantidadDeEntradas;
	this.id_sesion = id_sesion;
	this.id_butacas = id_butacas;
	this.id_descuento = id_descuento;
	this.id_tarjetaCredito = id_tarjetaCredito;
	this.id_inicioSesion = id_inicioSesion;
}

	public int getId_reserva() {
		return id_reserva;
	}

	public void setId_reserva(int id_reserva) {
		this.id_reserva = id_reserva;
	}

	public int getCantidadDeEntradas() {
		return cantidadDeEntradas;
	}

	public void setCantidadDeEntradas(int cantidadDeEntradas) {
		this.cantidadDeEntradas = cantidadDeEntradas;
	}

	public int getId_sesion() {
		return id_sesion;
	}

	public void setId_sesion(int id_sesion) {
		this.id_sesion = id_sesion;
	}

	public int getId_butacas() {
		return id_butacas;
	}

	public void setId_butacas(int id_butacas) {
		this.id_butacas = id_butacas;
	}

	public int getId_descuento() {
		return id_descuento;
	}

	public void setId_descuento(int id_descuento) {
		this.id_descuento = id_descuento;
	}

	public int getId_tarjetaCredito() {
		return id_tarjetaCredito;
	}

	public void setId_tarjetaCredito(int id_tarjetaCredito) {
		this.id_tarjetaCredito = id_tarjetaCredito;
	}

	public int getId_inicioSesion() {
		return id_inicioSesion;
	}

	public void setId_inicioSesion(int id_inicioSesion) {
		this.id_inicioSesion = id_inicioSesion;
	}

	@Override
	public String toString() {
		return "Reserva [id_reserva=" + id_reserva + ", cantidadDeEntradas=" + cantidadDeEntradas + ", id_sesion="
				+ id_sesion + ", id_butacas=" + id_butacas + ", id_descuento=" + id_descuento + ", id_tarjetaCredito="
				+ id_tarjetaCredito + ", id_inicioSesion=" + id_inicioSesion + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
