package examen2012.Junio_ModeloA;

public class Ejercicio_8 {
	
	public static void main(String[] args) {
		int n;
		int c = 1;
		int serie = 5;
		
		System.out.println("Cantidad de términos: ");
		
		n=7;
		while (c <= n) {
			System.out.println("," + serie);
			serie +=5;
			c++;
		}
	}

}
