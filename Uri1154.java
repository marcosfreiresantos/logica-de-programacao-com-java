import java.util.Locale;
import java.util.Scanner;

/*

Faça um algoritmo para ler um número indeterminado de dados, contendo cada um,
 a idade de um indivíduo. O último dado, que não entrará nos cálculos, contém o 
 valor de idade negativa. Calcular e imprimir a idade média deste grupo de indivíduos.

Entrada
A entrada contém um número indeterminado de inteiros. A entrada será encerrada
 quando um valor negativo for lido.

Saída
A saída contém um valor correspondente à média de idade dos indivíduos.

A média deve ser impressa com dois dígitos após o ponto decimal.
 */
public class Uri1154 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int soma = 0;
		int cont = 0;

		int idade = sc.nextInt();

		while (idade >= 0) {
			soma += idade;
			cont += 1;
			idade = sc.nextInt();
		}

		double media = (double) soma / cont;
		System.out.printf("%.2f\n", media);

		sc.close();
	}

}
