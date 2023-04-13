package ejercicio2;

/**
 * Clase hijo de
 * 
 * @author Jaime Sevilla
 *
 */
public class Operario extends Empleado {
	/**
	 * Constructor por defecto
	 */
	public Operario() {
		super();
	}

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param nombre Nombre dado por el usuario
	 */
	public Operario(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return super.toString() + " -> Operario";
	}
}
