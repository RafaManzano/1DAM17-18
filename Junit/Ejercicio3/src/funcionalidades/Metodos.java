package funcionalidades;
import java.lang.reflect.Array;
import java.util.*;
public class Metodos {

	public char[] GenerarCharAleatorio(int numero, boolean vocal) {
		Random aleatorio = new Random();
		char[] array = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','u','v','w','x','y','z'};
		
		for (int i = 0; i < numero; i++) {
			array[i] = array[aleatorio.nextInt()];
			if (array[0] == 'a' && array[0] == 'e' && array[0] == 'i' && array[0] == 'o' && array[0] == 'u') {
				vocal = true;
			}
			else {
				vocal = false;
			}
		}
		
		
		
		return array;
		
	}
}
