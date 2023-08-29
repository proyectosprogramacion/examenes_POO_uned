package examen2014.Septiembre_ModeloD;

public class Ejercicio_12_Main {

	public static void main(String[] args) {
		Ejercicio_12_Vehiculo v1= new Ejercicio_12_Coche();
		
		Ejercicio_12_Vehiculo v2 = new Ejercicio_12_Vehiculo();
		
		Ejercicio_12_Bicicleta b = new Ejercicio_12_Bicicleta();
		
		Ejercicio_12_Coche c = new Ejercicio_12_Coche();
		
		
		c= (Ejercicio_12_Coche)v1;
		c= (Ejercicio_12_Coche)v2;
		b= (Ejercicio_12_Bicicleta)c;
		b= v2;
		
	}

}
