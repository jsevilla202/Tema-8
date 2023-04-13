package ejercicio3;
/**
 * Clase hijo de Pruductos
 * @author Jaime Sevilla
 *
 */
public class Perecederos extends Productos{
	/**
	 * Dias que le faltan para caducar
	 */
	private int DiasCaducar;
	/**
	 * Constructor por defecto
	 */
	public Perecederos() {
		super();
	}

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param nombre      Nombre del producto dado por el usuario
	 * @param precio      Precio del producto dado por el usuario
	 * @param diasCaducar Dias a caducar del producto dado por el usuario
	 */
	public Perecederos(String nombre, double precio, int diasCaducar) {
		super(nombre, precio);
		DiasCaducar = diasCaducar;
	}
/**
 * Getter de DiasCaducar
 * @return Devuelve el valor de DiasCaducar
 */
	public int getDiasCaducar() {
		return DiasCaducar;
	}
/**
 * Setter de DiasCaducar
 * @param diasCaducar Dias para caducar dados por el usuario
 */
	public void setDiasCaducar(int diasCaducar) {
		DiasCaducar = diasCaducar;
	}

	@Override
	public String toString() {
		return super.toString()  + ", " + "DiasCaducar=" + DiasCaducar;
	}
	/**
	 * Calcula el precio del stock del producto
	 */
	double calcular(int cantidad) {
		double preciofinal = 0;
		if(DiasCaducar==1) {
			preciofinal = (super.calcular(cantidad))/4;
		}
		else if(DiasCaducar==2) {
			preciofinal = (super.calcular(cantidad))/3;
		}
		else if(DiasCaducar==3) {
			preciofinal = (super.calcular(cantidad))/2;
		}
		else {
			preciofinal = super.calcular(cantidad);
		}
		return preciofinal;
	}
}
