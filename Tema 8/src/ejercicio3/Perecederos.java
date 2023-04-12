package ejercicio3;

public class Perecederos extends Productos{
	private int DiasCaducar;

	public Perecederos() {
		super();
	}

	public Perecederos(String nombre, double precio, int diasCaducar) {
		super(nombre, precio);
		DiasCaducar = diasCaducar;
	}

	public int getDiasCaducar() {
		return DiasCaducar;
	}

	public void setDiasCaducar(int diasCaducar) {
		DiasCaducar = diasCaducar;
	}

	@Override
	public String toString() {
		return super.toString()  + ", " + "DiasCaducar=" + DiasCaducar;
	}
	
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
