package LN;

public class clsCoche {
	private int numeroBastidor;
	private String color;
	private String patrocinadorPrincipal;
	
	public clsCoche(int numeroBastidor, String color, String patrocinadorPrincipal) {
		super();
		this.numeroBastidor = numeroBastidor;
		this.color = color;
		this.patrocinadorPrincipal = patrocinadorPrincipal;
	}

	public int getNumeroBastidor() {
		return numeroBastidor;
	}

	public void setNumeroBastidor(int numeroBastidor) {
		this.numeroBastidor = numeroBastidor;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPatrocinadorPrincipal() {
		return patrocinadorPrincipal;
	}

	public void setPatrocinadorPrincipal(String patrocinadorPrincipal) {
		this.patrocinadorPrincipal = patrocinadorPrincipal;
	}
	
	
}
