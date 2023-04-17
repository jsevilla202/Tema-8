package ejercicio4;

public class Lavadora extends Electrodomestico {
	private int carga;

	public Lavadora() {
		super();
		this.carga = 5;
	}

	public Lavadora(int precio, double peso, int carga) {
		super(precio, peso);
		this.carga = carga;
		precioFinal();
	}

	public Lavadora(int precio, String color, char consumo, double peso, int carga) {
		super(precio, color, consumo, peso);
		this.carga = carga;
		precioFinal();
	}

	public int getCarga() {
		return carga;
	}

	@Override
	public void precioFinal() {
		super.precioFinal();
		if (carga >= 30) {
			precio += 50;
		}

	}

}
