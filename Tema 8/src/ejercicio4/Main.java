package ejercicio4;

public class Main {

	public static void main(String[] args) {
		int precioE = 0;
		int precioL = 0;
		int precioT = 0;
		int precioB = 0;
		int precioTotal = 0;
		int random;
		Electrodomestico[] elec = new Electrodomestico[10];
		for (int i = 0; i < elec.length; i++) {
			elec[i] = new Electrodomestico();
			random = (int) (Math.random() * 3);
			switch (random) {
			case 0:
				precioB = elec[i].getPrecio();
				elec[i].precioFinal();
				System.out.println(precioB + "€");
				precioE += elec[i].getPrecio();
				break;
			case 1:
				elec[i] = new Lavadora();
				precioB = elec[i].getPrecio();
				elec[i].precioFinal();
				System.out.println(precioB + "€");
				precioL += elec[i].getPrecio();
				break;
			case 2:
				elec[i] = new Television();
				precioB = elec[i].getPrecio();
				elec[i].precioFinal();
				System.out.println(precioB + "€");
				precioT += elec[i].getPrecio();
			}
		}
		
		precioTotal = precioE+precioL+precioT;
		System.out.println("El precio total es:\n - Electrodomesticos: " + precioE + "€\n" + " - Lavadoras: " + precioL
				+ "€\n" + " - Televisores: " + precioT + "€\n" + " - Precio Total: " + precioTotal + "€");

	}

}
