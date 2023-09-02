package examen2019.Septiembre_ModeloA;

import java.util.List;

public abstract class Ejercicio_9_Animals {
	
	
	public void act (List <Ejercicio_9_Animals> newAnimals, char animals) {}
	
	public static void act (List <Ejercicio_9_Animals> newAnimals, int animals) {};
	
	abstract public static void act (List <Ejercicio_9_Animals> newAnimals, String animals);

}
