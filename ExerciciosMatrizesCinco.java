import java.util.Scanner;

/*
Fazer um programa para ler duas matrizes de números inteiros A e B, contendo de M 
linhas e N colunas cada. Depois, gerar uma terceira matriz C onde cada elemento
desta é a soma dos elementos correspondentes das matrizes originais.
Imprimir na tela a matriz gerada.

Entrada:
A entrada contém os valores de M e N, depois os valores da primeira matriz A, 
depois os valores da segunda matriz B,
conforme exemplo.

Saída:
A saída contém os valores da matriz gerada C, conforme exemplo.
 */
public class ExerciciosMatrizesCinco {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		int[][] a = new int[m][n];
		int[][] b = new int[m][n];

		for (int i=0; i<m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		for (int i=0; i<m; i++) {
			for (int j = 0; j < n; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		
		int[][] c = new int[m][n];
		
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				System.out.println(c[i][j] + " ");
			}
			
			System.out.println();
		}
		
		
		sc.close();
	}

}








