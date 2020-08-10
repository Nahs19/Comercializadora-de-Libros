package Comercializadora_Libros;

public class Libro {
    private String Titulo;
	private String Autor;
	private int Aniopublicacion;
	private String Editorial;
	private int ISBN;
	private double Precio_base;	
	
	public Libro(String Titulo, double Precio_base) {
		super();
		this.Titulo = Titulo;
		this.Precio_base = Precio_base;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String Titulo) {
		this.Titulo = Titulo;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		this.Autor = autor;
	}

	public int getAniopublicacion() {
		return Aniopublicacion;
	}

	public void setAniopublicacion(int aniopublicacion) {
		this.Aniopublicacion = aniopublicacion;
	}

	public String getEditorial() {
		return Editorial;
	}

	public void setEditorial(String editorial) {
		this.Editorial = editorial;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		this.ISBN = iSBN;
	}

	public double getPrecio_base() {
		return Precio_base;
	}

	public void setValor(double Precio_base) {
		this.Precio_base = Precio_base;
	}
	
	public double getPrecio_venta() {
		double Precio_venta = 0;
		double descuento = 0.2;
		double iva = 0.04;
		Precio_venta = Precio_base + (Precio_base*iva) - (Precio_base*descuento);
		
		return Precio_venta;
	}
}