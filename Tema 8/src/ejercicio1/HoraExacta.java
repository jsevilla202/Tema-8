package ejercicio1;

/**
 * Clase hijo de Hora
 * 
 * @author Jaime Sevilla
 *
 */
public class HoraExacta extends Hora {
	/**
	 * Parametro de los segundos
	 */
	protected int segundo;

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param hora    Hora dada por el usuario
	 * @param minuto  Minutos dados por el usuario
	 * @param segundo Segundos dados por el usaurio
	 */
	HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);
		this.segundo = segundo;
	}

	/**
	 * Setter de Segundos
	 * 
	 * @param segundo Segundos dados por el usaurio
	 */
	public void setSegundo(int segundo) {
		if (segundo >= 0 && segundo <= 59) {
			this.segundo = segundo;
		}
	}

	@Override
	void inc() {
		segundo++;
		if (segundo == 60) {
			segundo = 0;
			super.inc();
		}
	}

	@Override
	public String toString() {
		return super.toString() + ":" + segundo;
	}
}
