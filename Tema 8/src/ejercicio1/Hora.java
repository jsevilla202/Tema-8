package ejercicio1;

public class Hora {
	protected int hora;
	protected int minuto;
	
	Hora(int hora, int minuto){
		this.hora = hora;
		this.minuto = minuto;
	}
	
	void inc() {
		this.minuto++;
	}
	
	boolean setMinutos(int valor) {
		boolean correcto = false;
		if(valor>=0&&valor<=59) {
			correcto = true;
		}
		return correcto;
	}
	
	boolean setHora(int valor) {
		boolean correcto = false;
		if(valor>=0&&valor<=23) {
			correcto = true;
		}
		return correcto;
	}

	@Override
	public String toString() {
		return "Hora [hora=" + hora + ", minuto=" + minuto + "]";
	}
	
}
