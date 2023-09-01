package examen2015.Junio_ModeloB;

public class Ejercicio_3 {

	int m, n;
	
	public static void main(String[] args) {

	}

	public void f() {
		m = (m + 2) % n;
		System.out.println(m + "");
	}
	
	public void g() {
		int i=0; m=0; n=8;
		while(i++ <n) {
			f();
		}
	}
	
}
