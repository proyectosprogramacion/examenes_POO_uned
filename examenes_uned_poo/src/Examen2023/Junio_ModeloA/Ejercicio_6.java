package Examen2023.Junio_ModeloA;

public class Ejercicio_6 {

	public static void main(String[] args) {
		int n;
		int c=1;
		int serie= 5;
		System.out.print("Cantidad de términos: ");
		
		n=7;
		while (c<n) {
			System.out.print("," + serie);
			serie +=5;
			c++;
		}
		
		
	}

}
