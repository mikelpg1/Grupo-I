package LN;

import java.util.Date;

public class clsMecanico extends clsEmpleado {
	
	private int idMecanico;
	private String especialidad;
	private String areaTrabajo;
	private String puestoTrabajo;
	
	public clsMecanico(int idEmpleado, String nombre, String apellido, Date fechaNacimiento, String equipoAnterior,
			int temporadaDebut, int idMecanico, String especialidad, String areaTrabajo, String puestoTrabajo) {
		super(idEmpleado, nombre, apellido, fechaNacimiento, equipoAnterior, temporadaDebut);

		this.idMecanico = idMecanico;
		this.especialidad = especialidad;
		this.areaTrabajo = areaTrabajo;
		this.puestoTrabajo = puestoTrabajo;
	}

	public int getIdMecanico() {
		return idMecanico;
	}

	public void setIdMecanico(int idMecanico) {
		this.idMecanico = idMecanico;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getAreaTrabajo() {
		return areaTrabajo;
	}

	public void setAreaTrabajo(String areaTrabajo) {
		this.areaTrabajo = areaTrabajo;
	}

	public String getPuestoTrabajo() {
		return puestoTrabajo;
	}

	public void setPuestoTrabajo(String puestoTrabajo) {
		this.puestoTrabajo = puestoTrabajo;
	}
	
	
}
