
public class Sala {
	private int id_sala;
    private int numero;
    private String formato;

    public Sala () {}

    public Sala(int id_sala, int numero, String formato) {
        super();
        this.id_sala = id_sala;
        this.numero = numero;
        this.formato = formato;
    }

    public int getId_sala() {
        return id_sala;
    }

    public void setId_sala(int id_sala) {
        this.id_sala = id_sala;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "Sala [id_sala=" + id_sala + ", numero=" + numero + ", formato=" + formato + "]";
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
