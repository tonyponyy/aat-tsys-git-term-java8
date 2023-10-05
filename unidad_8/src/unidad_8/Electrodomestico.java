package unidad_8;

public class Electrodomestico {
	double PRECIO_BASE_DEFECTO=100;
	String COLOR_DEFECTO ="Blanco";
	String CONSUMO_ENERGETICO_DEFECTO="F";
	double PESO_DEFECTO=5;
	
	double precio_base;
	String color;
	String consumo_energetico;
	double peso;
	
	public  Electrodomestico() {
		this.precio_base=PRECIO_BASE_DEFECTO ;
		this.color= COLOR_DEFECTO;
		this.consumo_energetico= CONSUMO_ENERGETICO_DEFECTO;
		this.peso= PESO_DEFECTO;
	}
	
	public  Electrodomestico(int precio, int peso) {
		this.precio_base=precio ;
		this.color= COLOR_DEFECTO;
		this.consumo_energetico= CONSUMO_ENERGETICO_DEFECTO;
		this.peso= peso;
	}
	
	public  Electrodomestico(int precio, int peso,String color,String consumo_energetico) {
		color = color = color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
		
		this.precio_base=precio ;
		this.color= color;
		this.consumo_energetico= CONSUMO_ENERGETICO_DEFECTO;
		this.peso= peso;
	}
	
	

}
