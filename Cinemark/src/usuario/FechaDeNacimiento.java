package usuario;

public class FechaDeNacimiento {
	private int dia;
	private int mes;
	private int a�o;
	
	

	


	public FechaDeNacimiento(int dia, int mes, int a�o) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
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






	public int getA�o() {
		return a�o;
	}






	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	




	@Override
	public String toString() {
		return "FechaDeNacimiento [dia=" + dia + ", mes=" + mes + ", a�o=" + a�o + "]";
	}






	public static void main(String[] args) {
		FechaDeNacimiento nacimiento= new FechaDeNacimiento(6,11,2005);
		System.out.println(nacimiento.toString());

	}

}
