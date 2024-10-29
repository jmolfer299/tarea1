package gitEclipse;

import java.util.Scanner;

public class gitSuma {

	public static void main(String[] args) {
		
		System.out.println("ESTE PROGRAMA REALIZA UNA SUMA");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce el primer valor: ");
		double valor1 = Double.parseDouble(scanner.nextLine());
		System.out.println("Introduce el segundo valor: ");
		double valor2 = Double.parseDouble(scanner.nextLine());
		
		scanner.close();
		double suma = valor1 + valor2;
		
		System.out.println("La suma de "+valor1+" y "+valor2+" es = " +suma);
	}

}
