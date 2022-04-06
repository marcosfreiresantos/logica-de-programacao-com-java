import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler dois números inteiros M e N. Em seguida, ler uma matriz
de M linhas e N colunas contendo números double. Gerar um vetor de modo que cada
elemento do vetor seja a soma dos elementos da linha correspondente da matriz.
Mostrar o vetor gerado. 
 */
public class ExeciciosResMatrizesDois {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		double[][] mat = new double[m][n];
		
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}
		
		double[] vet = new double[m];
		
		for (int i=0; i<m; i++) {
			double soma = 0.0;
			for (int j=0; j<0; j++) {
				soma += mat[i][j];
			}
			
			vet[i] = soma;
		}
		
		for (int i=0; i<m; i++) {
			System.out.printf("%.1f\n", vet[i]);
		}
		sc.close();
	}

}





