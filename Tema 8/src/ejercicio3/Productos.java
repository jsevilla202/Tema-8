package ejercicio3;

public class Productos {
	protected String Nombre;
	protected double Precio;
	
	public Productos() {
		super();
	}
	
	public Productos(String nombre, double precio) {
		super();
		Nombre = nombre;
		Precio = precio;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

	@Override
	public String toString() {
		return "Nombre = " + Nombre + ", Precio= " + Precio;
	}
	
	double calcular(int cantidad) {
		return Precio*cantidad;
	}
}
