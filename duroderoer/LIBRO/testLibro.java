/*
 * 
 */


public class testLibro {
	
	public static void main (String[] args) {
		Libro li = new Libro (1234, "titulo" , "autor25", 30);
		Libro lo = new Libro (022, "La historia de mi vida" , "maricarmen", 80);
		
		System.out.println(li.toString());
		System.out.println(lo.toString());
		
		li.setNumPaginas(90);
		
		if (li.getNumPaginas() > lo.getNumPaginas()) {
			System.out.println(li.getTitulo () + " tiene mas pagina");
			
		}
		else {
			System.out.println(lo.getTitulo () + " tiene mas pagina");
		}
	}
}

