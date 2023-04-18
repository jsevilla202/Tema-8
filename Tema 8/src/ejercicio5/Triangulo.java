package ejercicio5;
/**
 * Clase de los triangulos, hijo de los poligonos
 * @author Jaime Sevilla
 *
 */
public class Triangulo extends Poligono {
	/**
	 * Hipotenusa del triangulo
	 */
	protected double lado1;// Hipotenusa (izquierda)
	/**
	 * Base del triangulo
	 */
	protected double lado2;// Base
	/**
	 * Cateto izquierdo del triangulo
	 */
	protected double lado3;
	/**
	 * Constructor con todos los parametros 
	 * @param numLados Numero de lados dado por el usuario
	 * @param lado1 Hipotenusa del triangulo dado por el usuario
	 * @param lado2 Base del triangulo dado por el usuario
	 * @param lado3 Cateto izquierdo del triangulo dado por el usuario
	 */
	public Triangulo(int numLados, double lado1, double lado2, double lado3) {
		super(numLados);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	/**
	 * Constructor por defecto
	 * @param numLados Numero de lados dado por el usuario
	 */
	public Triangulo(int numLados) {
		super(numLados);
	}

	@Override
	public double area() {
		double s = (lado1 + lado2 + lado3) / 2;
		double a = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
		return a;
	}

	@Override
	public String toString() {
		return "Triangulo [lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + ", area=" + area() + "]";
	}

}
