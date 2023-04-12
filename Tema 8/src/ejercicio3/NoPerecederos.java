package ejercicio3;

public class NoPerecederos extends Productos{
	private String Tipo;
	
	public NoPerecederos() {
		super();
	}

	public NoPerecederos(String nombre, double precio, String tipo) {
		super(nombre, precio);
		Tipo = tipo;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	@Override
	public String toString() {
		return super.toString()  + ", " + "Tipo = " + Tipo;
	}
	
	double calcular(int cantidad) {
		return Precio*cantidad;
	}
}
