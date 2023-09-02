package examen2019.Junio_ModeloB;

public class Ejercicio_11_Garaje {

	public static void main(String[] args) {
		
		Ejercicio_11_Vehiculo v= new Ejercicio_11_Moto();
		Ejercicio_11_Moto h = (Ejercicio_11_Moto) v;
	
		System.out.println(v.toString() + " " + h.toString());
	}
}
