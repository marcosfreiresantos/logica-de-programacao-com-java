import java.util.Scanner;

/*
Ler um inteiro N e uma matriz quadrada de ordem N. Mostrar qual o maior elemento
 de cada linha. Suponha não haver empates.
 
Entrada:
A entrada contém o número N, depois os dados da matriz.

Saída:
A saída contém os números representando o maior elemento de cada linha da matriz.
*/

public class ExerciciosMatrizesTres {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		
		// Preenchimento da matriz
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		// Verificando o maior número
		
		for (int i=0; i<n; i++) {	
			int numeroMaior = mat[i][0];
			for (int j=0; j<n; j++) {
				if (mat[i][j] > numeroMaior) {
					numeroMaior = mat[i][j];
				}				
			}
			System.out.println(numeroMaior);
		}
		
		
		
		
		
		
		
		sc.close();

	}

}
