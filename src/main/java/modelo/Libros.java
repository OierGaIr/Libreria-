package modelo;

public class Libros extends Publicacion {

	private String titulo;
	private String autor;
	private String editorial;

// Constructor vacio
	public Libros() {
		super();
		// TODO Auto-generated constructor stub
	}

// Constructor con parametros DEL METODO Y DE LA SUPER
	public Libros(String titulo, String autor, String editorial, double precio, int numeroDeUnidades) {
		super(precio, numeroDeUnidades);
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
	}
// toString con el del super()
	@Override
	public String toString() {
		return super.toString() + "Libros [titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + "]";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

}
