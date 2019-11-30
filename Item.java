package wallet;

public class Item {
	
	private String nombre;
	private double porcentaje;
	private double montoOptimo;
	
	public Item() {
		nombre = "";
		porcentaje = 0;
		montoOptimo = 0;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	public double getPorcentaje() {
		return porcentaje;
	}
	
	public double getMontoOptimo() {
		return montoOptimo;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}
	
	public void setMontoOptimo(double montoOptimo) {
		this.montoOptimo = montoOptimo;
	}
	
	@Override
	public String toString() {
		return "Nombre: "+nombre+". Porcentaje: "+porcentaje+"%.";
	}
	
	public String percentString() {
		return "Para la Razon: "+getNombre()+". El gasto optimo es: "+getMontoOptimo();
	}
	
	
}
