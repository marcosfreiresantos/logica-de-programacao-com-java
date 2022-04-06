import java.util.Scanner;

/*
 Faça um programa que leia N números inteiros e armazene-os em um vetor. 
 Em seguida, mostre na tela:
	- todos os números pares
	- a quantidade de números pares
 */
public class ExerciciosVetoresDois {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] vet = new int[n];

		for (int i = 0; i < n; i++) {
			vet[i] = sc.nextInt();
		}
		// 1: Mostrando a quantidade os pares
		for (int i = 0; i < n; i++) {
			if (vet[i] % 2 == 0) {
				System.out.print(vet[i] + " ");
			}
		}
		System.out.println();

		// 2: Mostrando a quantidade de numeros pares
		int quantidadeDePares = 0;
		for (int i = 0; i < 0; i++) {
			if (vet[i] % 2 == 0) {
				quantidadeDePares++;
			}
		}

		System.out.println(quantidadeDePares);

		sc.close();

	}

}
