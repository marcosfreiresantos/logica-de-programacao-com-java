import java.util.Scanner;

/*
Fazer um programa para ler dois números inteiros positivos M e N, depois ler uma
matriz de M linhas e N colunas contendo números inteiros. Em seguida, mostrar na
tela a matriz lida conforme exemplo.
 */
public class matrizes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for (int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		for (int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(mat[i][j] + " ");
			}
			
			System.out.println();
		}
		
		sc.close();
		

	}

}
