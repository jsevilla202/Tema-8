package ejercicio1;

public class Hora {
	protected int hora;
	protected int minuto;

	Hora(int hora, int minuto) {
		this.hora = hora;
		this.minuto = minuto;
	}

	void incm() {
		this.minuto++;
		if (minuto == 60) {
			minuto = 0;
			hora++;
			if (hora == 24) {
				hora = 0;
			}
		}
	}

	boolean setMinutos(int valor) {
		boolean correcto = false;
		if (valor >= 0 && valor <= 59) {
			correcto = true;
		}
		return correcto;
	}

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
