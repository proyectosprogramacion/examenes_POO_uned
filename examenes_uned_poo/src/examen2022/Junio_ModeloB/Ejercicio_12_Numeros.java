package examen2022.Junio_ModeloB;

public class Ejercicio_12_Numeros {

	int n1, n2;

	public void num() {
		n1 = (n1 + 2) % n2;
		System.out.print(n1 + "");
	}

	public void calc() {
		int i = 0;
		n1 = 0;
		n2 = 8;
		while (i++ < n2) {
			num();
		}
	}

	public static void main(String[] args) {
		Ejercicio_12_Numeros nos = new Ejercicio_12_Numeros();
		nos.calc();
	}
}
