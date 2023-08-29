package examen2012.Junio_ModeloB;

public class Ejercicio_6_TV {

	private String marca;
	private String modelo;

	public Ejercicio_6_TV(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public boolean equals(Object t) {
		Ejercicio_6_TV television = (Ejercicio_6_TV) t;
		return marca.equals(television.marca) && modelo.equals(television.modelo);
	}

	public int hashCode() {
		return marca.length() * 10 + modelo.length();
	}

}
