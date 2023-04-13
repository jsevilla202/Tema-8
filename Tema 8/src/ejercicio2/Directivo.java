package ejercicio2;
/**
 * Clase hijo de Empleado
 * @author Jaime Sevilla
 *
 */
public class Directivo extends Empleado{
/**
 * Constructor por defecto
 */
	public Directivo() {
		super();
	}

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param nombre Nombre dado por el usuario
	 */
	public Directivo(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return super.toString() + " -> Directivo";
	}
	
	
}
