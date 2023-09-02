package examen2019.Septiembre_ModeloB;

public class Ejercicio_2_ClaseC extends Ejercicio_2_ClaseA {

	 private Ejercicio_2_ClaseC() {
		 s += "ClaseC ";
	 }
	 
	 public static void main(String[] args) {
		new Ejercicio_2_ClaseC();
		System.out.println(s);
	}
}
