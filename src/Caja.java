package wallet;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collection;
import java.util.Iterator;

public class Caja {
	
	private double saldo;
	private Collection<Item> item = new ArrayList<>();
	protected Scanner kb = new Scanner(System.in);
	
	public Caja(double saldo) {
		this.saldo = saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void definirItem() {
		String nombre;
		double percent;
		
		System.out.print("Ingrese nombre del Item: ");
		nombre = kb.next();
		
		System.out.print("Ingrese porcentaje asignado: ");
		percent = kb.nextDouble();
			if (percent >= 100 || percent < 0) {
				System.out.println("Porcentaje invalido");
			} if (!porcentajeEnCaja(percent)) {
				System.out.println("Los porcentajes en caja exceden el 100%");
			} else {
				Item item = new Item();
				item.setNombre(nombre);
				item.setPorcentaje(percent);
				agregarItem(item);
			}
	}
	
	public void agregarItem(Item item) {
		this.item.add(item);
	}
	
	public void removerItem(String nombre) {
		
		Iterator<Item> itr = this.item.iterator();
		
		while (itr.hasNext()) {
		    Item item = itr.next();

		       if (item.getNombre().equalsIgnoreCase(nombre)) {
		       itr.remove();
		    }

		}
	}
	
	public void listaDeRazones(){
		
		for(final Item razones : this.item) {
			System.out.println(razones);
		}
	}
	
	public void calcularPorcentaje() {
		double result;
		
		for(Item item : this.item) {
			result = (saldo * item.getPorcentaje())/100;
			item.setMontoOptimo(result);
			System.out.println(item.percentString());
		}
		
	}
	
	public boolean porcentajeEnCaja(double porcentaje) {
		double controlador = 0;
		
		for (Item item : this.item) {
			controlador += item.getPorcentaje();
		}
		
		if (controlador + porcentaje > 100) {
			return false;
		} else {
			return true;
		}
		
	}
	
}
