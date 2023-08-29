package Examen2017.Junio_primera_semana;

public class Ejercicio_6 {

	static String s = " ";

	public static void main(String[] args) {
		try {
			throw new Exception();
		}catch(Exception e) {
			try {
				try {
					throw new Exception();
				}catch(Exception ex) {
					s += "esto ";	
			}catch(Exception x) {	
				s + = "es ";
			}finally{
			s+= "una ";
		}finally {
			s + = "exception";
		 System.out.println(s);
		}
		
		
	}

}
