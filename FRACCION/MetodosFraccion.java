 public class MetodosFraccion{
	 
/* Nombre: PresentarMenu
 * MT:
 * 	Necesidades: No hay
 * 	Devoluciones: No hay
 * 	Necesidades/Devoluciones: No hay
 * 	Requisitos: No hay
 * 
 * Interfaz:
 * 	Comentario: Pinta el menu en pantalla
 * 	Cabecera: void PresentarMenu(){
 * 	Precondiciones: No hay
 * 	Entrada: no hay
 * 	Salida: No hay
 * 	Entrada/Salida: No hay
 * 	Postcondiciones:  No hay
 */
		public static void PresentarMenu(){
			System.out.println("Elija una de las opciones: ");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicacion");
			System.out.println("4. Division");
			System.out.println("0. Salir");
		}
		
			
/* Nombre: Suma
 * MT:
 * 	Necesidades: Dos fracciones
 * 	Devoluciones: Una fraccion
 * 	Necesidades/Devoluciones: No hay
 * 	Requisitos: No hay
 * 
 * //Interfaz
 * 
 * Interfaz modificada para Java:
 * 	Comentario: Sumar dos fracciones
 * 	Cabecera: void Suma (double num1, double num2, double den1, double den2)
 * 	Precondiciones: No hay
 * 	Entrada: Cuatro numeros reales
 * 	Salida: No hay
 * 	Entrada/Salida: No hay
 * 	Postcondiciones:  No hay. Solo pinta en pantalla el resultado
 */
		  public static void Suma (double num1, double num2, double den1, double den2){
			  System.out.println("En resguardo");
			  System.out.println("-----------------------------------------------------------------------------------------------------");
		  }


/* Nombre: Resta
 * MT:
 * 	Necesidades: Dos fracciones
 * 	Devoluciones: Una fraccion
 * 	Necesidades/Devoluciones: No hay
 * 	Requisitos: No hay
 * 
 * Interfaz:
 * 	Comentario: Restar dos fracciones
 * 	Cabecera: void Resta (double num1, double num2, double den1, double den2)
 * 	Precondiciones: No hay
 * 	Entrada: Cuatro numeros reales
 * 	Salida: No hay
 * 	Entrada/Salida: No hay
 * 	Postcondiciones:  No hay
 */
	 
	 public static void Resta (double num1, double num2, double den1, double den2){
			  System.out.println("En resguardo");
			  System.out.println("-----------------------------------------------------------------------------------------------------");
		  }

	 
/* Nombre: Multiplicacion
 * MT:
 * 	Necesidades: Dos fracciones
 * 	Devoluciones: Una fraccion
 * 	Necesidades/Devoluciones: No hay
 * 	Requisitos: No hay
 * 
 * Interfaz:
 * 	Comentario: Multiplicar dos fracciones
 * 	Cabecera: void Multiplicacion (double num1, double num2, double den1, double den2)
 * 	Precondiciones: No hay
 * 	Entrada: Cuatro numeros reales
 * 	Salida: No hay
 * 	Entrada/Salida: No hay
 * 	Postcondiciones:  No hay
 */
		public static void Multiplicacion (double num1, double num2, double den1, double den2){
				  double resultadonum = 0.0;
				  double resultadoden = 0.0;
				  resultadonum = num1 * num2;
				  resultadoden = den1 * den2;
				  System.out.println(resultadonum);
				  System.out.println("___" );
				  System.out.println(resultadoden);
				  System.out.println("-----------------------------------------------------------------------------------------------------");
		 }
		 
/* Nombre: Division
 * MT:
 * 	Necesidades: Dos fracciones
 * 	Devoluciones: Una Fraccion
 * 	Necesidades/Devoluciones: No hay
 * 	Requisitos: No hay
 * 
 * Interfaz:
 * 	Comentario: Dividir dos fracciones
 * 	Cabecera: void Division (double num1, double num2, double den1, double den2)
 * 	Precondiciones: No hay
 * 	Entrada: Cuatro numeros reales
 * 	Salida: No hay
 * 	Entrada/Salida: No hay
 * 	Postcondiciones:  No hay
 */
		 
		 public static void Division (double num1, double num2, double den1, double den2){
				  double resultadonum = 0.0;
				  double resultadoden = 0.0;
				  resultadonum = num1 * den2;
				  resultadoden = num2 * den1;
				  System.out.println(resultadonum);
				  System.out.println("___" );
				  System.out.println(resultadoden);
				  System.out.println("-----------------------------------------------------------------------------------------------------");
		 }
}
	   
		 
