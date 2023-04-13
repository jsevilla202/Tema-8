package ejercicio3;

/**
 * Clase hijo de Pruductos
 * 
 * @author Jaime Sevilla
 *
 */
public class NoPerecederos extends Productos {
	/**
	 * Tipo del producto
	 */
	private String Tipo;

	/**
	 * Constructor por defecto
	 */
	public NoPerecederos() {
		super();
	}

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param nombre Nombre dado por el usuario
	 * @param precio Precio dado por el usuario
	 * @param tipo   Tipo dado por el usaurio
	 */
	public NoPerecederos(String nombre, double precio, String tipo) {
		super(nombre, precio);
		Tipo = tipo;
	}

	/**
	 * Getter de Tipo
	 * 
	 * @return Devuelve el valor de tipo
	 */
	public String getTipo() {
		return Tipo;
	}

	/**
	 * Setter de tipo
	 * 
	 * @param tipo Tipo dado por el usuario
	 */
	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + "Tipo = " + Tipo;
	}

	/**
	 * Calcula el precio del stock del producto
	 */
	double calcular(int cantidad) {
		return Precio * cantidad;
	}
}
