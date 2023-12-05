package Servicios;

import java.util.Scanner;

/**
 * Método que implementa a la interfaz de la aplicación
 * @autor lig - 051223
 */

public class OperacionImplementacion implements OperacionInterfaz{

	
	public double añadirVenta(Scanner aka, double total) {
		
		double pv;
		System.out.println("Introduzca una nueva venta para añadirla.");
		pv = aka.nextInt();
		total += pv;
		return total;
				
	}
	
    public double añadirGasto(Scanner aka, double total) {
		
		double ag;
		System.out.println("Introduzca un nuevo gasto para añadirlo.");
		ag = aka.nextInt();
		total -= ag;
		return total;
				
	}
	
	public void mostrarTotal(Scanner aka, double total) {
		
		System.out.println(total);
		double numero = 1;
		if(numero <= 0) {
			System.out.println("Vamos mal: " + total);
		
		}else if(numero < 0) {
			
			System.out.println("Vamos muy mal: " + total);
			
		}
	}
	
}
