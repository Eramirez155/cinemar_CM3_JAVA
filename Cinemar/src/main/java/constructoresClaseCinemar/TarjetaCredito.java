package constructoresClaseCinemar;

public class TarjetaCredito {
	private int id_tarjetaCredito;
	private String numero;
	private double balance;
	private double limite;
	private String banco;
	
	public TarjetaCredito() {
	
	}
	
	public TarjetaCredito(int id_tarjetaCredito, String numero, double balance, double limite, String banco) {
		super();
		this.id_tarjetaCredito = id_tarjetaCredito;
		this.numero = numero;
		this.balance = balance;
		this.limite = limite;
		this.banco = banco;
	}

	public int getId_tarjetaCredito() {
		return id_tarjetaCredito;
	}

	public void setId_tarjetaCredito(int id_tarjetaCredito) {
		this.id_tarjetaCredito = id_tarjetaCredito;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
