package enumerador;

//public enum Talla { MINI, MEDIANO, GRANDE, MUY_GRANDE};

public enum Talla {
	MINI("S"), MEDIANO ("M"), GRANDE("L"), MUY_GRANDE ("XL");
	
	private Talla (String abreviatura) {
		this.abreviatura = abreviatura;
	}
	
	public String dameAbreviatura() { //GETTER
		return abreviatura;
	}
	
	private String abreviatura;
}
