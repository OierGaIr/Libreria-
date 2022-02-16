package modelo;

public class Publicacion {

	private double precio;
	private int numeroDeUnidades;
	
//	contructor vacio
	public Publicacion() {

	}
// 	Constructor con parametros 
	public Publicacion(double precio, int numeroDeUnidades) {
		super();
		this.precio = precio;
		this.numeroDeUnidades = numeroDeUnidades;
	}
// toString del super()
	@Override
	public String toString() {
		return "Publicacion [precio=" + precio + ", numeroDeUnidades=" + numeroDeUnidades + "]";
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getNumeroDeUnidades() {
		return numeroDeUnidades;
	}

	public void setNumeroDeUnidades(int numeroDeUnidades) {
		this.numeroDeUnidades = numeroDeUnidades;
	}

}
