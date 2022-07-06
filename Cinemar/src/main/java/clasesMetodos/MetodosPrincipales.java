package clasesMetodos;

import clasesMetodos.Descuento;

public class MetodosPrincipales {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Descuento mi_dec = new Descuento();
			mi_dec.cambia_descuento("'domingo'", 0.9);
			mi_dec.cambia_descuento("'sabado'", 0.7);
			mi_dec.actualizar_descuento(1, "'Martes'", 12,999);
			mi_dec.actualizar_descuento(2, "'Lunes'", 80,100);
		}

	}
