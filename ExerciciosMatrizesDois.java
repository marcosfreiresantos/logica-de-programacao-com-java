import java.util.Scanner;

/*
Ler um número N e depois uma matriz quadrada NxN com números inteiros. Depois,
mostrar na tela a soma dos elementos de cada linha da matriz.
 
Entrada:
A entrada contém o número N, depois os dados da matriz.

Saída:
A saída contém os números representando a soma dos elementos de cada linha da matriz.
 */
public class ExerciciosMatrizesDois {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [][] mat = new int[n][n];
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		for (int i=0; i<n; i++ ) {
			int soma = 0;
			for (int j=0; j<n; j++) {
				soma += mat[i][j];
			}
			System.out.println(soma);
		}
		
		sc.close();

	}

}
