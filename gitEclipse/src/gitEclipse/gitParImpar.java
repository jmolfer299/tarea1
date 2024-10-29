package gitEclipse;

import java.util.Scanner;

public class gitParImpar {

	public static void main(String[] args) {
		
		System.out.println("Este programa te pide un número y te dice si es par o impar");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int numero = Integer.parseInt(scanner.nextLine());
		
		scanner.close();
		int modulo = numero%2;
		
		if(modulo != 0)
		{
			System.out.println("El número es impar");
		}
		else
		{
			System.out.println("El número es par");
		}

	}

}
