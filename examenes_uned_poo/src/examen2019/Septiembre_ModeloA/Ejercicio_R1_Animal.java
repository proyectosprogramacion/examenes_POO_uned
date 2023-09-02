package examen2019.Septiembre_ModeloA;

import java.util.List;

public abstract class Ejercicio_R1_Animal {

	
	private boolean alive;
	private String field;
	private String location;
	
	public abstract Ejercicio_R1_Animal(String fiel, String location) {
		alive = true;
		this.field= field;
		this.location= location;
	}
	
	abstract public void act (List <Ejercicio_R1_Animal> newAnimals);
}
