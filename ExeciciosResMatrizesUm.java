import java.util.Scanner;

/*
Fazer um programa para ler um número inteiro N e uma matriz quadrada de ordem N
contendo números inteiros. Em seguida, mostrar a diagonal principal e a quantidade
de valores negativos da matriz.
 */
public class ExeciciosResMatrizesUm {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}		

		}
		
		System.out.println("Diagonal Principal:");
		
		for (int i=0; i<n; i++) {
			System.out.print(mat[i][i] + " ");
			
		}
		
		System.out.println();
		
		int cont = 0;
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (mat[i][j] < 0) {
					cont += 1;
				}
			}
		}
		
		System.out.println("Quantidade de Negativos: " + cont);
		
		sc.close();

	}

}