package Comercializadora_Libros;

public class CD {
    
    private String Titulo;
	private String Interprete;
	private int Aniopublicacion;
	private double Precio_base;	
	
	public CD(String titulo, double Precio_base) {
		super();
		this.Titulo = titulo;
		this.Precio_base = Precio_base;
		
	}
	
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		this.Titulo = titulo;
	}
	public String getInterprete() {
		return Interprete;
	}
	public void setInterprete(String interprete) {
		this.Interprete = interprete;
	}
	public int getAniopublicacion() {
		return Aniopublicacion;
	}
	public void setAniopublicacion(int aniopublicacion) {
		this.Aniopublicacion = aniopublicacion;
	}
	public double getPrecio_base() {
		return Precio_base;
	}
	public void setPrecio_base(double Precio_base) {
		this.Precio_base = Precio_base;
	} 

	public double getPrecio_venta() {
		double Precio_venta = 0;
		double descuento = 0.1;
		double iva = 0.09;
		Precio_venta = Precio_base + (Precio_base*iva) - (Precio_base*descuento);
		
		return Precio_venta;
		
	}
}