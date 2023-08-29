package examen2011.Junio_ModeloB;

public class Ejercicio_5_SuperHotel extends Ejercicio_5_Hotel {

	public void reservar() {
		reservas--;
	}
	
	public void reservar (int size) {
		reservar();
		super.reservar();
		reservas += size;
	}
	
	
	public static void main(String[] args) {

		Ejercicio_5_SuperHotel hotel = new Ejercicio_5_SuperHotel();
		
		hotel.reservar(2);
		System.out.println(hotel.reservas);
		
	}

}
