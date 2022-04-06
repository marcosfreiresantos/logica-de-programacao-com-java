import java.util.Scanner;

/*
Ler dois números M e N, e depois ler uma matriz MxN de números inteiros,
conforme exemplo. Em seguida, mostrar na tela somente os números negativos da matriz.

Entrada:

A entrada contém os números M e N na mesma linha, depois os dados da matriz.

Saída:

A saída contém uma mensagem e depois os números negativos da matriz, conforme exemplo.
 */
public class ExerciciosMatrizesUm {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		int[][] mat = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Valores negativos: ");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					System.out.println(mat[i][j]);
				}
			}
		}

		sc.close();

	}

}
