package ejercicio2;

/**
 * Clase hijo de Operario
 * 
 * @author Jaime Sevilla
 *
 */
public class Tecnico extends Operario {
	/**
	 * Constructor por defecto
	 */
	public Tecnico() {
		super();
	}

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param nombre Nombre dado por el usuario
	 */
	public Tecnico(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return super.toString() + " -> Tecnico";
	}
}
