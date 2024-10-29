package git;

import java.util.Scanner;

public class git {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Este programa realiza una suma");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce el primer valor: ");
		int valor1 = Integer.parseInt(scanner.nextLine());
		System.out.println("Introduce el segundo valor: ");
		int valor2 = Integer.parseInt(scanner.nextLine());
		
		System.out.println("la suma de "+valor1+" y "+valor2+" es "+(valor1+valor2));
		
	}

}
