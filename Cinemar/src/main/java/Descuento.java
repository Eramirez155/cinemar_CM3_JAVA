
public class Descuento {
	 	private int id_descuento;
	    private String dia;
	    private float porcentaje;
	    private int precioFinal;

	    public Descuento() {}

	    public Descuento(int id_descuento, String dia, float porcentaje, int precioFinal) {
	        super();
	        this.id_descuento = id_descuento;
	        this.dia = dia;
	        this.porcentaje = porcentaje;
	        this.precioFinal = precioFinal;
	    }

	    public int getId_descuento() {
	        return id_descuento;
	    }

	    public void setId_descuento(int id_descuento) {
	        this.id_descuento = id_descuento;
	    }

	    public String getDia() {
	        return dia;
	    }

	    public void setDia(String dia) {
	        this.dia = dia;
	    }

	    public float getPorcentaje() {
	        return porcentaje;
	    }

	    public void setPorcentaje(float porcentaje) {
	        this.porcentaje = porcentaje;
	    }

	    public int getPrecioFinal() {
	        return precioFinal;
	    }

	    public void setPrecioFinal(int precioFinal) {
	        this.precioFinal = precioFinal;
	    }

	@Override
		public String toString() {
			return "Descuento [id_descuento=" + id_descuento + ", dia=" + dia + ", porcentaje=" + porcentaje
					+ ", precioFinal=" + precioFinal + "]";
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
