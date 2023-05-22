package exemplos;

public class vetor {

	public static void main(String[] args) {
		String[] nome = { "Alexandre", "Brenda", "Carol", "Dara", "Enrique", "Fátima" };

		int[] numeros = { 12, 3, 5, 6, 7 };

		boolean[] metas = { false, true, true, false };

		System.out.println(nome[2]);
		System.out.println(nome[3]+"\n");
		System.out.println(numeros[4] + "\n");

		System.out.println(nome[0] + ", " + nome[1] + ".");

		nome[3] = "Larissa";
		System.err.println(nome[3] + "\n");
		System.out.println(nome.length + "\n");
		System.out.println(numeros.length + "\n");

		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i] );
		}

	}
}
