package examen2014.Septiembre_ModeloD;

public class Ejercicio_14 {
	
	public void removeDetails(String key) {
		if (key = null) {
			throw new IllegalArgumentException("Null key passed to removeDetails");
		}
		if(keyInUse(key)) {
			ContacDetails details = book.get(key);
			book.remove(details.getName());
			book.remove(details.getPhone());
			numberOfEntries--;
		}
		
		assert !keyInUse(Key);
		assert consistentSize() : "Inconsistent book size ";
	}

}
