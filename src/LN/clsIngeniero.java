package LN;

import java.util.Date;

public class clsIngeniero extends clsEmpleado{
	
	private int idIngeniero;
	private String areaTrabajo;
	private String puestoTrabajo;
	
	public clsIngeniero(int idEmpleado, String nombre, String apellido, Date fechaNacimiento, String equipoAnterior,
			int temporadaDebut, int idIngeniero, String areaTrabajo, String puestoTrabajo) {
		super(idEmpleado, nombre, apellido, fechaNacimiento, equipoAnterior, temporadaDebut);
		this.idIngeniero = idIngeniero;
		this.areaTrabajo = areaTrabajo;
		this.puestoTrabajo = puestoTrabajo;
	}

	public int getIdIngeniero() {
		return idIngeniero;
	}

	public void setIdIngeniero(int idIngeniero) {
		this.idIngeniero = idIngeniero;
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
