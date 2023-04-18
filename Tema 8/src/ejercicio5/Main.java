package ejercicio5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcion = 0;
		double lado1 = 0;
		double lado2 = 0;
		double lado3 = 0;
		Poligono poli[] = new Poligono[0];
		Scanner sc = new Scanner(System.in);

		while (opcion != 4) {
			System.out.print("POLIGONOS\n======================================"
					+ "\n 1. Introducir triángulo.\n 2. Introducir rectángulo.\n 3. Mostrar contenido del array.\n 4. Salir\n¿Qué desea hacer? ");
			opcion = sc.nextInt();
			System.out.println();
			switch (opcion) {
			case 1:
				do {
					System.out.print("Inserte el valor de a: ");
					lado1 = sc.nextDouble();
					System.out.print("Inserte el valor de b: ");
					lado2 = sc.nextDouble();
					System.out.print("Inserte el valor de c: ");
					lado3 = sc.nextDouble();
				} while (lado1 <= 0 || lado2 <= 0 || lado3 <= 0);
				poli = Arrays.copyOf(poli, poli.length + 1);
				poli[poli.length - 1] = new Triangulo(3, lado1, lado2, lado3);
				break;
			case 2:
				do {
					System.out.print("Inserte el valor de la base: ");
					lado1 = sc.nextDouble();
					System.out.print("Inserte el valor de la altura: ");
					lado2 = sc.nextDouble();
				} while (lado1 <= 0 || lado2 <= 0);
				poli = Arrays.copyOf(poli, poli.length + 1);
				poli[poli.length - 1] = new Rectangulo(4, lado1, lado2);
				break;
			case 3:
				for (int i = 0; i < poli.length; i++) {
					System.out.println(poli[i].toString());
					System.out.println();
				}
				break;
			case 4:
				break;
			}
			System.out.println();
		}
		sc.close();

	}

}
