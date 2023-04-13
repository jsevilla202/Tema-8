package ejercicio1;

/**
 * Clase de Hora
 * 
 * @author Jaime Sevilla
 *
 */
public class Hora {
	/**
	 * Parametro de la hora
	 */
	protected int hora;
	/**
	 * Parametro de los minutos
	 */
	protected int minuto;

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param hora   Hora dada por el usuario
	 * @param minuto Minutos dados por el usuario
	 */
	Hora(int hora, int minuto) {
		this.hora = hora;
		this.minuto = minuto;
	}

	/**
	 * Incrementa en 1 los minutos
	 */
	void inc() {
		this.minuto++;
		if (minuto == 60) {
			minuto = 0;
			hora++;
			if (hora == 24) {
				hora = 0;
			}
		}
	}

	/**
	 * Comprueba si los minutos estan bien
	 * 
	 * @param valor Valor a comprobar
	 * @return True/False
	 */
	boolean setMinutos(int valor) {
		boolean correcto = false;
		if (valor >= 0 && valor <= 59) {
			correcto = true;
		}
		return correcto;
	}

	/**
	 * Comprueba si la hora esta bien
	 * 
	 * @param valor Valor a comprobar
	 * @return True/False
	 */
	boolean setHora(int valor) {
		boolean correcto = false;
		if (valor >= 0 && valor <= 23) {
			correcto = true;
		}
		return correcto;
	}

	@Override
	public String toString() {
		return hora + ":" + minuto;
	}

}
