import java.util.Locale;
import java.util.Scanner;

/*
Ler uma matriz quadrada de ordem N, contendo números reais. Em seguida, fazer as seguintes ações:
a) calcular e imprimir a soma de todos os elementos positivos da matriz.
b) fazer a leitura do índice de uma linha da matriz e, daí, imprimir todos os elementos desta linha.
c) fazer a leitura do índice de uma coluna da matriz e, daí, imprimir todos os elementos desta coluna.
d) imprimir os elementos da diagonal principal da matriz.
e) alterar a matriz elevando ao quadrado todos os números negativos da mesma. Em seguida imprimir a matriz alterada.

Entrada:
A entrada contém o número inteiro N, seguido dos valores da matriz com uma casa
 decimal cada, seguido do índice de uma linha, seguido do índice de uma coluna, conforma exemplo.

Saída:
A saída contém os valores de saída de cada ação, com uma casa decimal, na ordem em que foram apresentadas no
enunciado, conforme exemplo.
 */
public class ExerciciosMatrizesSeis {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		double[][] mat = new double[n][n];

		// Leitura dos dados de entrada
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}

		// Calculando a soma de todos os números positivos
		double soma = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] > 0.0) {
					soma += mat[i][j];
				}
			}
		}
		System.out.printf("SOMA DOS POSITIVOS: %.1f\n", soma);

		// Realizando a leitura do índice de uma linha da matriz
		// Imprimindo todos os elementos desta linha.

		System.out.print("LINHA ESCOLHIDA: ");

		for (int j = 0; j < n; j++) {
			System.out.print(mat[1][j] + " ");
		}

		System.out.println();

		// Realizando a leitura do índice de uma coluna da matriz e,
		// imprimindo todos os elementos desta coluna.

		System.out.print("COLUNA ESCOLHIDA: ");

		for (int i = 0; i < n; i++) {
			System.out.print(mat[i][2] + " ");
		}

		System.out.println();

		// Imprimindo a diagonal principal da matriz
		System.out.print("DIAGONAL PRINCIPAL: ");

		for (int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
		}

		System.out.println();

		// Alterando a matriz, elevando ao quadrado todos os números negativos da mesma.
		
		System.out.println("MATRIZ ALTERADA: ");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] < 0.0) {
					mat[i][j] = Math.pow(mat[i][j], 2);
				}
			}

		}
		// Imprimindo a matriz alterada
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
