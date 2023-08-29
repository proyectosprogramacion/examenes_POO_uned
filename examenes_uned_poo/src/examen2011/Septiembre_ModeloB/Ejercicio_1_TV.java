package examen2011.Septiembre_ModeloB;

public class Ejercicio_1_TV {

	private String marca;
	private String modelo;

	public Ejercicio_1_TV(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public boolean equals(Ejercicio_1_TV other) {
		return marca.equals(other.marca) && modelo.equals(other.modelo);
	}

}
