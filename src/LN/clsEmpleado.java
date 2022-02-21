package LN;

import java.util.Date;

public class clsEmpleado {
	private int idEmpleado;
	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	private String equipoAnterior;
	private int temporadaDebut;
	
	public clsEmpleado(int idEmpleado, String nombre, String apellido, Date fechaNacimiento, String equipoAnterior,
			int temporadaDebut) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.equipoAnterior = equipoAnterior;
		this.temporadaDebut = temporadaDebut;
	}
	
	public int getId() {
		return idEmpleado;
	}
	public void setId(int id) {
		this.idEmpleado = idEmpleado;
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
	public int getTemporadaDebut() {
		return temporadaDebut;
	}
	public void setTemporadaDebut(int temporadaDebut) {
		this.temporadaDebut = temporadaDebut;
	}
}
