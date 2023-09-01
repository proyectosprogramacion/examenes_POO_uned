package examen2022.Septiembre_UnicoModelo;

public class Ejercicio_10_Prueba {

	public static void main(String[] args) {
		
		Ejercicio_10_A a= new Ejercicio_10_A();
		Ejercicio_10_B b= new Ejercicio_10_B();
		Ejercicio_10_C c = new Ejercicio_10_C();
		Ejercicio_10_D d = new Ejercicio_10_D();
		
		d= c;
		d= b;
		a= c;
		
		a=d;
		a=b;
		b=a;
		
		
	}
}
