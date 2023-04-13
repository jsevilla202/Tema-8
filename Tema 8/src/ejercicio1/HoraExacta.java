package ejercicio1;

public class HoraExacta extends Hora {
	protected int segundo;

	HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);
		this.segundo = segundo;
	}

	public void setSegundo(int segundo) {
		if (segundo >= 0 && segundo <= 59) {
			this.segundo = segundo;
		}
	}
	
	void incs() {
		segundo++;
		if (segundo == 60) {
			segundo = 0;
			super.incm();
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + ":" + segundo;
	}
}
