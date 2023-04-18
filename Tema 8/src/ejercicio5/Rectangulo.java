package ejercicio5;
/**
 * Clase de los rectangulos, hijo de los poligonos
 * @author Jaime Sevilla
 *
 */
public class Rectangulo extends Poligono {
	/**
	 * Lado1 es la base del rectangulo
	 */
	protected double lado1;
	/**
	 * Lado2 es la altura del rectangulo
	 */
	protected double lado2;
	/**
	 * Constructor por defecto
	 * @param numLados Numero de lados dado por el usuario
	 */
	public Rectangulo(int numLados) {
		super(numLados);
	}
	/**
	 * Constructor con todos los parametros
	 * @param numLados Numero de lados dado por el usuario
	 * @param lado1 Base del rectangulo dado por el usuario
	 * @param lado2 Altura del rectangulo dada por el usuario
	 */
	public Rectangulo(int numLados, double lado1, double lado2) {
		super(numLados);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	@Override
	public double area() {
		return lado1 * lado2;
	}

	@Override
	public String toString() {
		return "Rectangulo [lado1=" + lado1 + ", lado2=" + lado2 + ", area=" + area() + "]";
	}

}
