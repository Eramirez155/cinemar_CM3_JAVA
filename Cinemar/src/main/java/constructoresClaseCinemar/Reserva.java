package constructoresClaseCinemar;

public class Reserva {
private int id_reserva;
private int cantidadDeEntradas;
private Sesion id_sesion;
private Butaca id_butacas;
private Descuento id_descuento;
private TarjetaCredito id_tarjetaCredito;
private InicioSesion id_inicioSesion;

public Reserva() {
	
}
	
	public Reserva(int id_reserva, int cantidadDeEntradas, Sesion id_sesion, Butaca id_butacas, Descuento id_descuento,
		TarjetaCredito id_tarjetaCredito, InicioSesion id_inicioSesion) {
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

	public Sesion getId_sesion() {
		return id_sesion;
	}

	public void setId_sesion(Sesion id_sesion) {
		this.id_sesion = id_sesion;
	}

	public Butaca getId_butacas() {
		return id_butacas;
	}

	public void setId_butacas(Butaca id_butacas) {
		this.id_butacas = id_butacas;
	}

	public Descuento getId_descuento() {
		return id_descuento;
	}

	public void setId_descuento(Descuento id_descuento) {
		this.id_descuento = id_descuento;
	}

	public TarjetaCredito getId_tarjetaCredito() {
		return id_tarjetaCredito;
	}

	public void setId_tarjetaCredito(TarjetaCredito id_tarjetaCredito) {
		this.id_tarjetaCredito = id_tarjetaCredito;
	}

	public InicioSesion getId_inicioSesion() {
		return id_inicioSesion;
	}

	public void setId_inicioSesion(InicioSesion id_inicioSesion) {
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
