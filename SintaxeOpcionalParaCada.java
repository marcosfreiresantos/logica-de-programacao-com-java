import java.util.Scanner;

/*
 * Fazer um programa para ler o valor N e depois o nome de N pessoas.
 * 
 * Em seguida, mostrar os nomes lidos.
 * 
 */
public class SintaxeOpcionalParaCada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		
		for (int i = 0; i < n; i++) {
			nome[i] = sc.next();
		}
		
		System.out.println("Nomes lidos: ");
		
		for (String s : nome) {
			System.out.println(s);
		}
		
		sc.close();

	}

}











