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

	public static int isNumberInt() {
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
			isNumberInt();
		}
		return numero;
	}

	public static double isNumberDouble() {
		// Comprueba que lo que mete por teclado es un numero
		Scanner sc = new Scanner(System.in);
		boolean isNumber = true;
		double numero = 0;

		try {
			numero = sc.nextDouble();
			isNumber = false;
		} catch (Exception e) {
			System.out.println("Su seleccion no se corresponde a lo que se le ha pedido");
			System.out.println();
			isNumberDouble();
		}
		return numero;
	}

	public static String isStringPL() {
		Scanner sc = new Scanner(System.in);
		String periodico = "periodico";
		String libro = "libro";
		String publicacion = sc.nextLine();
		if (publicacion.equalsIgnoreCase(libro) || publicacion.equalsIgnoreCase(periodico)) {

			return publicacion;

		} else {
			System.out.println("Escribe libro o periodico");
			publicacion = isStringPL();
		}

		return publicacion;
	}

}
