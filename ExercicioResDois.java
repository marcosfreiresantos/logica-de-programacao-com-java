/*
Fazer um programa para ler as medidas da base e altura de um retângulo. 
Em seguida, mostrar o valor da área, perímetro e diagonal deste retângulo, com
quatro casas decimais, conforme exemplo;

Entrada:
5.0
4.0

Saída
AREA = 20.0000
PERIMETRO = 18.0000
DIAGONAL = 6.4031

 */
import java.util.Locale;
import java.util.Scanner;


public class ExercicioResDois {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double base = sc.nextDouble();
		double altura = sc.nextDouble();
		
		double area = base * altura;
		//double perimetro = 2.0 * base + 2.0 * altura;
		double perimetro = 2.0 * (base + altura);
		//double diagonal = Math.sqrt(base * base + altura * altura);
		double diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));
		
		System.out.printf("Área = %.4f%n", area);
		System.out.printf("Perimetro = %.4f%n", perimetro);
		System.out.printf("Diagonal = %.4f%n", diagonal);
			
		
		
		sc.close();
		
	

	}

}


















