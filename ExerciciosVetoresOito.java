import java.util.Locale;
import java.util.Scanner;

/*
Tem-se um conjunto de dados contendo a altura e o sexo (M, F) de N pessoas. 
Fazer um programa que calcule e escreva:

****   a maior e a menor altura do grupo
****   a média de altura das mulheres
****   o número de homens
 */
public class ExerciciosVetoresOito {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		double[] altura = new double[n];
		char[] sexo = new char[n];

		for (int i = 0; i < n; i++) {
			altura[i] = sc.nextDouble();
			sexo[i] = sc.next().charAt(0);
		}

		// Menor altura
		double menorAltura = altura[0];
		for (int i = 1; i < n; i++) {
			if (altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
		}

		System.out.printf(" Menor altura = %.2f\n ", menorAltura);

		// Maior altura
		double maiorAltura = altura[0];
		for (int i = 1; i < n; i++) {
			if (altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
		}

		System.out.printf("Maior altura = %.2f\n ", maiorAltura);

		// Altura media das mulheres
		double somaDasAlturasDasMulheres = 0.0;
		for (int i = 0; i < n; i++) {
			if (sexo[i] == 'f') {
				somaDasAlturasDasMulheres += altura[i];
			}
		}

		int quantidadeDeMulheres = 0;
		int quantidadeDeHomens = 0;
		for (int i = 0; i < n; i++) {
			if (sexo[i] == 'f') {
				quantidadeDeMulheres++;
			} else {
				quantidadeDeHomens++;
			}
		}

		double mediaDeAlturaDasMulheres = somaDasAlturasDasMulheres / quantidadeDeMulheres;

		System.out.printf("Media das alturas das mulheres = %.2f\n ", mediaDeAlturaDasMulheres);
		System.out.println("Número de Homens = " + quantidadeDeHomens);

		sc.close();
	}

}
