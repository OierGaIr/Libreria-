package vista;

import modelo.Funciones;

public class Main {

	public static void main(String[] args) {

		welcome();
		Funciones.rellenar();
		Funciones.menu();

	}
	public static void welcome() {
		
		System.out.println("BIENVENIDO A LA LIBRERIA PEPE");
	}

}
