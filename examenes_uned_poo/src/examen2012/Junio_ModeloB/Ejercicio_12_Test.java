package examen2012.Junio_ModeloB;

public class Ejercicio_12_Test {

	
	
	public static void main(String[] args) {

		Ejercicio_12_ClaseUno obj1= new Ejercicio_12_ClaseUno();
		Ejercicio_12_ClaseUno obj2= new Ejercicio_12_ClaseUno(obj1);
		
		obj2.inicializar();
		
		Ejercicio_12_ClaseUno obj3= obj2.obj;
		obj3.inicializar();
		
		Ejercicio_12_ClaseUno obj4= obj1.obj;
		obj4.inicializar();
	}

}
