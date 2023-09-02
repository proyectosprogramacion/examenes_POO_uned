package examen2019.Junio_ModeloB;

public class Ejercicio_14_Saludar extends Ejercicio_14_Saludo{


	public Ejercicio_14_Saludar(String apellido) {
			System.out.println(" " + apellido);
		}
	}

	public static void main(String[] args) {
		Ejercicio_14_Saludar miSaludo= new Ejercicio_14_Saludar("Juan Latorre");
		System.out.println(" ");
	}
	
	
	
}
