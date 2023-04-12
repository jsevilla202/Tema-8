package ejercicio3;

public class Main {

	public static void main(String[] args) {
		int cantidad = 5;
		String tipos[] = {"Plastidos", "Animal", "Planta"};
		Perecederos [] p = new Perecederos[5];
		NoPerecederos [] np = new NoPerecederos[5];
		
		for(int i = 0; i<p.length; i++) {
			p[i] = new Perecederos("Almendra", 12, (int) (Math.random()*5)); 
			np[i] = new NoPerecederos("Plastico", 2, tipos[(int) (Math.random()*3)]); 
			
			System.out.println(p[i].toString());
			System.out.println(p[i].calcular(cantidad));
			System.out.println();
			System.out.println(np[i].toString());
			System.out.println(np[i].calcular(cantidad));
			System.out.println();
		}
		
		
	}

}
