package enumerador;

import java.util.*;

public class Uso_Tallas {

	public static void main(String[] args) {
		/*
		Talla s = Talla.MINI;
		
		Talla m = Talla.MEDIANO;
		
		Talla l = Talla.GRANDE;
		
		Talla xl = Talla.MUY_GRANDE;
		*/
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Escribe una talla, por favor (MINI, MEDIANO, GRANDE O MUY_GRANDE)");
		
		String entrada_datos = teclado.next().toUpperCase();
		
		Talla la_talla = Enum.valueOf(Talla.class, entrada_datos);
		
		System.out.println("Talla = " + la_talla);
		
		System.out.println("Abreviatura = " + la_talla.dameAbreviatura());
		
	}

}
