import java.util.Scanner;

/*
Ler um inteiro N e uma matriz quadrada de ordem N. Mostrar a soma dos elementos
acima da diagonal principal.
 
Entrada:
A entrada contém o valor N, depois os dados da matriz.

Saída:
A saída contém a soma dos elementos da diagonal principal.
 */
public class ExerciciosMatrizesQuatro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for (int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int soma = 0;
		for (int i=0; i<n; i++) {
			for (int j=i+1; j<n; j++) {
				soma += mat[i][j];
			}
		}
		
		System.out.println(soma);
		
		
		sc.close();
	}

}








