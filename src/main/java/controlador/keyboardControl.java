package controlador;

import java.util.Scanner;

public class keyboardControl {

	public static String isString() {
		Scanner sc = new Scanner(System.in);
		String String = null;
		try {
			String = sc.next();
		} catch (Exception e) {
			System.out.println("No has introducido una campo valido");
			isString();
		}
		return String;
	}
	
	public static int isNumber() {
		// Comprueba que lo que mete por teclado es un numero
		Scanner sc = new Scanner(System.in);
		boolean isNumber = true;
		int numero = 0;

		try {
			numero = sc.nextInt();
			isNumber = false;
		} catch (Exception e) {
			System.out.println("Su seleccion no se corresponde a lo que se le ha pedido");
			System.out.println();
				isNumber();
		}
		return numero;
	}

	
	
	
}
