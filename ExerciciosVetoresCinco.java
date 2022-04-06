import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler um vetor de N números inteiros. Em seguida, 
mostrar na tela a média aritmética somente dos números pares lidos.

 */
public class ExerciciosVetoresCinco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] vet = new int[n];
		
		for (int i = 0; i < n; i++) {
			vet[i] = sc.nextInt();
		}
		
		int quantidadeDePares = 0;
		double somaDosPares = 0;
		for (int i = 0; i < n; i++) {
			if (vet[i] % 2 == 0) {
				somaDosPares += vet[i];
				quantidadeDePares++;
			}
		}
		
		if (quantidadeDePares == 0) {
			System.out.println("Não havia nenhum número par");
		} else {
			double media = somaDosPares / quantidadeDePares;
			System.out.printf("%.1f\n", media);
		}
		
		sc.close();
		
		}
		
		
	}
