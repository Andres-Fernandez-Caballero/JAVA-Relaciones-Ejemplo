package domain;

public class Materia {

	private String nombre;
	private int cuatrimestre; // TODO cambiar a enum
	
	// Constructores
	
	public Materia() {
		
	}
	
	public Materia(String nombre, int cuatrimestre) {
		this.nombre = nombre;
		this.cuatrimestre = cuatrimestre;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCuatrimestre() {
		return cuatrimestre;
	}


	public void setCuatrimestre(int cuatrimestre) {
		this.cuatrimestre = cuatrimestre;
	}
	
	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + ", cuatrimestre=" + cuatrimestre + "]";
	}	
}
