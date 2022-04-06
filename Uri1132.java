import java.util.Scanner;

/*
 * 
Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma dos números
que não são múltiplos de 13 entre X e Y, incluindo ambos.

Entrada
O arquivo de entrada contém 2 valores inteiros quaisquer, não necessariamente 
em ordem crescente.

Saída
Imprima a soma de todos os valores não divisíveis por 13 entre os dois valores 
lidos na entrada, inclusive ambos se for o caso.
 * 
 */
public class Uri1132 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		int min, max;

		if (x > y) {
			max = x;
			min = y;
		} else {
			max = y;
			min = x;
		}

		int soma = 0;
		for (int i = min; i <= max; i++) {
			if (i % 13 != 0) {
				soma += i;
			}
		}

		System.out.println(soma);

		sc.close();

	}

}
