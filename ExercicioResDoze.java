import java.util.Scanner;

public class ExercicioResDoze {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int min, max;
		int soma = 0;
		
		// Para verificar qual é o valor minimo e máximo
		if (x < y) {
			min = x;
			max = y;
		} else {
			min = y;
			max = x;
		}
		
		for (int i = min + 1; i < max; i++) {
			if (i % 2 != 0) {
				soma += i;
			}
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}
