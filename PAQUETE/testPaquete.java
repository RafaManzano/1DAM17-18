


public class testPaquete {
	
	public static void main (String[] args) {
		Paquete p1 = new Paquete ("Luisa","Dolores Ibarruri 6G",90.0,"Nacional","Contrarrembolso", 10, 20, 30);
		Paquete p2 = new Paquete ("Luisa","Dolores Ibarruri 6G",90.0,"Yolo","Contrarrembolso", 10, 20, 30);
		Paquete p3 = new Paquete ("Luisa","Dolores Ibarruri 6G",90.0,"Nacional","Yolo", 10, 20, 30);
		System.out.println(p1.toString());
		System.out.println(p1.hashCode());
		try {
			p2.setAlcance("Hola");
		}
		catch (ExcepcionPaquete error){
			System.out.println("Para el alcance solo es posible Regional, Nacional e Internacional");
		}
		
		try {
			p3.setTipoPago("Hola");
		}
		catch (ExcepcionPaquete error) {
			System.out.println("Para el tipo de pago solo es posible Contrarrembolso o YaPagado");
		}
		
		System.out.println(p1.getDimensiones());
		
		
	}
}

