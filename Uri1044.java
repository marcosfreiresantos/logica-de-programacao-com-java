import java.util.Scanner;

/*
 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
 *  "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são 
 *  múltiplos entre si.

Entrada
A entrada contém valores inteiros.

Saída
A saída deve conter uma das mensagens conforme descrito acima.
 */
public class Uri1044 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		if (num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("São Multiplos");
		} else {
			System.out.println("Não são Multiplos");
		}

		sc.close();

	}

}
