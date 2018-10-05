/* Necesidades: GradoCelsius
 * Devoluciones: GradoFarenheit
 * Necesidades/Devoluciones: No hay
 * Restricciones: No hay
 * 
 * Cabecera: double GradoCelsiusFarenheit (double GradoCelsius)
 * BreveComentario: Pasar de celsius a farenheit
 * Precondiciones: No hay
 * Entrada: GradosCelsius
 * Salida: GradosFarenheit
 * Entrada/Salida: No hay
 * Postcondiciones: Que los grados celsius se han convertido en grados farenheit
*/

public class MetodosTemperatura{


	public static double gradoCelsiusFarenheit (double GradoCelsius){
		double GradosFarenheit = 0;
		
		GradosFarenheit = ((9 * GradoCelsius) / 5) + 32;
		
		return GradosFarenheit;
	}
	
	
	public static double gradoFarenheitCelsius (double GradoFarenheit){
		double GradosCelsius = 0;
		
		GradosCelsius = (5 *(GradoFarenheit - 32) / 9);
		
		return GradosCelsius;
	}
	
	public static double gradoKelvinCelsius (double GradoKelvin) {
		double GradoCelsius = 0;
		
		GradoCelsius = GradoKelvin - 273.15;
		
		return GradoCelsius;
	}

}






