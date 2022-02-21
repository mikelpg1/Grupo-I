package LN;

import java.util.Date;

public class clsPiloto {
	private int numero;
	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	private String equipoAnterior;
	private String gp_Ganados;
	private int podios;
	private Date fechaDebut;
	private int mundialesGanados;
	private int puntos;
	
	public clsPiloto(int numero, String nombre, String apellido, Date fechaNacimiento, String equipoAnterior, String gp_Ganados,
			int podios, Date fechaDebut, int mundialesGanados, int puntos) {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.equipoAnterior = equipoAnterior;
		this.gp_Ganados = gp_Ganados;
		this.podios = podios;
		this.fechaDebut = fechaDebut;
		this.mundialesGanados = mundialesGanados;
		this.puntos = puntos;
	}
		
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEquipoAnterior() {
		return equipoAnterior;
	}

	public void setEquipoAnterior(String equipoAnterior) {
		this.equipoAnterior = equipoAnterior;
	}

	public String getGp_Ganados() {
		return gp_Ganados;
	}

	public void setGp_Ganados(String gp_Ganados) {
		this.gp_Ganados = gp_Ganados;
	}

	public int getPodios() {
		return podios;
	}

	public void setPodios(int podios) {
		this.podios = podios;
	}

	public Date getFechaDebut() {
		return fechaDebut;
	}

	public void setFechaDebut(Date fechaDebut) {
		this.fechaDebut = fechaDebut;
	}

	public int getMundialesGanados() {
		return mundialesGanados;
	}

	public void setMundialesGanados(int mundialesGanados) {
		this.mundialesGanados = mundialesGanados;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
}
