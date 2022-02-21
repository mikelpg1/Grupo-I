package LN;

public class clsGranPremio {
	private String nombreGranPremio;
	private String ultimoGanador;
	private String vuletaRapida;
	private String circuito;
	private String pais;
	private String ciudad;
	private int puntosEscuderia;
	
	public clsGranPremio(String nombreGranPremio, String ultimoGanador, String vuletaRapida, String circuito,
			String pais, String ciudad, int puntosEscuderia) {
		super();
		this.nombreGranPremio = nombreGranPremio;
		this.ultimoGanador = ultimoGanador;
		this.vuletaRapida = vuletaRapida;
		this.circuito = circuito;
		this.pais = pais;
		this.ciudad = ciudad;
		this.puntosEscuderia = puntosEscuderia;
	}

	public String getNombreGranPremio() {
		return nombreGranPremio;
	}

	public void setNombreGranPremio(String nombreGranPremio) {
		this.nombreGranPremio = nombreGranPremio;
	}

	public String getUltimoGanador() {
		return ultimoGanador;
	}

	public void setUltimoGanador(String ultimoGanador) {
		this.ultimoGanador = ultimoGanador;
	}

	public String getVuletaRapida() {
		return vuletaRapida;
	}

	public void setVuletaRapida(String vuletaRapida) {
		this.vuletaRapida = vuletaRapida;
	}

	public String getCircuito() {
		return circuito;
	}

	public void setCircuito(String circuito) {
		this.circuito = circuito;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getPuntosEscuderia() {
		return puntosEscuderia;
	}

	public void setPuntosEscuderia(int puntosEscuderia) {
		this.puntosEscuderia = puntosEscuderia;
	}
	
	
}
