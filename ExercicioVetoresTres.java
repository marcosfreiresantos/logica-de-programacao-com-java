import java.util.Scanner;

/*
 Faça um programa para ler dois vetores A e B, contendo N elementos cada. 
 Em seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos 
 elementos correspondentes de A e B. Imprima o vetor C gerado.
 */
public class ExercicioVetoresTres {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			c[i] = a[i] + b[i];
			
		}
		for (int i = 0; i < n; i++) {
			System.out.println(c[i] + " ");
		}
		System.out.println();
		
		sc.close();
	}

}
