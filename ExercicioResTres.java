

/*
Fazer um programa para ler o nome(apenas uma palavra) e idade de duas pessoas.
Ao final mostrar uma mensagem com os nomes e a didade média entre as pessoas,
com uma casa decimal, conforme exemplo.

Exemplo:

Entrada-> Maria 19 
Entrada-> Joaquim 20

Saída-> A idade média de Maria e Joaquim é de 19.5 anos
 */

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResTres {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome1 = sc.next();
		int idade1 = sc.nextInt();
		String nome2 = sc.next();
		int idade2 = sc.nextInt();
		
		double media = (double)(idade1 + idade2) / 2;//se o divisor for 2.0 o compilador entende que aguardamos um resultado double.
		
		System.out.printf("A média de idade %s e de %s é de %.2f", nome1, nome2, media);
		
		sc.close();

	}

}
