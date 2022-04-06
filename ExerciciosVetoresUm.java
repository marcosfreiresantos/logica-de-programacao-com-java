import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida,
mostrar na tela o maior número do vetor (supor não haver empates). Mostrar também 
a posição do maior elemento.
  
*/
public class ExerciciosVetoresUm {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		double[] vet = new double[n];
		

		for (int i = 0; i < n; i++) {
			vet[i] = sc.nextDouble();
		}

		double maior = vet[0];
		int posicaoMaior = 0;
		
		for (int i = 0; i < n; i++) {
			if (vet[i] > maior) {
				maior = vet[i];
				posicaoMaior = i;
			}
		}

		System.out.printf("%.1f\n", maior);
		System.out.println(posicaoMaior);
		sc.close();

	}

}
