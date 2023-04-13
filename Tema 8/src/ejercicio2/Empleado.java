package ejercicio2;
/**
 * Clase de los empleados
 * @author Jaime Sevilla
 *
 */
public class Empleado {

	/**
	 * Parametro del nombre de los empleados
	 */
	private String nombre;

	/**
	 * Constructor por defecto
	 */
	public Empleado() {
		super();
	}

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param nombre Nombre dado por el usuario
	 */
	public Empleado(String nombre) {
		super();
		this.nombre = nombre;
	}

	/**
	 * Getter de Nombre
	 * 
	 * @return Devuelve el nombre del empleado
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter de Nombre
	 * 
	 * @param nombre Nombre dado por el usuario
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Empleado " + nombre;
	}

}
