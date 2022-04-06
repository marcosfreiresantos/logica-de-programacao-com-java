import java.util.Locale;
import java.util.Scanner;

/*
 Fazer um programa para ler um número inteiro positivo N, depois ler N números
 quaiquer e armazená-los em um vetor. Em seguida, mostrar na tela todos os 
 elementos do vetor.
 
 */
public class Vetores {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[] vet = new double[n];

		for (int i = 0; i < n; i++) {
			vet[i] = sc.nextDouble();
		}
		for (int i = 0; i < n; i++) {
			System.out.printf("%.2f%n", vet[i]);
		}

		sc.close();

	}

}
