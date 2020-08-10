package Comercializadora_Libros;

public class Main {

	public static void main(String[] args) {
		Libro lb1 = new Libro("El Principito", 40);
		Libro lb2 = new Libro("La Odisea", 35.5);
			
			CD cd1 = new CD("LOS MAC´S", 5);
			CD cd2 = new CD("THE LIMBOS", 10);
	       
			System.out.println("El valor del libro <El Principito> es  : " + lb1.getPrecio_venta() +  " $ ");
			System.out.println("El valor del libro <La Odisea> es  : "  + lb2.getPrecio_venta() +  " $"); 
			
			System.out.println("                                                 ");
			
			System.out.println("El valor del CD <LOS MAC´S> es  : "+  cd1.getPrecio_venta() +  " $");
	              
			System.out.println("El valor del CD <THE LIMBOS> es  : " +  cd2.getPrecio_venta() +  " $");
		}

	}