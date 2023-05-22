/*FAZ A TABUADA DE UM VALOR SOLICITADO*/

package exemplos;

import java.util.Scanner;

public class Tabuada {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite o valor que você deseja saber da tabuada :");
			int valor=sc.nextInt();
			
			for (int multiplicador = 1; multiplicador < 11; multiplicador++) {
				System.out.println(valor + " * " + multiplicador + " = "+ valor*multiplicador);
			}
			
			sc.close();

		}

	}