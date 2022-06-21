package usuario;

public class FechaDeNacimiento {
	private int dia;
	private int mes;
	private int anio;
	
	public FechaDeNacimiento(int dia, int mes, int anio) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getanio() {
		return anio;
	}

	public void setanio(int anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		return "FechaDeNacimiento [dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]";
	}



	public static void main(String[] args) {
		FechaDeNacimiento nacimiento= new FechaDeNacimiento(6,11,2005);
		System.out.println(nacimiento.toString());

	}

}
