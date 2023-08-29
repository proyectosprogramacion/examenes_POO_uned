package examen2014.Septiembre_ModeloD;

public class Ejercicio_3 {

	private int valor;

	public Ejercicio_3(int n) {
		valor = n;
	}

	public int calcular() {
		int resultado = 1;
		int numero = valor;

		if (valor >= 1) {
			while (numero >= 1) {
				resultado *= numero;
				numero--;
			}
			return resultado;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		Ejercicio_3 t = new Ejercicio_3(4);

		int v = t.calcular();
		System.out.println(v);
	}

}
