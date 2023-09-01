package examen2015.Septiembre_ModeloC;

import java.util.ArrayList;

public class Ejercicio_5 {
	
	private ArrayList <String> files;
	private Ejercicio_5 player;
	
	private Ejercicio_5() {
		files = new ArrayList <String>();
		player =new Ejercicio_5();
	}
	
	public void startPlayingFile (int index) {
		String filename= files.get(index);
		player.startPlayingFile(filename);
	}
	
	public void stopPlaying() {
		player.stop();
	}
	
}
