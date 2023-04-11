package ejercicio1;

public class HoraExacta extends Hora{
	int segundo;
	HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);
		this.segundo = segundo;
	}
	
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	void inc() {
		segundo++;
		if(segundo==60) {
			
		}
	}
}
