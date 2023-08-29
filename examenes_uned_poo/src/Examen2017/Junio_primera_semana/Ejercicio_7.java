package Examen2017.Junio_primera_semana;

public class Ejercicio_7 {

	private int num;
	
	public Ejercicio_7 (int n) {
		num=n;
	}
	
	public int metodo() {
		int resultado = 10;
		int numero = num;
		if (num>1) {
			while (numero>=1) {
				resultado +=numero;
				numero = numero - 2;
			}
			return resultado;
		}else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		Ejercicio_7 t = new Ejercicio_7(4);
		int v = t.metodo();
		System.out.println(v);
	}

}
