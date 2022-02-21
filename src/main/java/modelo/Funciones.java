package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

import controlador.keyboardControl;

public class Funciones {

	public static ArrayList<Publicacion> libreria = new ArrayList<>();
	public static double importeLibros = 0;
	public static double importePeriodicos = 0;

	public static final int NUEVO = 1;
	public static final int VERPUBLICACION = 2;
	public static final int VENTAPERIODICOLIBRO = 3;
	public static final int RECEPCIONPEDIDO = 4;
	public static final int FACTURACION = 5;

	public static void rellenar() {
		Libros l = new Libros();
		l.setAutor("hola");
		l.setEditorial("hola");
		l.setTitulo("geronimo");
		l.setNumeroDeUnidades(5);
		l.setPrecio(10);
		libreria.add(l);
		Periodicos p = new Periodicos();
		p.setFechaDePublicacion(LocalDate.now());
		p.setNombre("correo");
		p.setNumeroDeUnidades(5);
		p.setPrecio(10);
		libreria.add(p);
	}

	public static void menu() {
		int opcion = 0;
		infoMenu();
		System.out.println("Escribe un numero ");
		opcion = keyboardControl.isNumberInt();
		switch (opcion) {
		case NUEVO:
			nuevaPublicacion();
			break;
		case VERPUBLICACION:
			verPublicacion();
			break;
		case VENTAPERIODICOLIBRO:
			ventaPublicaion();
			break;
		case RECEPCIONPEDIDO:
			recepcionPedido();
			break;
		case FACTURACION:
			calcularImporte();
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
		final String PERIODICO = "periodico";
		final String LIBRO = "libro";
		System.out.println("Insertemenos un libro o un periodico");
		System.out.println("Que que tienes para mi?");
		System.out.println("Un libro o un periodico");
		String respuesta = keyboardControl.isStringPL();
		switch (respuesta) {
		case PERIODICO:
			nuevoPeriodico();
			menu();
			break;
		case LIBRO:
			nuevoLibro();
			menu();
			break;
		}
	}

	public static void nuevoPeriodico() {
		Periodicos per = new Periodicos();

		System.out.println(" Nºnidades");
		int unidades = keyboardControl.isNumberInt();
		per.setNumeroDeUnidades(unidades);
		System.out.println(" Nombre");
		String nombre = keyboardControl.isString();
		per.setNombre(nombre);
		System.out.println(" Fecha ");
		LocalDate fecha = LocalDate.now();
		per.setFechaDePublicacion(fecha);
		System.out.println(" precio");
		double precio = keyboardControl.isNumberDouble();
		per.setPrecio(precio);

		libreria.add(per);

	}

	public static void nuevoLibro() {
		Libros lib = new Libros();

		System.out.println(" Titulo ");
		String titulo = keyboardControl.isString();
		lib.setTitulo(titulo);
		System.out.println(" Autor ");
		String autor = keyboardControl.isString();
		lib.setAutor(autor);
		System.out.println(" Editorial");
		String editorial = keyboardControl.isString();
		lib.setEditorial(editorial);
		System.out.println(" Nºnidades");
		int unidades = keyboardControl.isNumberInt();
		lib.setNumeroDeUnidades(unidades);
		System.out.println(" precio");
		double precio = keyboardControl.isNumberDouble();
		lib.setPrecio(precio);

		libreria.add(lib);

	}

	public static void verPublicacion() {

		for (int i = 0; i < libreria.size(); i++) {
			if (libreria.get(i) instanceof Libros || libreria.get(i) instanceof Periodicos) {
				System.out.println(libreria.get(i));
			}

		}
		menu();

	}

	public static void ventaPublicaion() {
		System.out.println("Escribe el titulo o el nombre ");
		String tituloNombre = keyboardControl.isString();
		System.out.println(" Cuantas unidades quieres");
		int unidades = keyboardControl.isNumberInt();
		for (int i = 0; i < libreria.size(); i++) {
			if (libreria.get(i) instanceof Libros) {
				Libros lib = (Libros) libreria.get(i);
				if (lib.getTitulo().equalsIgnoreCase(tituloNombre)) {
					if (lib.getNumeroDeUnidades() < unidades) {
						System.out.println(" NO Tenemos esa cantidad ");
						System.out.println(" elija otra vez: " + "puedes esta cantidad " + "["
								+ lib.getNumeroDeUnidades() + "] " + lib.getTitulo());
						ventaPublicaion();
					} else {

						lib.setNumeroDeUnidades(lib.getNumeroDeUnidades() - unidades);
						System.out.println(lib.toString());
						importeLibros += lib.getPrecio() * unidades;
					}
				}
			} else if (libreria.get(i) instanceof Periodicos) {
				Periodicos per = (Periodicos) libreria.get(i);
				if (per.getNombre().equalsIgnoreCase(tituloNombre)) {
					if (per.getNumeroDeUnidades() < unidades) {
						System.out.println(" NO Tenemos esa cantidad ");
						System.out.println(" elija otra vez: " + "puedes esta cantidad " + "["
								+ +per.getNumeroDeUnidades() + "] " + per.getNombre());
						ventaPublicaion();
					} else {
						per.setNumeroDeUnidades(per.getNumeroDeUnidades() - unidades);
						System.out.println(per.toString());
						importePeriodicos += per.getPrecio() * unidades;
					}
				}
			}
		}
		menu();
	}

	public static void recepcionPedido() {

		System.out.println(" Que pedido recibo? Titulo o Nombre de la publicacion");
		String tituloNombre = keyboardControl.isString();
		System.out.println(" Cuantas unidades quieres");
		int unidadesRecibir = keyboardControl.isNumberInt();
		for (int i = 0; i < libreria.size(); i++) {
			if (libreria.get(i) instanceof Libros) {
				Libros lib = (Libros) libreria.get(i);
				if (lib.getTitulo().equalsIgnoreCase(tituloNombre)) {
					lib.setNumeroDeUnidades(lib.getNumeroDeUnidades() + unidadesRecibir);
					System.out.println(lib.toString());
				}
			} else if (libreria.get(i) instanceof Periodicos) {
				Periodicos per = (Periodicos) libreria.get(i);
				if (per.getNombre().equalsIgnoreCase(tituloNombre)) {
					per.setNumeroDeUnidades(per.getNumeroDeUnidades() + unidadesRecibir);
					System.out.println(per.toString());
				}
			}
		}
		menu();
	}

	public static void calcularImporte() {
		
		double importeTotal = importeLibros + importePeriodicos;
		System.out.println("Importe de los libro : "+ importeLibros +" €");
		System.out.println("Importe de los periodicos : "+ importePeriodicos +" €");
		System.out.println("Importe de las publicacion :"+ importeTotal +" €" );
		menu();
		
	}

}
