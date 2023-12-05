package Controladores;

import java.util.Scanner;

import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;
import Servicios.OperacionImplementacion;
import Servicios.OperacionInterfaz;
/**
 * Método principal de nuestra aplicación
 * @autor lig - 051223
 */
public class inicio {
/**
 * Clase principal de nuestra aplicación
 * @autor lig
 */
	public static void main(String[] args) {
		
		Scanner aka = new Scanner(System.in);
	    MenuInterfaz ao = new MenuImplementacion();
		OperacionInterfaz oi = new OperacionImplementacion();
		
		boolean cerrarMenu = false;
		int seleccionUsuario;
		double total = 0;
		while(!cerrarMenu) {
			
			
			seleccionUsuario = ao.mostrarMenu(aka);
			
			switch(seleccionUsuario) {
			
			case 0:
				System.out.println("Has seleccionado la opción 0");
				 total += oi.añadirVenta(aka, seleccionUsuario);
				break;
			case 1:
				System.out.println("Has seleccionado la opción 1");
				 total -= oi.añadirGasto(aka, seleccionUsuario);
				break;
			case 2:
				System.out.println("Has seleccionado la opción 2");
				  oi.mostrarTotal(aka, total);
				break;
			case 3:
				System.out.println("La aplicación se cerrará");
				cerrarMenu = true;
				break;
			default:
				System.out.println("La opción seleccionada no existe, escoja otra.");
				break;
			
			
			
			}
			
			
			
		}
		
		
		
	}
	
}
