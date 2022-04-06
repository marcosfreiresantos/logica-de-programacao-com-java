import java.util.Locale;
import java.util.Scanner;

/*
 * Uma operadora de telefonia cobra R$ 50.00 por um plano básico que
   dá direito a 100 minutos de telefone. Cada minuto que exceder a
   franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
   quantidade de minutos que uma pessoa consumiu, daí mostrar o valor
   a ser pago.
 * 
 */

public class ExercicioResOito {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		

		int quantidadeUtilizada = sc.nextInt();
		
		double precoFranquia = 50.00;

		if (quantidadeUtilizada > 100) {
			precoFranquia += (quantidadeUtilizada - 100) * 2.0;
		}

		System.out.printf("Valor a pagar: %.2f\n", precoFranquia);

		sc.close();

	}
}
