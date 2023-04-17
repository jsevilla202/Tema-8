package ejercicio4;

public class Electrodomestico {
	private double precio;
	private Color color;
	private Consumo consumo;

	enum Consumo {
		A, B, C, D, E, F
	};

	private double peso;

	enum Color {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}

	public Electrodomestico() {
		super();
		color = Color.valueOf("BLANCO");
		consumo = Consumo.valueOf("F");
		precio = 100;
		peso = 5;
	}

	public Electrodomestico(double precio, double peso) {
		super();
		this.precio = precio;
		this.peso = peso;
	}

	public Electrodomestico(double precio, String color, char consumo, double peso) {
		super();
		if (!(comprobarColor(color) && comprobarConsumoEnergetico(consumo))) {
			this.precio = precio;
			this.peso = peso;
		} else {
			this.precio = precio;
			this.color = Color.valueOf(color);
			String consumos = String.valueOf(consumo);
			this.consumo = Consumo.valueOf(consumos);
			this.peso = peso;
		}
	}

	public double getPrecio() {
		return precio;
	}

	public Color getColor() {
		return color;
	}

	public Consumo getConsumo() {
		return consumo;
	}

	public double getPeso() {
		return peso;
	}

	private boolean comprobarConsumoEnergetico(char letra) {
		boolean comprueba = false;
		letra = Character.toUpperCase(letra);
		String letras = String.valueOf(letra);
		try {
			for (Consumo consumo : Consumo.values()) {
				if (consumo.name().equals(letras)) {
					comprueba = true;
					break;
				}
			}
		} catch (Exception e) {
			comprueba = false;
		}
		return comprueba;
	}

	private boolean comprobarColor(String color) {
		boolean comprueba = false;
		color = color.toUpperCase();
		try {
			for (Color colors : Color.values()) {
				if (colors.name().equals(color)) {
					comprueba = true;
					break;
				}
			}
		} catch (Exception e) {
			comprueba = false;
		}
		return comprueba;
	}

	private void precioFinal() {
		int precioF = 0;
		String letra = String.valueOf(consumo);
		switch (letra) {
		case "A":
			precioF += 100;
			break;
		case "B":
			precioF += 80;
			break;
		case "C":
			precioF += 60;
			break;
		case "D":
			precioF += 50;
			break;
		case "E":
			precioF += 30;
			break;
		case "F":
			precioF += 10;
			break;
		}

		if (peso >= 0 && peso <= 19) {
			precioF += 10;
		} else if (peso >= 20 && peso <= 49) {
			precioF += 50;
		} else if (peso >= 50 && peso <= 79) {
			precioF += 80;
		} else {
			precioF += 100;
		}

		precio = precioF;
	}
}
