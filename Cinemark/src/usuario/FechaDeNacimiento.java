package usuario;

public class FechaDeNacimiento {
	private int dia;
	private int mes;
	private int año;
	
	

	


	public FechaDeNacimiento(int dia, int mes, int año) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.año = año;
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






	public int getAño() {
		return año;
	}






	public void setAño(int año) {
		this.año = año;
	}

	




	@Override
	public String toString() {
		return "FechaDeNacimiento [dia=" + dia + ", mes=" + mes + ", año=" + año + "]";
	}






	public static void main(String[] args) {
		FechaDeNacimiento nacimiento= new FechaDeNacimiento(6,11,2005);
		System.out.println(nacimiento.toString());

	}

}
