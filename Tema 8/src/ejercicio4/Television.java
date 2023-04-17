package ejercicio4;

public class Television extends Electrodomestico{
	private double resolucion;
	private boolean sintonizador;
	
	public Television() {
		super();
		resolucion = 20;
		sintonizador = false;
	}

	public Television(int precio, double peso) {
		super(precio, peso);
	}

	public Television(int precio, String color, char consumo, double peso, double resolucion, boolean sintonizador) {
		super(precio, color, consumo, peso);
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;
	}

	public double getResolucion() {
		return resolucion;
	}

	public boolean isSintonizador() {
		return sintonizador;
	}
	
	@Override
	public void precioFinal() {
		if(resolucion>=40) {
			precio += precio*0.3;
		}
		if(isSintonizador()) {
			precio += 50;
		}
	}
	
	
}
