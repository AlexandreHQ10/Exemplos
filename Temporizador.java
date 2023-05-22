/*TEMPORIZADOR*/

package exemplos;

public class Temporizador {

	public static void main(String[] args) {

		for (int minutos = 59; minutos > -1; minutos--) {
			for (int segundos = 59; segundos > -1; segundos--) {
				System.out.println(minutos + ":" + segundos);
			}
		}
	}
}