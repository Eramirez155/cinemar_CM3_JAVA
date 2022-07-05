package constructoresClaseCinemar;

public class Sala {
    private int id_sala;
    private int numero;
    private String formato;
    private int capacidad;
    
    public Sala () {}

    public Sala(int id_sala, int numero, String formato, int capacidad) {
        super();
        this.id_sala = id_sala;
        this.numero = numero;
        this.formato = formato;
        this.capacidad = capacidad;
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


    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

        
    @Override
    public String toString() {
        return "Sala [id_sala=" + id_sala + ", numero=" + numero + ", formato=" + formato + ", capacidad=" + capacidad
                + "]";
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}