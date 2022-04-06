import java.util.Locale;
import java.util.Scanner;

/*
 * fazer um programa que leia um número N, depois nome(apenas uma palavra sem espaços)
 * idade e altura de N pessoas, conforme exemplo.
 * 
 * Depois, mostrar na tela a altura média das pessoas, e mostrar também a porcentagem
 * de pessoas com menos de 16 anos.
 *  
 */
public class ExercicioResQuinze {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		int n = sc.nextInt();

		double soma = 0.0;
		int cont = 0;
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];

		for (int i = 0; i < n; i++) {
			nome[i] = sc.next();
			idade[i] = sc.nextInt();
			altura[i] = sc.nextDouble();
		}

		for (int i = 0; i < n; i++) {
			soma += altura[i];
		}
		
		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				cont++;
			}
		}
		
		double mediaAltura = soma / n;		
		System.out.printf("Altura média: %.2f\n", mediaAltura);
		
		double porcentagemMenor = (double) cont * 100 / n;
		System.out.printf("Pessoas com menos de 16 anos: %.1f %%\n", porcentagemMenor);
		
		
		sc.close();
	}

}
