package modelo;

public abstract class Persona

extends Abuelo

implements Ijugador, Ifumador

{

	// Crear los atributos de la clase

	// Crear las asociaciones a otras clases e interfaces

	private IVolador iVolador;

	private Domicilio personaDomicilio;

	// Crear los punteros a otras clases por composicion

	private Domicilio personaComputadora = new Domicilio();

	// Crear los punteros a otras clases por agregacion

	public Persona() {
	}

	// Crear getter y setter de atributos

	// Crear getter y setter de referencias de asociacion

	public void setIVolador(IVolador iVolador) {
		this.iVolador = iVolador;
	}

	public IVolador getIVolador() {
		return iVolador;
	}

	public void setPersonaDomicilio(Domicilio personaDomicilio) {
		this.personaDomicilio = personaDomicilio;
	}

	public Domicilio getPersonaDomicilio() {
		return personaDomicilio;
	}

	// Crear getter y setter de referencias de composicion

	public void setPersonaComputadora(Domicilio personaComputadora) {
		this.personaComputadora = personaComputadora;
	}

	public Domicilio getPersonaComputadora() {
		return personaComputadora;
	}

	// Crear getter y setter de referencias de agregacion

	// Metodos de la clase

	// Metodos de las interfaces realizadas 

	public int jugar() {

		// Implemente el codigo;

		return 0;

	}

}
