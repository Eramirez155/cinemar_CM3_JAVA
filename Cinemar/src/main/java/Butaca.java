
public class Butaca {
	private int id_butacas;
	private String fila;
	private int numero;
	private boolean reservada;
	private Sala id_sala;
	
	public Butaca() {
		
	}
	
	public Butaca(int id_butacas, String fila, int numero, boolean reservada, Sala id_sala) {
		super();
		this.id_butacas = id_butacas;
		this.fila = fila;
		this.numero = numero;
		this.reservada = reservada;
		this.id_sala = id_sala;
	}

	public int getId_butacas() {
		return id_butacas;
	}

	public void setId_butacas(int id_butacas) {
		this.id_butacas = id_butacas;
	}

	public String getFila() {
		return fila;
	}

	public void setFila(String fila) {
		this.fila = fila;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isReservada() {
		return reservada;
	}

	public void setReservada(boolean reservada) {
		this.reservada = reservada;
	}

	public Sala getId_sala() {
		return id_sala;
	}

	public void setId_sala(Sala id_sala) {
		this.id_sala = id_sala;
	}

	@Override
	public String toString() {
		return "Butaca [id_butacas=" + id_butacas + ", fila=" + fila + ", numero=" + numero + ", reservada=" + reservada
				+ ", id_sala=" + id_sala + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
