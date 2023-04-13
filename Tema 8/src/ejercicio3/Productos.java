package ejercicio3;

/**
 * Clase de los Productos
 * 
 * @author Jaime Sevilla
 *
 */
public class Productos {
	/**
	 * Nombre del producto
	 */
	protected String Nombre;
	/**
	 * Precio del producto
	 */
	protected double Precio;

	/**
	 * Constructor por defecto
	 */
	public Productos() {
		super();
	}

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param nombre Nombre del producto dado por el usuario
	 * @param precio Precio del producto dado por el usuario
	 */
	public Productos(String nombre, double precio) {
		super();
		Nombre = nombre;
		Precio = precio;
	}

	/**
	 * Getter del Nombre
	 * 
	 * @return Devuelve el valor del nombre
	 */
	public String getNombre() {
		return Nombre;
	}

	/**
	 * Setter de Nombre
	 * 
	 * @param nombre Nombre dado por el usuario
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	/**
	 * getter de Precio
	 * 
	 * @return Devuelve el valor del precio
	 */
	public double getPrecio() {
		return Precio;
	}

	/**
	 * Setter de Precio
	 * 
	 * @param precio Precio dado por el usuario
	 */
	public void setPrecio(double precio) {
		Precio = precio;
	}

	@Override
	public String toString() {
		return "Nombre = " + Nombre + ", Precio= " + Precio;
	}

	/**
	 * Calcula el precio del stock del producto
	 */
	double calcular(int cantidad) {
		return Precio * cantidad;
	}
}
