package ejercicio5;
/**
 * Clase de todos los poligonos
 * @author Jaime Sevilla
 *
 */
public abstract class Poligono {
	/**
	 * Numero de lados del poligono
	 */
	protected int numLados;

	@Override
	public abstract String toString();
	/**
	 * Calcula el area del poligono
	 * @return Devuelve si area
	 */
	public abstract double area();
	/**
	 * Constructor con parametros
	 * @param numLados Numero de lados dado por el usuario
	 */
	public Poligono(int numLados) {
		super();
		this.numLados = numLados;
	}
	/**
	 * Getter del numero de lados
	 * @return Devuelve el numero de lados
	 */
	public int getNumLados() {
		return numLados;
	}
}
