import java.util.Locale;
import java.util.Scanner;

public class Uri {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		int a, b, x;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		x = a + b;
		
		System.out.println("X = " + x);
				
		sc.close();
	}

}
