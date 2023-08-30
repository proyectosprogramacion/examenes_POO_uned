package examen2016.Junio_ModeloB;

import examen2014.Junio_ModeloB.Ejercicio_13;

public class Ejercicio_12 {

	public Ejercicio_12(int hour, int minutes) {
		hours= new NumberDisplay (24);
		minutes= new NumberDisplay (60);
		seconds= new NumberDisplay (60);
		setTime (hour, minute, second);
		this.hour= hour;
		this.minute= minute;
		this.second = 0;

	}
	
	
	public Ejercicio_12(int minute, int second) {
		hours= new NumberDisplay (24);
		minutes= new NumberDisplay (60);
		seconds= new NumberDisplay (60);
		setTime (hour, minute, second);
		this.hour= 0;
		this.minute= minute;
		this.second =second ;

	}
	
}
