package modelo;

public class Alumno

extends Persona

{

	// Crear los atributos de la clase

	private int legajo;

	private String nombre;

	// Crear las asociaciones a otras clases e interfaces

	// Crear los punteros a otras clases por composicion

	// Crear los punteros a otras clases por agregacion

	public Alumno() {
	}

	public Alumno(int legajo, String nombre

	) {

		this.legajo = legajo;

		this.nombre = nombre;

	}

	// Crear getter y setter de atributos

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	// Crear getter y setter de referencias de asociacion

	// Crear getter y setter de referencias de composicion

	// Crear getter y setter de referencias de agregacion

	// Metodos de la clase

	// Metodos redefinidos de una herencia de clases

	// Métodos heredados de Alumno

	// Métodos heredados de Persona

	// Métodos heredados de Abuelo

	@Override
	public boolean besar() {

		// Implemente el codigo;

		return false;

	}

}
