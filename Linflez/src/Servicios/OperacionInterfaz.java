package Servicios;

import java.util.Scanner;

/**
 * Método de la interfaz de la implementación
 * @autor lig - 051223
 */
public interface OperacionInterfaz {
/** 
 * Método que hace la operación y añade una venta
 * @autor lig - 051223
 * @param aka
 * @param total
 * @return
 */
	public double añadirVenta(Scanner aka, double total);
	
	/**
	 * Método que hace la operación y añade un gasto
     * @autor lig - 051223
	 * @param aka
	 * @param total
	 * @return
	 */
	 public double añadirGasto(Scanner aka, double total);
	
	
	
	
	
	/**
	 * Método que muestra el total por patalla
	 * @autor lig - 051223
	 * @param aka
	 * @param total
	 */
	public void mostrarTotal(Scanner aka, double total);
	
}



