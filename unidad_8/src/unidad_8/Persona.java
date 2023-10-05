package unidad_8;



public class Persona {
	String GENERO_POR_DEFECTO = "H";
	
	private String nombre;
    private int edad;
	private String apellido;
	private String sexo;
	private String DNI;
    private double peso;
    private double altura;

	public Persona() {
		this.nombre="";
		this.edad=0;
		this.apellido="";
		this.sexo=GENERO_POR_DEFECTO;
		this.DNI="";
		this.peso=0;
		this.altura=0;
	}
	
	public Persona(String nombre,Integer edad,String sexo) {
		this.nombre=nombre;
		this.edad=edad;
		this.apellido="";
		this.sexo=sexo;
		this.DNI="";
		this.peso=0;
		this.altura=0;
	}
	
	public Persona(String nombre,Integer edad,String apellido,String DNI,Integer peso,Integer altura) {
		this.nombre=nombre;
		this.edad=edad;
		this.apellido=apellido;
		this.sexo=sexo;
		this.DNI=DNI;
		this.peso=peso;
		this.altura=altura;
	}
	
	
	
}
