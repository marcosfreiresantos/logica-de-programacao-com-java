import java.util.Scanner;

/*
Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades.
Depois, mostrar na tela o nome da pessoa mais velha.
 * 
 */
public class ExerciciosVetoresSeis {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		for (int i = 0; i < n; i++) {
			nome[i] = sc.next();
			idade[i] = sc.nextInt();
		}
		
		int pessoaMaisVelha = idade[0];
		int posicaoPessoaMaisVelha = 0;
		
		for (int i = 1; i < n; i++) {
			if (idade[i] > pessoaMaisVelha) {
				pessoaMaisVelha = idade[i];
				posicaoPessoaMaisVelha = i;
			}
		}
		
		System.out.println("Pessoa mais velha: " + nome[posicaoPessoaMaisVelha]);
		
		sc.close();
	}

}









