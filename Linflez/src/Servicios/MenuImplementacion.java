package Servicios;

import java.util.Scanner;
/**
 * Método que implementa a la interfaz
 * @autor lig - 051223
 */
public class MenuImplementacion implements MenuInterfaz {

	
	public int mostrarMenu(Scanner aka){
		
		int seleccion;
		
		System.out.println("---------------");
		System.out.println("0. Añadir venta");
		System.out.println("1. Añadir gasto");
		System.out.println("2. Mostrar total");
		System.out.println("3. Cerrar aplicación");
		System.out.println("---------------");
		
		seleccion = aka.nextInt();
		return seleccion;
	}
}
