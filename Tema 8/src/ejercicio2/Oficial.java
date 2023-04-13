package ejercicio2;

/**
 * Clase hijo de Operario
 * 
 * @author Jaime Sevilla
 *
 */
public class Oficial extends Operario {
	/**
	 * Constructor por defecto
	 */
	public Oficial() {
		super();
	}

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param nombre Nombre dado por el usuario
	 */
	public Oficial(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return super.toString() + " -> Oficial";
	}
}
