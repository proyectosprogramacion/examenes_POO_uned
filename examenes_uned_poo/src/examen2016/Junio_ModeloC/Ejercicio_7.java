package examen2016.Junio_ModeloC;

import java.util.List;

public abstract class Ejercicio_7 {

	private boolean alive;
	private String field;
	private String location;
	
	public abstract Ejercicio_7(String field, String location) {
		alive=true;
		this.field=field;
		this.location= location;
	}
	
	abstract public void adc (List<Ejercicio_7> newAnimals);
}
