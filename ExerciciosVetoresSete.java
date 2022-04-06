import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas
que eles tiraram no 1º e 2º semestres.
Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir os
nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas
seja maior ou igual a seis.
 */
public class ExerciciosVetoresSete {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String[] nome = new String[n];
		double[] notaPrimeiroSemestre = new double[n];
		double[] notaSegundoSemestre = new double[n];

		for (int i = 0; i < n; i++) {
			nome[i] = sc.next();
			notaPrimeiroSemestre[i] = sc.nextDouble();
			notaSegundoSemestre[i] = sc.nextDouble();
		}

		System.out.println("Alunos Aprovados:");

		for (int i = 0; i < n; i++) {
			double media = (notaPrimeiroSemestre[i] + notaSegundoSemestre[i]) / 2.0;
			if (media >= 6) {
				System.out.println(nome[i]);
			}
		}

		sc.close();
	}

}
