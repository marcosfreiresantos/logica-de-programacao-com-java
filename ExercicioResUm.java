import java.util.Locale;
import java.util.Scanner;

public class ExercicioResUm {

	public static void main(String[] args) {
	
		/*
		 * Problema:
		 * 
		 * Fazer um programa para ler as medidas da largura e comprimento de um
		 * terreno retangular com uma casa decimal, bem como o valor do metro
		 * quadrado do terreno com duas casas decimais. Em seguida, o programa
		 * deve mostrar o valor da área do terreno, bom como o valor do preço do 
		 * terreno, ambos com duas casas decimais, conforme exemplo:
		 * 
		 * Entrada:
		 * 10.0
		 * 30.0
		 * 200.00
		 * 
		 * Saída:
		 * 
		 * Area: 300.00
		 * Preço = 60000.00		 
		 * 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
				
		System.out.println("Informe a largura do terreno.: ");
		double largura = sc.nextDouble();
		
	    System.out.println("Informe o comprimento do terreno.: ");
	    double comprimento = sc.nextDouble();
		
		System.out.println("Informe o valor do métro quadrado do terreno.: ");
		double valorDoMetroMetroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = valorDoMetroMetroQuadrado * area;
		
		System.out.printf("Area: %.2f\n", area);
		System.out.printf("Preço: %.2f\n", preco);
		
		
		
		sc.close();
		
		
	}

}
