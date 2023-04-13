package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int hora;
		int minuto;
		int segundo;
		int opcion = 0;

		HoraExacta horaEC = new HoraExacta(0, 0, 0);

		Scanner sc = new Scanner(System.in);

		while (opcion != 7) {
			System.out.print("HORA\n =============================\n "
					+ "1. Incrementar minuto\n 2. Comprobar valor valido como minuto\n 3. Comprobar valor valido como hora\n 4. Mostrar la hora\n"
					+ " 5. Asignar segundos\n 6. Incrementar segundos\n 7. Salir\n¿Qué desea hacer? ");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				int i = 0;
				while(i<=60) {
					horaEC.inc();
					i++;
				}
				break;
			case 2:
				System.out.print("Inserte el valor de los minutos: ");
				minuto = sc.nextInt();
				horaEC.setMinutos(minuto);
				break;
			case 3:
				System.out.print("Inserte el valor de la hora: ");
				hora = sc.nextInt();
				horaEC.setHora(hora);
				break;
			case 4:
				System.out.println();
				System.out.println(horaEC.toString());
				break;
			case 5:
				System.out.print("Inserte el valor de los segundos: ");
				segundo = sc.nextInt();
				horaEC.setSegundo(segundo);
			case 6:
				horaEC.inc();
			case 7:
				break;
			}
			System.out.println();
		}
		sc.close();

	}

}