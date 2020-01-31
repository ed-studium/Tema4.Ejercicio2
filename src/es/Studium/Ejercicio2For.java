package es.Studium;

public class Ejercicio2For {
	public static String trianguloNumerico(int filas) {
		String resultado = "";
		for (int i = 1; i <= filas; i++) {
			for (int j = 1; j <= i; j++) {
				resultado += j;
			}
			resultado += "\n";
		}
		return resultado;
	}
}
