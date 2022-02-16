package modelo;

import java.time.LocalDate;

public class Periodicos extends Publicacion {

	private String nombre;
	private LocalDate fechaDePublicacion;

// Constructor vacio
	public Periodicos() {
		super();
	}
// Constructor con parametros DEL METODO Y DE LA SUPER
	public Periodicos(String nombre, LocalDate fechaDePublicacion, double precio, int numeroDeUnidades) {
		super(precio, numeroDeUnidades);
		this.nombre = nombre;
		this.fechaDePublicacion = fechaDePublicacion;
	}
	// toString con el del super()
	@Override
	public String toString() {
		return  super.toString()+ "Periodicos [nombre=" + nombre + ", fechaDePublicacion=" + fechaDePublicacion + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaDePublicacion() {
		return fechaDePublicacion;
	}

	public void setFechaDePublicacion(LocalDate fechaDePublicacion) {
		this.fechaDePublicacion = fechaDePublicacion;
	}

}
