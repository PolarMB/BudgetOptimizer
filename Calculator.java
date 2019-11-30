package wallet;

import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		
		String operador;
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Bienvenido.");
		System.out.println("Ingrese su presupuesto:");
		Caja caja = new Caja(kb.nextDouble());
		
		do {
			
			System.out.println("Elija una opcion:\n1.Ingresar Item\n2.Remover Items\n3.Lista de Items\n"
					+ "4.Cambiar presupuesto\n5.Ver presupuesto\n6.Calcular Gastos\n7.Salir");
			operador = kb.next();
			
			switch(operador) {
			case "1":
				System.out.println("Introducir Item:\n ");
				caja.definirItem(); 
				break;
			case "2":
				System.out.print("Ingrese item a remover: ");
				caja.removerItem(kb.next());
				break;
			case "3":
				caja.listaDeRazones();
				break;
			case "4":
				System.out.print("Ingrese nuevo presupuesto: ");
				caja.setSaldo(kb.nextDouble());
			case "5":
				System.out.print("Su actual presupuesto es: "+caja.getSaldo());
				break;
			case "6":
				caja.calcularPorcentaje();
				break;
			}
			
			System.out.println("");
			
		} while(!(operador.equals("7")));
		
		System.out.println("Muchas Gracias por usar el servicio");

	}

}
