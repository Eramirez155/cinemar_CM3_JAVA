package constructoresClaseCinemar;

public class TipoPelicula {
	private int id_Tipo_Pelicula;
	private String idioma;
	private String formato;
	private boolean subtitulada;
	
	public TipoPelicula() {
		
	}
	
	public TipoPelicula(int id_Tipo_Pelicula, String idioma, String formato, boolean subtitulada) {
		super();
		this.id_Tipo_Pelicula = id_Tipo_Pelicula;
		this.idioma = idioma;
		this.formato = formato;
		this.subtitulada = subtitulada;
	}

	public int getid_Tipo_Pelicula() {
		return id_Tipo_Pelicula;
	}

	public void setid_Tipo_Pelicula(int id_Tipo_Pelicula) {
		this.id_Tipo_Pelicula = id_Tipo_Pelicula;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public boolean isSubtitulada() {
		return subtitulada;
	}

	public void setSubtitulada(boolean subtitulada) {
		this.subtitulada = subtitulada;
	}

	@Override
	public String toString() {
		return "TipoPelicula [id_Tipo_Pelicula=" + id_Tipo_Pelicula + ", idioma=" + idioma + ", formato=" + formato
				+ ", subtitulada=" + subtitulada + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
