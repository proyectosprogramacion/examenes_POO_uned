package examen2014.Septiembre_ModeloD;

import java.util.ArrayList;

public class Ejercicio_9_MusicOrganizer {

	private ArrayList<String> files;

	public Ejercicio_9_MusicOrganizer() {
		files = new ArrayList<String>();
	}

	public void addFile(String filename) {
		files.add(filename);
	}

	public int getNumberOfFiles() {
		return files.size();
	}

	public void listFile(int index) {
		if (index >= 0 && index < files.size()) {
			String filenames = files.get(index);
			System.out.println(filenames);
		}
	}

	public void removeFile(int index) {
		if (index >= 0 && index < files.size()) {
			files.remove(index);
		}
	}

}
