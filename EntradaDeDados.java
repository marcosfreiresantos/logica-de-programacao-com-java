import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		 * String x; x = sc.next(); System.out.println("A palavra digitada foi: " + x);
		 * 
		 * int y; y = sc.nextInt(); System.out.println("O valor digitado foi: " + y);
		 * 
		 * double z; z = sc.nextDouble(); System.out.println("O valor digitado foi: " +
		 * z);
		 * 
		 * char c; c = sc.next().charAt(0); System.out.println("A letra digitada foi: "
		 * + c);
		 * 
		 * // Digitando os dados na mesma minha no console String a; int b; double d;
		 * 
		 * a = sc.next(); b = sc.nextInt(); d = sc.nextDouble();
		 * 
		 * System.out.println(x); System.out.println(b); System.out.println(d);
		 */

		// Ler um texto até a quebra de linha ou seja ler a linha inteira

		/*
		 * String s1, s2, s3; s1 = sc.nextLine(); s2 = sc.nextLine(); s3 =
		 * sc.nextLine();
		 * 
		 * System.out.println("Todos os dados digitados: "); System.out.println(s1);
		 * System.out.println(s2); System.out.println(s3);
		 */
		// Quebra de linha pendente

		int x;
		String s1, s2, s3;
		x = sc.nextInt();
		sc.nextLine();// Para absorver a quebra de linha
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("Todos os dados digitados: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();
	}

}
