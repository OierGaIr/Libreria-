package modelo;

import controlador.keyboardControl;

public class Funciones {
	
	public static final int NUEVO = 1;
	public static final int VERPUBLICACION = 2;
	public static final int VENTAPERIODICOLIBRO = 3;
	public static final int RECEPCIONPEDIDO = 4;
	public static final int FACTURACION = 5;

	public static void menu() {
		int opcion = 0;
		infoMenu();
		System.out.println("Escribe un numero ");
		opcion = keyboardControl.isNumber();
		switch (opcion) {
		case NUEVO:

			break;
		case VERPUBLICACION:

			break;
		case VENTAPERIODICOLIBRO:

			break;
		case RECEPCIONPEDIDO:

			break;
		case FACTURACION:

			break;
		default:
			break;
		}

	}

	public static void infoMenu() {
		System.out.println(" Libreria: ");
		System.out.println("1.- NUEVO ");
		System.out.println("2.- VER TODAS LAS PUBLICACIONES");
		System.out.println("3.- VENTA PERIODICO O LIBRO ");
		System.out.println("4.- RECEPCION DE PEDIDO");
		System.out.println("5.- FACTURACION DE LIBROS Y PERIODICOS");
		System.out.println("6.- SALIR ");
	}
	public static void nuevaPublicacion() {
		
		
		
	}
}

